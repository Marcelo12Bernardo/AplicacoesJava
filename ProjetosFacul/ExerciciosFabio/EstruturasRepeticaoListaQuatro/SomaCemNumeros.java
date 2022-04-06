/*
 Prepare um programa para perguntar 100 numeros e informar a soma total destes numeros
 (Utilizar a estrutura de repeticao while)
*/

import java.util.Scanner;

public class SomaCemNumeros {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero, somaNumeros=0, controle=1;

        System.out.println("Programa para somar cem numeros!");

        while(controle<=100)
        {
            System.out.printf("Informe o numero "+controle+":");
            numero = leitorDoTeclado.nextInt();
            somaNumeros=somaNumeros+numero;
            controle++;
        }
        System.out.println("A soma dos dez numeross e: "+somaNumeros);
    }
}
