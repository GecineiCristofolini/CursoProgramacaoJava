package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.CurrencyConverter;





public class CotacaoDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");	
		double quant = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(quant, price);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
	
		
		sc.close();

	}

}
