package desafiosutd;

import java.util.Scanner;

public class MaiordeTres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.print("O primeiro número digitado é o maior dos três " + num1);
        }
        if(num2 > num1 && num2 > num3) {
            System.out.print("O segundo número digitado é o maior dos três "  + num2);
        }
        if(num3 > num2 && num3 > num2) {
            System.out.print("O terceiro número digitado é o maior dos três " + num3);
        }

        //USANDO O OPERADOR TERNARIO
        int maximo;
        maximo = (num1 > num2) ? (num1 > num2? num1 : num3) : ( num2 > num3 ? num2 : num3);
        System.out.print("\nO resultado do operador ternario é: " + maximo);
    }
}
