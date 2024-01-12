package aulasutd;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //CDRIANDO UM VETOR COM NOTAS QUE EU JA SEI
    int[] notas = {5, 4, 6, 7, 8, 9};
    //System.out.print(notas[2]);

    //CRIANDO UM VETOR COM NOTAS QUE EU NÃO SEI
    int[] notasB = new int[6];

    System.out.printf("Nota1 = %d\nNota2 = %d\nNota3 = %d\nNota4 = %d\nNota5 = %d\nNota6 = %d", notas[0], notas[1], notas[2], notas[3], notas[4], notas[5]);

    System.out.print("\nDigite a primeira nota: ");
    notasB[0] = sc.nextInt();
    System.out.print("Digite a segunda nota: ");
    notasB[1] = sc.nextInt();
    System.out.print("Digite a terceira nota: ");
    notasB[2] = sc.nextInt();
    System.out.print("Digite a quarta nota: ");
    notasB[3] = sc.nextInt();
    System.out.print("Digite a quinta nota: ");
    notasB[4] = sc.nextInt();
    System.out.print("Digite a sexta nota: ");
    notasB[5] = sc.nextInt();

    System.out.printf("Nota 1 = %d\nNota 2 = %d\nNota 3 = %d\nNota = 4 %d\nNota 5 = %d",notasB[0], notasB[1], notasB[2], notasB[3], notasB[4], notasB[5]);
    }
}

//02 - 01 - 2024
