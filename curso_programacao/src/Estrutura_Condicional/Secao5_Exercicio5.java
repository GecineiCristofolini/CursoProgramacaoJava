package Estrutura_Condicional;
import java.util.Locale;
import java.util.Scanner;

public class Secao5_Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int Codigo = sc.nextInt();
		int Quantidade = sc.nextInt();
		
		double Total;
		
	    
		if (Codigo == 1) {
			
			Total = Quantidade * 4.0;
		}	
		else if (Codigo == 2) {
			
			Total = Quantidade * 4.5;
		}	
        else if (Codigo == 3) {
			
			Total = Quantidade * 5.0;
		}	
        else if (Codigo == 4 ) {
			
			Total = Quantidade * 2.0;
		}			
		
        else {
    			Total = Quantidade * 1.5;
    		}

    		System.out.printf("Total: R$ %.2f%n", Total);
			
			
			
		
		
		
		sc.close();
   }
}