/*
*Criar uma funcao que calcule e retorne o valor do fatorial de um numero. A funcao deve retornar -1 caso seja
*passado um numero negativo. Escreva tambem um programa para testar a funcao.
*/
import java.util.Scanner;

public class CalculaFatorial {
     //******************************************************************//
	public static void main(String[] args) {
		int x, fatorial;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Calcula o fatorial!");
        System.out.print("Informe o numero: ");
        x = entradaTeclado.nextInt();
        fatorial=calculaFatorial(x);
        System.out.printf("Resultado: %d! = %d",x,fatorial);
        
	}
	
	//******************************************************************//
	static int calculaFatorial(int x) {
        int fatorial=1;
        if(x<0){
            return -1;
        }else{
            for(int i=1;i<=x;i++)
            {
                fatorial=fatorial*i;
            }
            return fatorial;
        }
    }
}
