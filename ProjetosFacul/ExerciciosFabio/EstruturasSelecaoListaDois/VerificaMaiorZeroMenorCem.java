//Construa um programa que indique se um numero digitado esta compreendido 
// no intervalo aberto de 0 a 100 ( 0 e 100 nao estao na faixa de valores).

import java.util.Scanner;
public class VerificaMaiorZeroMenorCem {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero; 

	    System.out.println("Programa para verificar se o esta entre 0 e 100!");
	    System.out.print("Informe o numero: ");
	    numero = leitorDoTeclado.nextInt();

        if((numero>0)&&(numero<100)){ System.out.println(numero+" esta entre 0 e 100!");}
        else System.out.println(numero+" nao esta entre 0 e 100!");
        
	}
}
