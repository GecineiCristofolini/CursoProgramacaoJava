package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import entities.Cnpjs;




public class ProgramViaCnpjs2  {
	
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Informe o Cnpj :");
        
        String cnpj = sc.nextLine();
        
		String json = buscarCnpj(cnpj);
		 
		 json = json.replaceAll("\\{\"nome\":", "socios");
		 System.out.println(json);	
		
		Map<String,String> mapa = new HashMap<>();
		
		
		Matcher matcher = Pattern.compile("\"\\w*?\": \".*?\"").matcher(json);
		
		
		boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	     	    	
	        
	    while (matcher.find()) {
			String[] group = matcher.group().split(":");
			
			

			mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
					 		
	    }
	    
	   /* String Jsoncidade = json.replaceAll("\"", "").trim();
	    System.out.println(Jsoncidade);
	    System.out.println(mapa);
	    
	    /*int begin = Jsoncidade.indexOf("tipo:");
	    int end = Jsoncidade.lastIndexOf(",");
	    Jsoncidade = Jsoncidade.substring(begin, end);
	    System.out.println(Jsoncidade);*/
	    /*Map<String,String> mapacid = new HashMap<>();
	    	   
	    String[] vetor = Jsoncidade.split("[");
	    for ( String s : vetor) {
	    	System.out.println(s);
			//String[] group =s.split(":");
			
			//mapacid.put(group[0].trim(), group[1].trim());
			
	    }

		System.out.println(mapacid); */
		
		
		/* Cnpjs pj = new Cnpjs();

        pj.setCnpj(mapa.get("cnpj").trim().replaceAll("\\D", ""));
        pj.setRazao_social(mapa.get("nome"));
		  pj.setNome_fantasia(mapa.get("nome_fantasia"));
		  if (pj.getNome_fantasia() == null) {

			pj.setNome_fantasia(pj.getRazao_social());

		  }
		  
		  String number = mapa.get("numero").replace(".", "");
		  number = number.replaceAll("\\D", "").trim();
        if (number.equals("")){
			number = "0";
		  } 
        pj.setNumero(number);
        
        long lnumero = Long.parseLong(pj.getNumero());

        pj.setCep(mapa.get("cep"));
       
        pj.setComplemento(mapa.get("complemento"));
        if (pj.getComplemento() == null) {
			pj.setComplemento(" ");
		  }

		  String cidade = mapa.get("nome").toUpperCase();
		  cidade = Normalizer.normalize(cidade, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		  pj.setCidade(cidade);
        pj.setEstado(mapa.get("sigla"));



		  String bairro = mapa.get("bairro").toUpperCase();
		  bairro = Normalizer.normalize(bairro, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        pj.setBairro(bairro);
        pj.setTipologradouro(mapa.get("tipo_logradouro"));
        
        String logradouro = mapa.get("logradouro").toUpperCase();
        logradouro  = Normalizer.normalize(logradouro, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        pj.setLogradouro(logradouro);


		  pj.setInscricao_estadual(mapa.get("inscricao_estadual"));
		  if (pj.getInscricao_estadual() == null) {

			pj.setInscricao_estadual("ISENTO");

		  }

		  pj.setSitucao(mapa.get("situacao_cadastral"));

		  System.out.println(pj.toString());*/
			
		
		sc.close();	
		}
		
		
		
		
	
		
		
		
		
	



public static String buscarCnpj(String cnpj) {
		String json = null;

		try {
			URL url = new URL("https://receitaws.com.br/v1/cnpj/" + cnpj);
			
			//URL url = new URL("https://publica.cnpj.ws/cnpj/" + cnpj);
			
			
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
								
			StringBuilder jsonSb = new StringBuilder();
			
			
			
          
			br.lines().forEach(l -> jsonSb.append(l.trim()));
			
			
			
	        json= jsonSb.toString();
	        
	        
	      
			
			
		} catch (Exception e) {
			 System.out.println("CNPJ NAO ENCONTRADO");;
		}

		return json;
	}
    
	
}
