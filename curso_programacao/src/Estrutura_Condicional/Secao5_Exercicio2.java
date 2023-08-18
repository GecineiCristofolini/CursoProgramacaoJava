package Estrutura_Condicional;
import java.util.Scanner;

public class Secao5_Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}

		sc.close();
   }
}