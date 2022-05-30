/*
* Criar uma funcao que determine se um caractere, recebido como parametro, e ou nao uma letra do alfabeto. A
* funcao deve retornar 1 caso positivo e 0 em caso contrario. Escreva tambem um programa para testar a funcao.
Obs: Utilize, dentro da funcao, um vetor contendo todas as letras do alfabeto para a realizacao das comparacoes.

*/
import java.io.IOException;
import java.util.Scanner;

public class VerificaAlfabeto {
    
    //******************************************************************//
	public static void main(String[] args) throws IOException, InterruptedException {
		char caractere='a';
        int resultado;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Verifica um caractere pertence ao alfabeto!");
        System.out.print("Informe o caracter: ");
        caractere = entradaTeclado.next().charAt(0);
        resultado=verificaCaractere(caractere);
        if(resultado==1){
            System.out.println(caractere+" pertence ao alfabeto!");
        }else System.out.println(caractere+" não pertence ao alfabeto!");
        //Limpa terminal
        //if (System.getProperty("os.name").contains("Windows")){
        //    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //}else Runtime.getRuntime().exec("clear");
	}
	
	//******************************************************************//
	static int verificaCaractere(char caracter) {
        char alfabetoMin[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char alfabetoMai[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        boolean pertence=false;
        for(int i=0;i<26;i++){
            if((Character.compare(caracter,alfabetoMin[i])==0)||(Character.compare(caracter,alfabetoMai[i])==0)){
                pertence=true;
            }
        }
        if(pertence==true){
            return 1;
        }else return 0;
	}	
}
