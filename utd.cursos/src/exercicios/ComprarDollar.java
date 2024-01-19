package exercicios;

import java.util.Scanner;

public class ComprarDollar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double real, dollar;
		System.out.print("Quanto você têm de dinheiro? ");
		real = sc.nextDouble();
		
		dollar = real / 3.45;
		System.out.format("Com R$%.2f, você poderá comprar R$%.2f",real, dollar);
		
		sc.close();

	}

}
