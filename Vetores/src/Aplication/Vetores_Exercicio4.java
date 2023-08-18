package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdpares;
		
		qtdpares = 0;
		
		System.out.print("Quantos numeros voce vai digitar?");
				
		n = sc.nextInt();

		int[] vetor = new int[n];
		

		for (int i = 0; i < n; i++) {
			
			System.out.printf("Digite um numero:");
			vetor[i] = sc.nextInt();
			
		}
		
		System.out.println("\nNUMEROS PARES:");
		
        for (int i = 0; i < n; i++) {
        	
        	if (vetor[i] % 2 == 0 ) {
        		
        		System.out.printf("%d  ", vetor[i]);
        		qtdpares++;
			
        	}	
		
			
		}
        
        System.out.printf("\nQUANTIDADE DE PARES = %d\n", qtdpares);
		
		
		
		
			sc.close();
		}
}
