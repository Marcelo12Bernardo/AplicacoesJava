/*
Escreva um programa que leia 20 numeros inteiros e imprima quantos sao pares e quantos sao ımpares
*/
import java.util.Scanner;

public class VerificaQuantosPares {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero, contPar=0, contImpar=0; 

        System.out.println("Programa para verificar quantos numeros são par e quantos são impar!");
	    
        for(int i=1;i<=20;i++){
            System.out.print("Informe um numero: ");
            numero = leitorDoTeclado.nextInt();
            if((numero%2)==0){ contPar++;}
            else contImpar++;
        }

        System.out.println("Total de numeros PAR: "+contPar);
        System.out.println("Total de numeros IMPAR: "+contImpar);
	}
}
