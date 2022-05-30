
/*
* Faca uma funcao que receba um numero e diga se e um numero perfeito. Um numero e perfeito se a soma de
* seus divisores e igual ao proprio numero. Ex: 1+ 2 + 3 = 6, 6 e um numero perfeito.
*/
import java.util.Scanner;
public class VerifivaNumeroPerfeito {
    //******************************************************************//
	public static void main(String[] args) {

		int numero;
		boolean perfeito=true;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Verifica se um numero é perfeito!");

        System.out.print("Informe o numero: ");
        numero = entradaTeclado.nextInt();
        perfeito=verificaNumero(numero);
        if(perfeito==true){
            System.out.println(numero+" É um numero perfeito!");
        }else System.out.println(numero+" Não é um numero perfeito!");
	}
	
	//******************************************************************//
	static boolean verificaNumero(int numero) {
        int i=1, somaDivisores=0;
        

        while(i<numero){
            if((numero%i)==0){
                somaDivisores+=i;
            }
            i++;
        }
        if(somaDivisores==numero){
            return true;
        }else return false;
        
	}	
}
