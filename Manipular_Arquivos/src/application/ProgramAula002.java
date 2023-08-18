package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.ProductAula002;



public class ProgramAula002 {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.csv";
		
		List<ProductAula002> list = new ArrayList<ProductAula002>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				
				ProductAula002 prod = new ProductAula002(name, price, qte);
				list.add(prod);
				
				line = br.readLine();
			}	
			
			System.out.println("PRODUCTS:");
			for (ProductAula002 p : list) {
				System.out.println(p);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
