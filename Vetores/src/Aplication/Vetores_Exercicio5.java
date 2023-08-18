package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicaomaior;
		
		posicaomaior = 0;
		
		double maiorvalor;
		
		System.out.print("Quantos numeros voce vai digitar?");
				
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		maiorvalor = vetor[0];

		for (int i = 1; i < n; i++) {
			if (vetor[i] > maiorvalor) {
				maiorvalor = vetor[i];
				posicaomaior = i;
			}
		}

		System.out.printf("MAIOR VALOR = %.1f\n", maiorvalor);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaomaior);
		
		
			sc.close();
		}
}
