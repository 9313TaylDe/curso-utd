package exercicios;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		
		System.out.format("Número digitado %d\nAntecessor %d\nSucessor %d",num,antecessor,sucessor);

		sc.close();
	}

}
