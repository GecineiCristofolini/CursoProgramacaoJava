package Estrutura_Condicional;
import java.util.Scanner;

public class Secao5_Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int HoraInicial = sc.nextInt();
		int HoraFinal = sc.nextInt();
		int duracao;
	    
		if (HoraInicial < HoraFinal) {
			
			duracao = HoraFinal - HoraInicial;
			
		
		}
		else {
			duracao = 24 - HoraInicial + HoraFinal;
		}

		System.out.println("O Jogo Durou " + duracao+ " Hora(S)");
		
		sc.close();
   }
}