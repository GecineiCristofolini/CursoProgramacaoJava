package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();

		int[] vetor = new int[N];

		for (int i = 0; i < N;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < N; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}

		sc.close();
	}

}
