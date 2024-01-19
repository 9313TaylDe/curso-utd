package exercicios;

import java.util.Scanner;

public class AumentaSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		
		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();
		
		aumento = (salario * 15) / 100;
		
		novoSalario = salario + aumento;
		
		System.out.format("O salário que antes era de R$%.2f, com o aumento de %.2f, passou a ser de R$%.2f", salario, aumento, novoSalario);
		
		sc.close();

	}

}
