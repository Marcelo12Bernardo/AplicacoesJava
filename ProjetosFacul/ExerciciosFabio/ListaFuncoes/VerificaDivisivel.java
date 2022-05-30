/*
*Escreva uma funcao que receba dois numeros inteiros x e y. Essa funcao deve verificar se x e divisıvel por y. No caso
*positivo, a funcao deve retornar 1, caso contrario zero. Escreva tambem um programa principal para testartal funcao.
*/
import java.util.Scanner;

public class VerificaDivisivel {
    //******************************************************************//
	public static void main(String[] args) {
		int x, y, resultado;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Verifica se X/Y é divisivel!");
        System.out.print("Informe o X: ");
        x = entradaTeclado.nextInt();
        System.out.print("Informe o Y: ");
        y = entradaTeclado.nextInt();
        resultado=verificaDivisao(x,y);
        if(resultado==1){
            System.out.printf("%d é divisivel por %d!",x,y);
        }else System.out.printf("%d não é divisivel por %d!\n",x,y);
    	
	}
	
	//******************************************************************//
	static int verificaDivisao(int x, int y) {
        if((x%y)==0){
            return 1;
        }else return 0;
	}	
}
