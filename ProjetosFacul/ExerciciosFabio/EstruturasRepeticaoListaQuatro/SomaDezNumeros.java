/*
 Prepare um programa para perguntar 10 numeros e informar a soma total destes numeros
 (Utilizar a estrutura de repeticao for)
*/

import java.util.Scanner;

public class SomaDezNumeros {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero, somaNumeros=0;

        System.out.println("Programa para somar dez numeros!");
        for(int i=1;i<=10;i++)
        {
            System.out.println("Informe o numero "+i+":");
            numero = leitorDoTeclado.nextInt();
            somaNumeros=somaNumeros+numero;
        }
        System.out.println("A soma dos dez numeross e: "+somaNumeros);
    }
}
