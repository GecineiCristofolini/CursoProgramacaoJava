package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

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
		

		Map<String, String> mapa = new HashMap<>();
		

		Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
		
		while (matcher.find()) {
		String[] group = matcher.group().split(":");
		
		

		mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
				 		
		}
		
		Ceps cp = new Ceps();
		cp.setCep(mapa.get("cep").replaceAll("-", ""));
		cp.setLogradouro(mapa.get("logradouro").toUpperCase());
		cp.setComplemento(mapa.get("complemento"));
		cp.setBairro(mapa.get("bairro").toUpperCase());
		cp.setLocalidade(mapa.get("localidade").toUpperCase());
		cp.setUf(mapa.get("uf"));
		cp.setddd(mapa.get("ddd"));
		cp.setIbge(mapa.get("ibge"));
		cp.setGia(mapa.get("gia"));
		
		String tiplog = cp.getLogradouro().split(" ")[0];;
		cp.setTipologradouro(tiplog);
		
		 
		
		System.out.println(cp.toString());
		sc.close();
	}
;
	public static String buscarCep(String cep) {
		String json;

		try {
			URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			json = jsonSb.toString();
			
			

		} catch (Exception e) {
			System.out.println("CEP INVALIDO \n\n\n");
			throw new RuntimeException(e.getMessage());
			
		}

		return json;
	}
    
	
}
