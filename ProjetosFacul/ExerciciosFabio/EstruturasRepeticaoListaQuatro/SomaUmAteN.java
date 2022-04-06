/*
Prepare um programa para calcular a soma dos numeros entre 1 e N inclusive. O valor de N deve ser
perguntado no inıcio do programa. (Utilizar a estrutura de repeticao for)
*/

import java.util.Scanner;

public class SomaUmAteN {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero, somaNumeros=0;

        System.out.println("Programa para somar os numeros de 1 a N!");
        System.out.println("Informe ate que numero deseja somar:");
        numero = leitorDoTeclado.nextInt();

        for(int i=1;i<=numero;i++)
        {
            System.out.println(somaNumeros+"+"+i+"="+(somaNumeros+i));
            somaNumeros=somaNumeros+i;
        }
        System.out.println("A soma dos numeros de 1 ate "+numero+" e: "+somaNumeros);
    }
}
