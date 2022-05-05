/*
Ler um vetor com 50 numeros. Informar a posicao em que esta o maior numero. Se o maior numero existir
mais de uma vez, informe todas as posicoes onde existir este numero.
*/
import java.util.Scanner;

public class InformaMaiorNumero {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int numeros[] = new int[50];
        int maiorNumero=0;
        System.out.println("Programa para listar os maiores numeros: ");

        for(int i=0;i<50;i++)
        {
            System.out.print("Informe "+(i+1)+"º numero: ");
            numeros[i] = leitorTeclado.nextInt(); 
            if(numeros[i]>maiorNumero)
            {
                maiorNumero=numeros[i];
            }
        }
        
        for(int i=0;i<50;i++)
        {
            if(numeros[i]==maiorNumero)
            {
                System.out.println("O numero "+numeros[i]+" esta na "+(i+1)+"º posição e é o maior numero");
            }
        }

    }
}

