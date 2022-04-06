/*
Criar um programa que leia os limites inferior e superior de um intervalo e imprima todos os numeros
pares no intervalo aberto e seu somatorio.Suponha que os dados digitados sao para um intervalo crescente,
ou seja, o primeiro valor e menor que o segundo.
*/
import java.util.Scanner;

public class ImprimeNumerosParesNoIntervalo {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int inicioIntervalo, fimIntervalo;

        System.out.println("Programa para escrever os numeros paras de N a N2!");

        System.out.println("Informe o limite inferior do intervalo: ");
        inicioIntervalo = leitorDoTeclado.nextInt();
        System.out.println("Informe o limite superior do intervalo: ");
        fimIntervalo = leitorDoTeclado.nextInt();
        
        for(int i=inicioIntervalo;i <= fimIntervalo;i++)
        {
           if((i%2)==0)
           {
            System.out.println(i);
           }
        }
    }
}
