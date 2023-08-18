package Estrutura_sequencial;
import java.util.Scanner;

public class Secao4_Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int diferencia = (A*B) - (C*D);
		
		System.out.println("Diferencia= "+ diferencia);
		
		sc.close();

	}

}
