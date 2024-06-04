package jsonjava;

import java.io.FileWriter;

import org.json.simple.JSONObject;

public class Teste {
	
	public static void main(String[] args) {

		

		
		FileWriter writeescrever = null;
		//instancia um novo JSONObject
		JSONObject my_obj = new JSONObject();
		my_obj.put("nome", "Gecinei");
		my_obj.put("nome", "Cristofolini");
		my_obj.put("cpf", "00498051935");
		
		System.out.print(my_obj.toJSONString());
	}     
		
}
