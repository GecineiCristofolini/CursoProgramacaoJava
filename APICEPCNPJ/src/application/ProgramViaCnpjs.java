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

		Matcher matcher = Pattern.compile("\"\\w*?\":\".*?\"").matcher(json);

		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}

		while (matcher.find()) {
			String[] group = matcher.group().split(":");

			mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());

		}

		Cnpjs pj = new Cnpjs();
		pj.setRazao_social(mapa.get("razao_social"));
		pj.setNome_fantasia(mapa.get("nome_fantasia"));
		if (pj.getNome_fantasia() == null) {

			pj.setNome_fantasia(pj.getRazao_social());

		}
		pj.setTipo_logradouro(mapa.get("tipo_logradouro"));
		pj.setLogradrouro(mapa.get("logradouro"));
		pj.setCep(mapa.get("cep"));
		pj.setEstado(mapa.get("sigla"));
		pj.setNumero(mapa.get("numero"));
		pj.setBairro(mapa.get("bairro"));
		pj.setInscricao_estadual(mapa.get("inscricao_estadual"));
		if (pj.getInscricao_estadual() == null) {

			pj.setInscricao_estadual("ISENTO");

		}

		pj.setSitucao(mapa.get("situacao_cadastral"));

		System.out.println(pj.toString());
		
		String CepCNPJ = pj.getCep();
		
		
		
        String jsoncep = buscarCep(CepCNPJ);
		
     

		Map<String, String> mapacep = new HashMap<>();
		

		Matcher matchercep = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(jsoncep);
		
		while (matchercep.find()) {
		String[] groupcep = matchercep.group().split(":");
		
		

		mapacep.put(groupcep[0].replaceAll("\"", "").trim(), groupcep[1].replaceAll("\"", "").trim());
				 		
		}
		
		Ceps cp = new Ceps();
		cp.setCep(mapacep.get("cep").replaceAll("-", ""));
		cp.setLogradouro(mapacep.get("logradouro").toUpperCase());
		cp.setComplemento(mapacep.get("complemento"));
		cp.setBairro(mapacep.get("bairro").toUpperCase());
		cp.setLocalidade(mapacep.get("localidade").toUpperCase());
		cp.setUf(mapacep.get("uf"));
		cp.setddd(mapacep.get("ddd"));
		cp.setIbge(mapacep.get("ibge"));
		cp.setGia(mapacep.get("gia"));
		
		System.out.println(cp.toString());

		sc.close();
	}

	@SuppressWarnings("unused")
	public static String buscarCnpj(String cnpj) {
		String json;

		try {
			

			URL url = new URL("https://publica.cnpj.ws/cnpj/" + cnpj);

			if (url == null) {
				throw new IOException("N�o foi poss�vel conectar com o servi�o de consulta de CNPJ receitaws");
			}

			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			json = jsonSb.toString();

		} catch (Exception e) {
			System.out.println("CNPJ INVALIDO \n\n\n");
			throw new RuntimeException(e);
		}

		return json;
	}
	
	public static String buscarCep(String CepCNPJ) {
		String jsoncep;

		try {
			URL url = new URL("http://viacep.com.br/ws/" + CepCNPJ + "/json");
			URLConnection urlConnection = url.openConnection();
			InputStream is = urlConnection.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			StringBuilder jsonSb = new StringBuilder();

			br.lines().forEach(l -> jsonSb.append(l.trim()));

			jsoncep = jsonSb.toString();
			
			

		} catch (Exception e) {
			System.out.println("CEP INVALIDO \n\n\n");
			throw new RuntimeException(e);
		}

		return jsoncep;
	}

}
