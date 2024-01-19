package exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double nota1, nota2, media;
		
		System.out.print("Digite a nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a nota: ");
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2;
		
		System.out.format("A média das notas é %.1f",media);
		
		sc.close();
	}

}
