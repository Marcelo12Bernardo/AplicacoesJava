/*
Faca um programa para criar uma matriz de dimensoes 4x4 do tipo char. Inicialize todas as posicoes
da matriz com a letra x. Em seguida dois caracteres y deverao ser inseridos na matriz em posicoes
aleatorias sem que o usuario saiba onde.Crie uma repeticao para permitir ao usuario entrar com 
coordenadas da matriz visando acertar em quais posicoes da matriz foram colocados os caracteres y.
Quando um y for localizado informe ao usuario que ele acertou. Ao final informe o numero de tentativas que foram necess´arias para descobrir as posicoes
*/
import java.util.Scanner;
import java.util.Random;
public class DescobrirLocalY {
    

        public static void main(String[] args) {
            Scanner leitorTeclado =new Scanner(System.in);
            char matrizA[][] = new char[4][4];
            char valY='y';
            Random numeroAleatorio = new Random();
            int tentativas=0, acertos=0;
            int linha, coluna;
            for(linha = 0; linha < 4; linha++) {
                for(coluna = 0; coluna < 4; coluna++) {
                    matrizA[linha][coluna]= 'x';
                }
            }
            linha=numeroAleatorio.nextInt(3);
            coluna=numeroAleatorio.nextInt(3);
            matrizA[linha][coluna]= 'y';
            linha=numeroAleatorio.nextInt(3);
            coluna=numeroAleatorio.nextInt(3);
            matrizA[linha][coluna]= 'y';
            while(acertos<=2){
                System.out.print("Informe a Linha: ");
                linha=leitorTeclado.nextInt();
                System.out.print("Informe a Coluna: ");
                coluna=leitorTeclado.nextInt();
                if(((linha>=0)&&(linha<4))&&((coluna>=0)&&(coluna<4))){
                    tentativas++;
                    if(valY == matrizA[linha][coluna]){
                        acertos++;
                        System.out.print("Acertou!");
                    }
                }else System.out.print("Posição invalida");
            }
            System.out.println("Numero de tentativas: "+tentativas);
        }
}
