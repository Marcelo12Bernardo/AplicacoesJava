/*
Prepare um programa para perguntar o nome e o sexo de 200 pessoas. Voce deve listar primeiro o
nome de todas as mulheres e depois o nome de todos os homens
*/
import java.util.Scanner;

public class ListaHomensMulheres {
    public static void main(String []  args)
    {
        Scanner leitorTeclado =new Scanner(System.in);
        String nome[] = new String[200];
        String sexo[] = new String[200];
        
        System.out.println("Programa para listar todas as mulheres e depois todos os homens: ");

        for(int i=0;i<200;i++)
        {
            System.out.print("Informe "+(i+1)+"º nome: ");
            nome[i] = leitorTeclado.next();
            System.out.print("Informe o sexo F ou M de "+nome[i]+": ");
            sexo[i] = leitorTeclado.next();
        }
        System.out.println("Liasta de mulheres: ");
        for(int i=0;i<200;i++)
        {
            if(sexo[i].equalsIgnoreCase("f"))
            {
                System.out.println((i+1)+"º - "+nome[i]);
            }
        }
        System.out.println("Liasta de Homens: ");
        for(int i=0;i<200;i++)
        {
            if(sexo[i].equalsIgnoreCase("m"))
            {
                System.out.println((i+1)+"º - "+nome[i]);
            }
        }

    }
}

