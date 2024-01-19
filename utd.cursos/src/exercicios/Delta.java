package exercicios;

import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, c, d;
		System.out.print("Digite: ");
		c = sc.nextDouble();
		
		System.out.print("Digite: ");
		d = sc.nextDouble();
		
		System.out.print("Digite: ");
		a = sc.nextDouble();
		
		double equa = Math.pow(-a, 2)- 4*c*d;
		
		System.out.print(equa);
		
		sc.close();

	}

}
