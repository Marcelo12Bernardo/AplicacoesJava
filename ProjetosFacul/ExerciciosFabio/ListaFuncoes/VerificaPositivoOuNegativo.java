/*
 *   Faca um programa, com uma funcao que necessite de um argumento. A funcao retorna o valor de caractere ‘P’,
 *   se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo
*/
import java.util.Scanner;
public class VerificaPositivoOuNegativo {
    //******************************************************************//
	public static void main(String[] args) {

		int numero;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
    	numero = entradaTeclado.nextInt(); 
    	if(VerificaTipo(numero)=='N'){
            System.out.println("Numero negativo!");
        }else System.out.println("Numero Positivo!");
    	
	}
	
	//******************************************************************//
	static char VerificaTipo(int num) {
        
        if(num<=0){
            return 'N';
        }else return 'p';
	}	
}
