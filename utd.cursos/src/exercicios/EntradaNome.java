package exercicios;

import java.util.Scanner;

public class EntradaNome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		String nome;
		double salario;
		
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		System.out.print("Digite a sua idade: ");
		salario = sc.nextDouble();
		
		System.out.format("Nome: %s\nSalário: %.2f",nome, salario);
		
		sc.close();
	}

}
