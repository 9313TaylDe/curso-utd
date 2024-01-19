package exercicios;

import java.util.Scanner;

public class diasTrabalhados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/***int horaSema = 5, horaDia = 8, horaQuin = 15, horaMens = 30;
		double salario, salarioM,salarioMensa, salarioQuin, horaPaga = 25;
		double mes;
		
		
	
		salario = horaDia * horaPaga;
		salarioM = (horaSema * horaDia) * horaPaga; 
		salarioQuin = (horaQuin * horaDia) * horaPaga;
		salarioMensa = (horaMens * horaDia * horaPaga);
		//salario = horaMes * horaPaga;
		System.out.println("Por dia "+salario);
		System.out.print("\nQuinzena " +salarioQuin);
		System.out.print("\nMensa "+salarioMensa);***/
		
		int horaMensal = 22, horaDia = 8;
		double salario, horaPaga = 25;
		
		int total = horaMensal * horaDia;
		salario = (double) horaMensal * horaPaga;
		
		System.out.println(salario);
		
		sc.close();
	}

}
