package classemath;

public class Mathe {
    public static void main(String [] args)  {

        //arredondamento
        double numero = 32.5;
        System.out.println(Math.floor(numero)); //arredonda para baixo
        System.out.println(Math.ceil(numero)); //arredonda para cima
        System.out.println(Math.round(numero)); //arredonda para o inteiro
        System.out.println(Math.min(15, 90)); //menor numero 
        System.out.println(Math.round(Math.pow(2, 10))); //potencia
        System.out.println(Math.round((Math.sqrt(124)))); //raiz quadrada
        System.out.println(Math.round(Math.cbrt(27))); //raiz cubica
        System.out.println(Math.round(Math.random() * 25+20)); //numeros aleatorios
    }
}

