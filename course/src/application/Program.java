package application;

import java.util.Scanner;

import entities.Product;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.println("Enter account number: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Enter account holde: ");
		String name = sc.nextLine();
		System.out.println("");
		
		System.out.println("Is there na initial deposit (y/n)?");
		x = sc.next();
		
		
		
		sc.close();
		
	}

}
