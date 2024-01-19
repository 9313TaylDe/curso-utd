package exercicios;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto = 5, novoPreco;
		
		System.out.print("Valor: ");
		preco = sc.nextDouble();
		
		desconto = (preco * desconto) / 100;
		novoPreco = preco - desconto;
		
		System.out.format("O preço que antes era de %.2f, passou a custar %.2f\nDesconto de %.2f",preco, novoPreco, desconto);

		sc.close();
	}

}
