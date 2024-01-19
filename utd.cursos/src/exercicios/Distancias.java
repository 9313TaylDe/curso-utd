package exercicios;

import java.util.Scanner;

public class Distancias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double metros, km, hm, dam, dm, cm, mm;
		
		System.out.print("Digite a ditância edm metros: ");
		metros = sc.nextDouble();
		
		
		km = metros / 1000;
		hm = metros / 100;
		dam = metros/ 10;
		dm = metros * 10;
		cm = metros * 100;
		mm = metros * 1000;
		
		
		System.out.println("Metros em quilometros: " +km+" km");
		System.out.println("Metros em hectares: " +hm+" hec");
		System.out.println("Metros em decametro: " +dam+" dam");
		System.out.println("Metros em decimetros: " +dm+" dm");
		System.out.println("Metros em centimetros: "+cm+" cm");
		System.out.println("Metros em milimetros: "+mm+" mm");
		
		sc.close();

	}

}
