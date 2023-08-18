package Estrutura_Repetitiva;


import java.util.Scanner;

public class Secao6_for_Exercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}
}
