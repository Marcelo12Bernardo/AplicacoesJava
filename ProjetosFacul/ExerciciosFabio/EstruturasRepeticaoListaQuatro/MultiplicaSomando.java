/*
Faca a multiplicacao entre dois numeros usando somente soma.
(Utilizar a estrutura de repeticao for)
*/

import java.util.Scanner;

public class MultiplicaSomando {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numeroUm, numeroDois, resultado=0;

        System.out.println("Programa para multiplicar dois numeros utilizando soma!");

        System.out.print("Informe o primeiro numero: ");
        numeroUm = leitorDoTeclado.nextInt();

        System.out.print("Informe o segundo numero: ");
        numeroDois = leitorDoTeclado.nextInt();

        for(int i=1;i<=numeroUm;i++)
        {

            resultado=resultado+numeroDois;
        }
        System.out.println(numeroUm+" x "+numeroDois+" = "+resultado);
    }
}
