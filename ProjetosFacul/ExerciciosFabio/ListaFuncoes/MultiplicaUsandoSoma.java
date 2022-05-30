/*
*Faca uma funcao que retorne a multiplicacao entre dois numeros usando somente soma.
*/
import java.util.Scanner;

public class MultiplicaUsandoSoma {
    //******************************************************************//
	public static void main(String[] args) {

		int numeroUm, numeroDois, resultado;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Nultiplica dois numeros utilizando soma!");

        System.out.print("Informe o primeiro numero: ");
        numeroUm = entradaTeclado.nextInt();

        System.out.print("Informe o segundo numero: ");
        numeroDois = entradaTeclado.nextInt();
        resultado=somaMultiplicando(numeroUm,numeroDois);
    	System.out.printf("Resultado: %d * %d = %d \n",numeroUm,numeroDois,resultado);
	}
	
	//******************************************************************//
	static int somaMultiplicando(int numeroUm, int numeroDois) {
        int resultadoF=0;
        for(int i=1;i<=numeroUm;i++)
        {

            resultadoF+=numeroDois;
        }
		return resultadoF;
	}	
}
