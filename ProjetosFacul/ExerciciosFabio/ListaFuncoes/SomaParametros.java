//Faca um programa, com uma funcao que necessite de tres argumentos, e que forneca a soma desses tres argumentos
import java.util.Scanner;

public class SomaParametros {
	//******************************************************************//
	public static void main(String[] args) {

		int primeiroNumero, segundoNumero, terceiroNumero, soma;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numreo: ");
    	primeiroNumero = entradaTeclado.nextInt(); 
    	System.out.print("Entre com o segundo numreo: ");
    	segundoNumero = entradaTeclado.nextInt();
        System.out.print("Entre com o terceiro numreo: ");
    	terceiroNumero = entradaTeclado.nextInt();
    	soma=SomaTresArgumentos(primeiroNumero,segundoNumero,terceiroNumero);
    	System.out.printf("Resultado: %d + %d + %d = %d \n",primeiroNumero,segundoNumero,terceiroNumero,soma);
	}
	
	//******************************************************************//
	static int SomaTresArgumentos(int primeiroNumero, int segundoNumero,int terceiroNumero) {
        int sum=primeiroNumero+segundoNumero+terceiroNumero;
		return sum;
	}	
}