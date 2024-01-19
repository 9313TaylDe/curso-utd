package exercicios;

import java.util.Scanner;

public class DiaDasMulheres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, sexo;
		double preco, descontoMulher, descontoHomem;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.next();
		
		System.out.print("Qual o seu sexo: ");
		sexo = sc.next().toLowerCase().trim();
		
		System.out.print("Qual o preço: ");
		preco = Double.parseDouble(sc.next());
		
		descontoMulher = (preco * 13) / 100;
		descontoHomem = (preco * 5) / 100;
		
		if(sexo == sexo.toLowerCase() && sexo == "feminino") {
		    System.out.format("%s você recebeu um desconto de %.1f, portanto o valor a ser pago será de %.2f",nome,descontoMulher, preco - descontoMulher);
		}else {
			System.out.format("%s você recebeu um desconto de %.1f, portando o valor pago será de %.2f",nome, descontoHomem, preco - descontoHomem);
		}
		sc.close();
	}

}
