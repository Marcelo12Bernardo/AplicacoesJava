/*
Criar um programa que possa armazenar em uma matriz as alturas de dez atletas de cinco delegacoes
que participarao dos jogos de verao. Imprimir a maior altura de cada delegacao.
*/
import java.util.Scanner;

public class MaiorAltura {
    public static void main(String[] args) {
        Scanner leitorTeclado =new Scanner(System.in);
	
        float alturasAtletas[][] = new float[10][5];
        float maaiorAlturaDelegacao[]= new float[5];
		int linha, coluna;

        for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 5; coluna++) {
				System.out.print("Informe a altura do Atleta["+(linha+1)+"] da delegação["+(coluna+1)+"]: ");
                alturasAtletas[linha][coluna]= leitorTeclado.nextFloat();
                //Primeiro atleta de cada delegacao
                if((linha==0)&&((coluna==0)||(coluna==1)||(coluna==2)||(coluna==3)||(coluna==4))){
                    maaiorAlturaDelegacao[coluna]=alturasAtletas[linha][coluna];
                }
			}
		}

		for(linha = 0; linha < 10; linha++) {
			for(coluna = 0; coluna < 5; coluna++) {
				if(alturasAtletas[linha][coluna]>maaiorAlturaDelegacao[coluna]){
                    maaiorAlturaDelegacao[coluna]=alturasAtletas[linha][coluna];
                }
			}
		}
        for(coluna = 0; coluna < 5; coluna++) {
            System.out.println("Maior altura da delegacao "+(coluna+1)+": "+maaiorAlturaDelegacao[coluna]);
        }
	}
}
