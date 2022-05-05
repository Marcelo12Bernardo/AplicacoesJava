/*
Prepare um programa para ler o nome de 50 pessoas e lista-los na ordem inversa de entrada.
*/
import java.util.Scanner;

public class ListaNomesNaOrdemInversa {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        String nomes[] = new String[50];
        
        System.out.println("Programa para listar os nomes na ondem contraria: ");
        for(int i=0;i<50;i++)
        {
            System.out.print("Informe o nome: ");
            nomes[i] = leitorTeclado.next();   
        }
        System.out.println("Lista dos nomes na ondem contraria: ");

        for(int i=49;i>=0;i--)
        {
            System.out.println(nomes[i]);
        }

    }
}
