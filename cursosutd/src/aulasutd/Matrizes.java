package aulasutd;

public class Matrizes { 
    public static void main(String[] args) {
        String[][] notas = new String[3][2];

        notas[0][0]= "Taylor";
        notas[0][1] = "10";

        notas[1][0]= "Expedito";
        notas[1][1] = "9";
        
        notas[2][0]= "Paulo";
        notas[2][1] = "7";

        System.out.print("Nome\t Nota ");
        System.out.printf("\n%s   %s\n",notas[0][0], notas[0][1]);
        System.out.printf("%s  %s\n",notas[1][0], notas[1][1]);
        System.out.printf("%s    %s\n",notas[2][0], notas[2][1]);

        //MATRIZ PRECISA DE DADOS COMPLEXOS
        //UIM VETOR É UMA MATRIZ DE UMA DIMENSÃO
        //UMA MATRIZ TEM DUAS DIMENSÕES
    
}

}
