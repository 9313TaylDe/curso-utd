package desafiosutd;

public class MaiordeDois {
    public static void main(String[] args) {

        int numero = 360, numero2 = 100;

        int maior = ((numero + numero2) + Math.abs(numero - numero2))/2;

        System.out.print(":"+maior);
    }
}
