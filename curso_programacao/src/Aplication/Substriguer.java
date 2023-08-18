package Aplication;

import java.util.Date;

public class Substriguer {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String atual= new Date().toLocaleString();
		String nome = "gecinei c0ristofolini";
		
		String resultado = atual.toString().substring(0, 10);
		System.out.print(resultado);
		
	}

}
