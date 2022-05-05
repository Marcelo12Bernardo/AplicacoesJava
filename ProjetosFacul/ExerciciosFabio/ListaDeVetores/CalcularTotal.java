/*
Prepare um programa para ler dois vetores, um com o preco e o outro com a quantidade vendida de
500 produtos.
Seu programa devera informar:
(a) O valor arrecadado com cada produto
(b) O valor total arrecadado
*/
import java.util.Scanner;

public class CalcularTotal {
    public static void main(String []  args)
    {
        Scanner leitorTeclado =new Scanner(System.in);
        float precoProduto[] = new float[500];
        int quantProduto[] = new int[500];
        float valorTotal=0;
        System.out.println("Programa para calcular o total arrecadado: ");

        for(int i=0;i<500;i++)
        {
            System.out.print("Informe o preco do "+(i+1)+"º produto: ");
            precoProduto[i] = leitorTeclado.nextFloat(); 
            System.out.print("Informe a quantidade vendida do "+(i+1)+"º produto: ");
            quantProduto[i] = leitorTeclado.nextInt(); 
            valorTotal+=(precoProduto[i]*quantProduto[i]);
        }

        for(int i=0;i<500;i++)
        {
            System.out.println("Com as vendas do "+(i+1)+"º produto foram arrecadados: R$ "+(precoProduto[i]*quantProduto[i]));
        }
        System.out.println("O total arrecadado foi: R$ "+valorTotal);
    }
}
