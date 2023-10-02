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
import entities.Cnpjs;

public class ProgramViaCnpjs {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Informe o Cnpj :");
        
        String cnpj = sc.nextLine();
        
		String json = buscarCnpj(cnpj);
		


		Map<String, String> mapa = new HashMap<>();
		

		Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
		
		while (matcher.find()) {
			String[] group = matcher.group().split(":");
			
			
	
			mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
			
		System.out.println(mapa);
			
		}
		
		/*Ceps cp = new Ceps();
		cp.setCep(mapa.get("cep"));
		cp.setLogradouro(mapa.get("logradouro"));
		cp.setComplemento(mapa.get("complemento"));
		cp.setBairro(mapa.get("bairro"));
		cp.setLocalidade(mapa.get("localidade"));
		cp.setUf(mapa.get("uf"));
		cp.setddd(mapa.get("ddd"));
		cp.setIbge(mapa.get("ibge"));
		cp.setGia(mapa.get("gia"));*/
		
		 
		
		//System.out.println(cp.toString());
		sc.close();
	}
		
		
		
		
	

public static String buscarCnpj(String cnpj) {
		String json;

		try {
			URL url = new URL("https://publica.cnpj.ws/cnpj/" + cnpj);
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			json = jsonSb.toString();
			
			
			
			
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return json;
	}
    
	
}
