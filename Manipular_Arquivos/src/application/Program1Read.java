package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program1Read {
	public static void main(String[] args) {
		String path = "C:\\Java11\\TesteTI.csv";
		List<String> Lista = new ArrayList<String>();  
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
		while (line != null) {
				System.out.println(line);
				line = br.readLine();
				Lista.add(line);
			}
		
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.println(Lista);
		
		
	}
}