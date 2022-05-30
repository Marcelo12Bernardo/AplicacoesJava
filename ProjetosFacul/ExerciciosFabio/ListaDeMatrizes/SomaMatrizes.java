/*
Faca um programa para ler duas matrizes A e B, cada uma de duas dimensoes com 5 linhas e 3 colunas
Construir uma matriz C de mesma dimensao, onde C e formada pela soma dos elementos da matriz A com
os elementos da matriz B
*/
import java.util.Scanner;
public class SomaMatrizes {

    public static void main(String[] args) {
        Scanner leitorTeclado =new Scanner(System.in);
		int matrizA[][] = new int[5][3];
        int matrizB[][] = new int[5][3];
        int matrizC[][] = new int[5][3];
        
		int linha, coluna;
		
		for(linha = 0; linha < 5; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.print("Informe o elemnto A["+(linha+1)+"]["+(coluna+1)+"]: ");
                matrizA[linha][coluna]= leitorTeclado.nextInt();
                System.out.print("Informe o elemnto B["+(linha+1)+"]["+(coluna+1)+"]: ");
                matrizB[linha][coluna]= leitorTeclado.nextInt();
                matrizC[linha][coluna]= matrizA[linha][coluna]+matrizB[linha][coluna];
			}
		}

		for(linha = 0; linha < 5; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.printf("%2d |",matrizC[linha][coluna]);
			}
			System.out.println();
		}
	}
}
