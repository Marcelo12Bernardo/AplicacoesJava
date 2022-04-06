/*
Faca um programa que escreva todos os numeros multiplos de 7 entre 1 e N, sendo N um valor 
introduzido pelo usuario. Por exemplos: 7, 14, 21, 28, 35. (Utilizar a estrutura de repeticao for)
*/

import java.util.Scanner;

public class EcreveMultiplosDeSete {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int limiteIntervalo;

        System.out.println("Programa para escrever os numeros multiplos de 7 entre 1 e N!");

        System.out.println("Informe o limite do intervalo:");
        limiteIntervalo = leitorDoTeclado.nextInt();

        for(int i=1;i<=limiteIntervalo;i++)
        {
            if((i%7)==0)
           {
            System.out.println(i);
           }
        }
    }
}
