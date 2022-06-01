/*
Faca uma funcao que receba uma string por parametro e retorne um vetor de char com o conteudo da string.
Faca um programa principal para testar a funcao e imprimir o resultado do processamento.
Obs: Nao utilizar funcoes prontas da linguagem para a conversao.
*/
import java.util.Scanner;

public class TrasnformaStringEmChar {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoPalavra=0;
        String palavraCompleta="a";
        System.out.println("Programa para tranformar String em char!\n");

        System.out.print("Informe a palavra que deseja converter: ");
        palavraCompleta = leitorTeclado.nextLine(); 
        tamanhoPalavra=palavraCompleta.length();
        char vetorChar[] = new char[tamanhoPalavra];
        vetorChar=converteString(palavraCompleta,tamanhoPalavra);
        //Mostra a palavra completa
        System.out.println("A palavra completa é:");
        for(int i=0; i<tamanhoPalavra;i++){
            System.out.println("\t\t"+vetorChar[i]);
        }
    }

    //******************************************************************//
	static char[] converteString(String palavra, int tamanoDoVetor) {
        char vetorChar[] = new char[tamanoDoVetor];
        for(int i=0; i<tamanoDoVetor;i++){
            vetorChar[i] = palavra.charAt(i);
        }
       return vetorChar;
	}	
}
