import java.util.Random;
import java.util.Scanner;
public class EmbaralhaString {
    public static void main(String []  args){

        String palavraDigitada,palavraEmbaralhada;
        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoPalavra;
        System.out.println("Programa para embaralhar uma string!\n");
        System.out.print("Informe a palavra que deseja embaralhar: ");
        palavraDigitada = leitorTeclado.nextLine(); 
        tamanhoPalavra=palavraDigitada.length();
        
        palavraEmbaralhada=embaralhaString(palavraDigitada,tamanhoPalavra);
        System.out.println("Palavra embaralhada: "+palavraEmbaralhada);
    }
    static char[] converteStringpraChar(String palavra, int tamanoDoVetor) {
        char vetorChar[] = new char[tamanoDoVetor];
        for(int i=0; i<tamanoDoVetor;i++){
            vetorChar[i] = palavra.charAt(i);
        }
       return vetorChar;
	}
	static String converteCharPraString(char caracteresDigitados[], int tamanoDoVetor) {
        String palavraConvertida="";
        for(int i=0; i<tamanoDoVetor;i++){
            palavraConvertida=palavraConvertida+caracteresDigitados[i];
        }
       return palavraConvertida;
	}	
    static char[] embaralhaVetor(char vetorDigitado[], int tamanhoDoVetor) {
		int posicao, posicaoAleatoria;
        Random numAleatorio = new Random();
        char varAlxiliar;
        for ( posicao = 0; posicao < tamanhoDoVetor; posicao++) {
            vetorDigitado[posicao]=Character.toUpperCase(vetorDigitado[posicao]);
		}

        for (posicao = 0; posicao < tamanhoDoVetor; posicao++) {
            varAlxiliar=vetorDigitado[posicao];
            posicaoAleatoria=numAleatorio.nextInt(tamanhoDoVetor-1);
            vetorDigitado[posicao]=vetorDigitado[posicaoAleatoria];
            vetorDigitado[posicaoAleatoria]=varAlxiliar;
		}
        return vetorDigitado;
	}
    static String embaralhaString(String stringDigitada, int tamanhoDaString) {
        char vetPalavraConvertida[] = new char[tamanhoDaString];
        char vetPalavraEmbaralhada[] = new char[tamanhoDaString];
        String varPalavraNova="";
        vetPalavraConvertida=converteStringpraChar(stringDigitada,tamanhoDaString);
        vetPalavraEmbaralhada=embaralhaVetor(vetPalavraConvertida,tamanhoDaString);
        varPalavraNova=converteCharPraString(vetPalavraEmbaralhada,tamanhoDaString);
		return varPalavraNova;
	}
}
