package Estrutura_Repetitiva;
import java.util.Scanner;

public class Secao6_While_Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int chave = 2002;
		
		
		while (senha != chave) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
