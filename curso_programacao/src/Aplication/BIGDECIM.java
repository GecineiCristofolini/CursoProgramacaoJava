package Aplication;

import java.math.BigDecimal;
import java.util.Locale;

public class BIGDECIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		BigDecimal aliquotaIpi = new BigDecimal(1340.09);
        
		BigDecimal valormerc = new BigDecimal(1000);
		
		BigDecimal valtot = aliquotaIpi.divide(valormerc);
		
		System.out.println(valtot);
		
		String teste = "carlo &";
		String teste2 = teste.replaceAll("&","#");
		teste2 = teste.replaceAll("#", "&");
		System.out.println(teste2);
		
	}

}
