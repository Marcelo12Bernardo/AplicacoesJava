/*
Escreva um programa para calcular o fatorial do numero N, cujo valor e obtido atraves do usuario
pelo teclado
*/

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numeroN, fatorial=1;

        System.out.println("Programa para calcular o fatorial de N!");

        System.out.print("Informe o numero N: ");
        numeroN = leitorDoTeclado.nextInt();

        for(int i=1;i<=numeroN;i++)
        {
           fatorial=fatorial*i;
        }
        System.out.println(numeroN+"! = "+fatorial);
    }
}
