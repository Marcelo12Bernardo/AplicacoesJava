/*
Escreva um programa que leia 20 numeros e imprima a soma dos positivos e o total de numeros negativos.
*/
import java.util.Scanner;

public class TotalPositivosNegativos {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero, totalPositivos=0, TotalNegativos=0; 

        System.out.println("Programa para calcular o total de numeros negativos e o total de positivos!");
	    
        for(int i=1;i<=20;i++){
            System.out.print("Informe um numero: ");
            numero = leitorDoTeclado.nextInt();

            if(numero<0){TotalNegativos=TotalNegativos+numero;}
            else if(numero>0){totalPositivos=totalPositivos+numero;}
        }

        System.out.println("Total de numeros NEGATIVOS: "+TotalNegativos);
        System.out.println("Total de numeros POSITIVOS: "+totalPositivos);
	}
}
