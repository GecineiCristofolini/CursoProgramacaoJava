package applicationgenerics;

import java.util.Scanner;

import servicegenerics.PrintServiceGenerics;


public class ProgramGenerics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintServiceGenerics<Integer> ps = new PrintServiceGenerics<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}
