package exercicios;

import java.util.Scanner;

public class Locadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double kmRodados, precoTotalKm;
		double diaAluguel, precoTotal, precoaPagar;
		
		System.out.print("Quantos dias de aluguel do carro? ");
		diaAluguel = sc.nextInt();
		
		System.out.print("Quantos kilometros rodados? ");
		kmRodados = sc.nextInt();
		
		precoTotal = diaAluguel * 90;
		precoTotalKm = kmRodados * 0.20;
		precoaPagar = precoTotal + precoTotalKm;
		
		System.out.print("Preço total dos dias alugdos: " + precoTotal);
		System.out.print("\nPreço total dos kilometros: "+precoTotalKm);
		System.out.println("\nPreço total de tudo a pagar: "+precoaPagar);
		
		sc.close();
	}

}
