/*
*Faca uma funcao que receba um numero e retorne se este numero e primo. No caso positivo, a funcao deve
*retornar 1, caso contrario 0(zero). Escreva tambem um programa principal para testar a funcao.
*/
import java.util.Scanner;

public class VerificaNumeroPrimo {
    //******************************************************************//
	public static void main(String[] args) {
		int x, resultado;
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Verifica se o numero é primo!");
        System.out.print("Informe o numero: ");
        x = entradaTeclado.nextInt();
        resultado=verificaDivisao(x);

        if(resultado==1){
            System.out.printf("%d é primo!",x);
        }else System.out.printf("%d não é primo!\n",x);
    	
	}
	
	//******************************************************************//
	static int verificaDivisao(int x) {
        int cont=0;
        boolean primo=true;
        do{
            cont++;
            if(((x%cont)==0)&& (cont!=x))
            {
                if(cont!=1){primo=false;}
            }
        }while((cont<=x)&&(primo==true));

        if(primo==true){
            return 1;
        }else return 0;
    }
}
