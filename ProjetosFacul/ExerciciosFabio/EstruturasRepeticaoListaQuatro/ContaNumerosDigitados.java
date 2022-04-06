/*
Escreva um programa que receba numeros do usuario enquanto eles forem positivos. No final o programa
deve imprimir quantos numeros foram digitados.
*/

import java.util.Scanner;

public class ContaNumerosDigitados {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero=0,contador=0;
        System.out.println("Programa para verificar quantos nuemros foram digitados!");
        do
        {
            System.out.print("Informe um numero:");
            numero = leitorDoTeclado.nextInt();
            contador++;
        }
        while(numero>0);
        
        System.out.println("Foram digitados "+contador+" numeros");
    }
}
