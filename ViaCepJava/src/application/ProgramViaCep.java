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



import entities.Ceps;

public class ProgramViaCep {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Informe o Cep :");
        
        String cep = sc.nextLine();
        
		String json = buscarCep(cep);
		System.out.println(json);

		Map<String, String> mapa = new HashMap<>();
		
        if (json != null) { 
		Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
		
		while (matcher.find()) {
		String[] group = matcher.group().split(":");
		
		

		mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
				 		
		}
		
		System.out.println(mapa);
		
		Ceps cp = new Ceps();
		String ceps =mapa.get("cep");
		if (ceps == null) {
			System.out.println("Cep Não Encontrado");
		}
		
		else
		{
		cp.setCep(ceps.replaceAll("-", ""));
		String Lougradores = mapa.get("logradouro");
		
		Lougradores = Normalizer.normalize(Lougradores, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		cp.setLogradouro(Lougradores);
		
		cp.setComplemento(mapa.get("complemento"));
		String bairros=(mapa.get("bairro"));
		bairros = Normalizer.normalize(bairros, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		cp.setBairro(bairros);
		String Localidades = mapa.get("localidade");
		Localidades = Normalizer.normalize(Localidades, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		Localidades = Localidades.replaceAll("'", " ");
		cp.setLocalidade(Localidades);
		cp.setUf(mapa.get("uf"));
		cp.setddd(mapa.get("ddd"));
		cp.setIbge(mapa.get("ibge"));
		cp.setGia(mapa.get("gia"));
		String tiplog = cp.getLogradouro().split(" ")[0];
		System.out.println(tiplog.toUpperCase());
		
		String endereco = cp.getLogradouro().toUpperCase().trim();
		
		if(endereco != "" && endereco != null  ) {
		
		int index = endereco.indexOf(" ");
		
		endereco = endereco.substring(index).trim();
		}
		
		 
		
		System.out.println(cp.toString());
		sc.close();
        }
		
		
        }
        
        System.out.println("programa conculido");
	}

	public static String buscarCep(String cep) {
		String json = null;

		try {
			URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			json = jsonSb.toString();
			
			

		} catch (Exception e) {
			System.out.println("cnpj invalido");
		}

		return json;
	}
    
	
}
