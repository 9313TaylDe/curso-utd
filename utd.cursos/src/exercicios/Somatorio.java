package exercicios;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um número: ");
		int num2 = sc.nextInt();
		
		int somatorio = num1 + num2;
		
		System.out.format("A soma de %d + %d = %d",num1,num2,somatorio);
		
		sc.close();

	}

}
