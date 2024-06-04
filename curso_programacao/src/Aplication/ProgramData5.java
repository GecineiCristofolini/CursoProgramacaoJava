package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class ProgramData5 {





	public static void main(String[] args) {
		
		
		
		try {

			String dataembarque =  "12/03/2023";
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date datefor = formatter.parse(dataembarque);
			System.out.println(formatter.format(datefor));
			
			
		
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		Date dataHoraAtual = new Date();
//		String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
//		String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
//		String dataformatada = dataembarque + " 00:00:00";
//		System.out.println(dataformatada);
//        
//		GregorianCalendar emissao = dataembarque ;
//		paramMap.put("dtemissao", NeoCalendarUtils.dateToString(emissao));
//	    
		
	   

	}
	
}	
