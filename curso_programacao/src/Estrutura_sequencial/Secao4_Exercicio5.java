package Estrutura_sequencial;
import java.util.Locale;
import java.util.Scanner;

public class Secao4_Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int cod1,cod2,qt1,qt2;
		double vl1,vl2,total;
		
		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		vl1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		vl2 = sc.nextDouble();
		
		total  = (vl1*qt1) + (vl2*qt2);
		
		System.out.printf ("VALOR A PAGAR: R$ %.2f%n",total); 
				
		
		
		sc.close();

	}

}
