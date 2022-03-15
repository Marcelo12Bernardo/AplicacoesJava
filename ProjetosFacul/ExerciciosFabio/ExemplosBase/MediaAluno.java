package ExemplosBase;


import java.util.Scanner;

public class MediaAluno {
	public static void main(String[] args) {
		Scanner leitorDoTeclado = new Scanner(System.in);
		float notaDaP1, notaDaP2, mediaDasNotas; // Declaração de variáveis
	    System.out.println("Programa Média!");
	    System.out.print("Entre com a nota da P1:");
	    notaDaP1 = leitorDoTeclado.nextFloat();
	    System.out.print("Entre com a nota da P2:");
	    notaDaP2 = leitorDoTeclado.nextFloat();
	    mediaDasNotas = (notaDaP1 + notaDaP2) / 2;
	    System.out.println("Média do Aluno: " + mediaDasNotas);
	}
}
