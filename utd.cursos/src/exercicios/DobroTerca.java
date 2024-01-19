package exercicios;

import java.util.Scanner;

public class DobroTerca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num1, dobro, tercaParte;
		
		System.out.print("Digite um número: ");
		num1 = sc.nextInt();
		
		dobro = num1 * 2;
		tercaParte = num1 * 3;
		
		System.out.format("Número digitado: %d\nDobro: %d\nTerça parte: %d", num1, dobro, tercaParte);
		
		
		 sc.close();

	}

}
