/*
Prepare um programa para ler um vetor com 200 numeros. Depois desta leitura voce deve calcular a
media destes numeros. Seu programa devera informar a posicao e o valor de todos os numeros que
ficaram acima desta media.
*/
import java.util.Scanner;

public class ListaNumerrosAcimaDaMedia {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);

        int numeros[] = new int[200];
        float mediaNumeros=0;
        int totalNumeros=0;
        
        System.out.println("Programa para listar os numeros que estão a cima da media: ");

        for(int i=0;i<200;i++)
        {
            System.out.print("Informe "+(i+1)+"º numero: ");
            numeros[i] = leitorTeclado.nextInt(); 
            totalNumeros+=numeros[i];
        }
        mediaNumeros=totalNumeros/200;

        for(int i=0;i<200;i++)
        {
            if(numeros[i]>mediaNumeros)
            {
                System.out.println("O numero "+numeros[i]+" esta na "+(i+1)+"º posição e é maior do que "+mediaNumeros);
            }
        }

    }
}
