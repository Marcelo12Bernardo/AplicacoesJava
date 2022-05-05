/*
Apos ler dois vetores de inteiros A e B de tamanho N cada um:
(a) Armazenar em um terceiro vetor ”Soma”, a soma dos elementos do vetor A com os do vetor B (respeitando
as mesmas posicoes) e escrever os elementos deste
(b) Escrever a quantidade de vezes que A e B possuem os mesmos numeros nas mesmas posicoes

*/
import java.util.Scanner;

public class SomaVetores {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0, contNumIguais=0;

        System.out.println("Programa para somar dois vetores!\n");
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = leitorTeclado.nextInt(); 

        int vetorA[] = new int[tamanhoVetor];
        int vetorB[] = new int[tamanhoVetor];
        int vetorSoma[] = new int[tamanhoVetor];
       
        for(int i=0;i<tamanhoVetor;i++)
        {
            System.out.print("Informe o "+(i+1)+"º numero do vetor A: ");
            vetorA[i] = leitorTeclado.nextInt(); 
            System.out.print("Informe o "+(i+1)+"º numero do vetor B: ");
            vetorB[i] = leitorTeclado.nextInt(); 
            vetorSoma[i]=vetorA[i]+vetorB[i];
            if(vetorA[i]==vetorB[i]){contNumIguais++;}
        }
        for(int i=0;i<tamanhoVetor;i++)
        {
            System.out.println((i+1)+"º - "+vetorA[i]+" + "+vetorB[i]+" = "+vetorSoma[i]);
        }
        System.out.print("A e B possuem "+contNumIguais+" numeros iguais e na mesma posicao ");
        
    }
}

