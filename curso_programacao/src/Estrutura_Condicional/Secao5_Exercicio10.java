package Estrutura_Condicional;
import java.util.Locale;
import java.util.Scanner;

public class Secao5_Exercicio10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("valor "+ desconto);
		sc.close();
	}
}
