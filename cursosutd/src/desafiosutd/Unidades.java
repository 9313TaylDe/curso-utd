package desafiosutd;

import java.util.Scanner;

public class Unidades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Digite o seu numero: ");
		numero = Integer.parseInt(sc.nextLine());
		int n1 = (numero % 10);
		int n2 = (numero / 10)%10;
		int n3 = (numero / 100)%10;
		int n4 = (numero / 1000)%10;
		
		System.out.format("Unidades: %d\n",n1);
		System.out.format("Dezenas: %d", n2);
		System.out.format("\nCentenas: %d\n", n3);
		System.out.format("Milhar: %d", n4);
	}

}
