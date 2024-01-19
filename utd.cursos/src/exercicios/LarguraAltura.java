package exercicios;

import java.util.Scanner;

public class LarguraAltura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double largura, altura, litros;
		
		System.out.print("Digite a altura:");
		altura = sc.nextDouble();
		
		System.out.print("Digite a largura:");
		largura = sc.nextDouble();
		
		litros = (altura * largura)/2;
		
		System.out.format("Litros necessários para pintar: %.2f", litros);
		
		sc.close();
	}

}
