/*
Prepare um programa para somar os numeros compreendidos entre 1 e 1000.
(Utilizar a estrutura de repeticao for)
*/

import java.util.Scanner;

public class SomarNumeroUmMil {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int  somaNumeros=0;

        System.out.println("Programa para somar os numeros de 1 a 1000!");
        for(int i=1;i<=1000;i++)
        {
            System.out.println(somaNumeros+"+"+i+"="+(somaNumeros+i));
            somaNumeros=somaNumeros+i;
        }
        System.out.println("A soma dos numeross de 1 a 1000 e: "+somaNumeros);
    }
}
