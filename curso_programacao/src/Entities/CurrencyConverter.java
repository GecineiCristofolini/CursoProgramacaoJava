package Entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal(double quant, double price) {
		return quant *  price * (1.0 + IOF);
		}

}
