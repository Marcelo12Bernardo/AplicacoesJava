/*
Faca um programa para ler dois vetores A e B com 7 elementos. Construir uma matriz C de duas 
dimensoes, onde a primeira coluna devera ser formada pelos elementos do vetor A e a segunda pelos
elementos do vetor B
*/
import java.util.Scanner;
public class ConstroiMatriz {
    public static void main(String[] args) {
        Scanner leitorTeclado =new Scanner(System.in);
		int vetorA[] = new int[7];
        int vetorB[] = new int[7];
        int matrizC[][] = new int[7][2];
		int linha, coluna;

		for(linha = 0; linha < 7; linha++) {
            System.out.print("Informe o elemnto A["+(linha+1)+"]: ");
            vetorA[linha]= leitorTeclado.nextInt();
            System.out.print("Informe o elemnto B["+(linha+1)+"]: ");
            vetorB[linha]= leitorTeclado.nextInt();
            matrizC[linha][0]=vetorA[linha];
            matrizC[linha][1]=vetorB[linha];
        }
        
		for(linha = 0; linha < 7; linha++) {
			for(coluna = 0; coluna < 2; coluna++) {
				System.out.printf("%2d |",matrizC[linha][coluna]);
			}
			System.out.println();
		}
	}
}
/*
if(i+1<n){
    val1=duracaoLocal(i);
    val2=duracaoLocal(i+1);
    i+=2;
}else {
    val1=duracaoLocal(i);
    val2=0
}
*/ 
