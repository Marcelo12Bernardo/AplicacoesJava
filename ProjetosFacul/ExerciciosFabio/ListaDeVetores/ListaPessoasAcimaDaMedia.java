/*
Prepare um programa para ler o nome e a idade de 30 pessoas. Apos a leitura dos dados o programa
devera informar o nome de todas as pessoas que ficarem acima da media de idades.
*/
//Usar constantes
//Usar nextLine

import java.util.Scanner;

public class ListaPessoasAcimaDaMedia {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        final int QUANTIDADE_DE_PESSOAS=30;
        int idades[] = new int[QUANTIDADE_DE_PESSOAS];
        String nomes[] = new String[QUANTIDADE_DE_PESSOAS];
        float mediaIdades=0;
        int totalIdades=0;
        System.out.println("Programa para listar as pessoas que estão a cima da media de idade: ");

        for(int i=0;i<QUANTIDADE_DE_PESSOAS;i++)
        {
            System.out.print("Informe "+(i+1)+"º nome: ");
            nomes[i] = leitorTeclado.nextLine();  
            System.out.print("Informe a idade de "+nomes[i]+" : ");
            idades[i] = leitorTeclado.nextInt(); 
            leitorTeclado.nextLine();
            totalIdades+=idades[i];
        }
        
        mediaIdades=totalIdades/QUANTIDADE_DE_PESSOAS;
        System.out.print("\n");
        for(int i=0;i<QUANTIDADE_DE_PESSOAS;i++)
        {
            if(idades[i]>mediaIdades)
            {
                System.out.println(nomes[i]+" possui "+idades[i]+" anos e esta acima da media de idades, que é: "+mediaIdades);
            }
        }
    }
}

