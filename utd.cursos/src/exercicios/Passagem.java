package exercicios;

import java.util.Scanner;

public class Passagem {

	public static void main(String[] args) {
		//Faça um algoritmo que pergunte a distância que um passageiro deseja
		//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
		//viagens até 200Km e R$0.45 para viagens mais longas.
		
		Scanner sc = new Scanner(System.in);
		double[] valor = {0.50, 0.45};
		int distancia;
		
		System.out.print("Qul a sua parada? ");
		String parada = sc.next();
		
		System.out.print("Qul a sua distância? ");
		distancia = sc.nextInt();
		
		if(distancia <= 200) {
			System.out.format("O valor a ser pago será de %.2f", distancia * valor[0]);
		}if(distancia >= 201) {
			System.out.format("O valor a ser pago será de %.2f",distancia * valor[1]);
		}
		
		sc.close();
		
	}

}
