/*
Faca uma funcao para receber uma lista de nomes e um nome a ser procurado. Caso o nome esteja na lista
a funcao devera retornar a posicao do mesmo na lista, caso contrario devera retornar -1. Fa¸ca um programa
principal para testar a funcao.
*/
import java.util.Scanner;

public class PesquisarNome {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0;

        System.out.println("Programa para procurar um nome!\n");
        //Get tamanho
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = leitorTeclado.nextInt();
        leitorTeclado.nextLine(); 
        //Cria vetores
        String vetorNome[] = new String[tamanhoVetor];
        String nomeProcurado;
        int posicao;
        //Alimenta o vetor
        for(int i=0;i<tamanhoVetor;i++){
            System.out.print("Informe o "+(i+1)+"º nome da lista: ");
            vetorNome[i] = leitorTeclado.nextLine(); 
        }
        System.out.print("Informe o nome que deseja buscar: ");
        nomeProcurado = leitorTeclado.nextLine(); 
        //Chama a função procurar
        posicao=ProcuraNome(vetorNome,nomeProcurado,tamanhoVetor);
        //Mostra posisao 
        System.out.println(nomeProcurado+" esta na posção "+(posicao+1));

    }

    //******************************************************************//
	static int ProcuraNome(String vetorNomesDigitados[], String nomeProcurado,int tamanoDoVetor) {
        int posicaoDoProcurado=0;
        for(int i=0; i<tamanoDoVetor;i++){
            if(vetorNomesDigitados[i].equalsIgnoreCase(nomeProcurado)){
                posicaoDoProcurado =i;
                i=tamanoDoVetor;
            }else posicaoDoProcurado =-1;
        }

       return posicaoDoProcurado;
	}	
}
