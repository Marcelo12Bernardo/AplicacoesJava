/*
Criar um programa que entre com elementos para uma matriz tridimensional inteira com dimensoes
5 x 4 x 2.
Imprima a matriz em dois passos: primeiro a profundidade 0 e depois a profundidade 1.
*/
import java.util.Scanner;

public class MatrizTriDimencional {
    public static void main(String[] args) {
        Scanner leitorTeclado =new Scanner(System.in);
		int matrizA[][][] = new int[5][4][2];
		int linha, coluna, dimensao;
        //alimenta
		for(dimensao = 0; dimensao < 2; dimensao++) {
            for(linha = 0; linha < 5; linha++) {
                for(coluna = 0; coluna < 3; coluna++) {
                    System.out.print("Informe o elemnto A["+(linha+1)+"]["+(coluna+1)+"]["+(dimensao+1)+"]: ");
                    matrizA[linha][coluna][dimensao]= leitorTeclado.nextInt();
                }
            }
        }
        //Imprime
        for(dimensao = 0; dimensao < 2; dimensao++) {
            System.out.println("\nMatriz "+dimensao+": ");
            for(linha = 0; linha < 5; linha++) {

                for(coluna = 0; coluna < 3; coluna++) {

                    System.out.printf("%2d |",matrizA[linha][coluna][dimensao]);
                    
                }
                System.out.println();
            }
        }
	}
    
}
