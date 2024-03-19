package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;


public class Program {
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter calculator = new CurrencyConverter();
		
		System.out.println("What is the dollar price?");
		calculator.dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		calculator.valor = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", calculator.imposto());
		
		sc.close();
	}
}
