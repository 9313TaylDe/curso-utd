package exercicios;
import java.util.Scanner;

public class CalcularDiasRestantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantosCigarros, anoInicio, tempo;
		
		System.out.print("Quantos cigarros por dia: ");
		quantosCigarros = sc.nextInt();
		
		System.out.print("Quantidade ded anos fumando: ");
		anoInicio = sc.nextInt();
		
		tempo = anoInicio * 365 * quantosCigarros * 10;
		int reducaoEmDias = tempo / (24 * 60);
		
		System.out.println(reducaoEmDias);
		
		sc.close();
	}

}
