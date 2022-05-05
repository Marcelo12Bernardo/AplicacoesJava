/*
Faca um programa que leia 20 elementos de um vetor A e construa um vetor B com os mesmos elementos
de A, sendo que estes deverao estar invertidos, ou seja, o primeiro elemento de A passa a ser o 
ultimo de B, o segundo de A passa a ser o penultimo de B e assim por diante

*/
import java.util.Scanner;

public class InverteVetores {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);

        System.out.println("Programa para inverter um vetor!\n");
        
        int vetorA[] = new int[20];
        int vetorB[] = new int[20];
        
        for(int i=0;i<20;i++)
        {
            System.out.print("Informe o "+(i+1)+"º numero do vetor A: ");
            vetorA[i] = leitorTeclado.nextInt(); 
            vetorB[19-i]=vetorA[i];
        }
        for(int i=0;i<20;i++)
        {
            System.out.println((i+1)+"º - A: "+vetorA[i]+"\t"+(i+1)+"º - B: "+vetorB[i]);
        }  
        
    }
}

