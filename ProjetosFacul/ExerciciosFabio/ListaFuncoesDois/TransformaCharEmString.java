/*
Faca uma funcao que receba um vetor de char por parametro e retorne uma string composta pelos caracteres do
vetor. Faca um programa principal para testar a funcao e imprimir o resultado do processamento.
Obs: Nao utilizar funcoes prontas da linguagem para a conversao.
*/
import java.util.Scanner;

public class TransformaCharEmString {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0;

        System.out.println("Programa para tranformar char em string!\n");
        System.out.print("Informe quantas letras tem seu vetor: ");
        tamanhoVetor = leitorTeclado.nextInt();
        leitorTeclado.nextLine(); 
        char vetorChar[] = new char[tamanhoVetor];
        String palavraCompleta="a";

        for(int i=0;i<tamanhoVetor;i++){
            System.out.print("Informe a "+(i+1)+"º letra: ");
            vetorChar[i] = leitorTeclado.next().charAt(0); 
        }

        palavraCompleta=converteChar(vetorChar,tamanhoVetor);
        System.out.println("A palavra completa é: "+palavraCompleta);

    }

    //******************************************************************//
	static String converteChar(char caracteresDigitados[], int tamanoDoVetor) {

        String palavraConvertida="";
        for(int i=0; i<tamanoDoVetor;i++){
            palavraConvertida=palavraConvertida+caracteresDigitados[i];
        }

       return palavraConvertida;
	}	
}
