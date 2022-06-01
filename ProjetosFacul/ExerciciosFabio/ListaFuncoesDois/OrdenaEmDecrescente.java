/*
Faca uma funcao para receber um vetor de numeros inteiros e ordenar o vetor em ordem decrescente.Faca um
programa principal para testar a funcao e imprimir o resultado do processamento
*/
import java.util.Scanner;

public class OrdenaEmDecrescente {
    //*****************************************************
    public static void main(String[] args) {
        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0;

        System.out.println("Programa para ordenar o vetor!\n");
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = leitorTeclado.nextInt();
        //leitorTeclado.nextLine(); 
		int vetorNumeros[] = new int[tamanhoVetor];

		for(int i=0; i<tamanhoVetor;i++){
            System.out.print("Informe o "+(i+1)+"º numero da lista: ");
            vetorNumeros[i] = leitorTeclado.nextInt(); 
        }
        vetorNumeros=ordenarVetorDecrescente(vetorNumeros, tamanhoVetor);

        for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print(vetorNumeros[i] + " ");
		}
        System.out.println( "");
	}

	
	static int[] ordenarVetorDecrescente(int vetorInteiros[], int tamanhoDoVetor) {

		int indiceDeslocamento, indiceBusca, varAuxiliar;

        for (indiceDeslocamento = 0; indiceDeslocamento < tamanhoDoVetor; indiceDeslocamento++) {

			for (indiceBusca = indiceDeslocamento + 1; indiceBusca < tamanhoDoVetor; indiceBusca++) {

				if (vetorInteiros[indiceBusca] > vetorInteiros[indiceDeslocamento]) {
					varAuxiliar = vetorInteiros[indiceBusca];
					vetorInteiros[indiceBusca] = vetorInteiros[indiceDeslocamento];
					vetorInteiros[indiceDeslocamento] = varAuxiliar;
				}
			}
            
		}
        /*
        for (indiceDeslocamento = 0; indiceDeslocamento < tamanhoDoVetor; indiceDeslocamento++) {

			for (indiceBusca = indiceDeslocamento + 1; indiceBusca < tamanhoDoVetor; indiceBusca++) {

				if (vetorInteiros[indiceDeslocamento] < vetorInteiros[indiceBusca]) {
					varAuxiliar = vetorInteiros[indiceDeslocamento];
					vetorInteiros[indiceDeslocamento] = vetorInteiros[indiceBusca];
					vetorInteiros[indiceBusca] = varAuxiliar;
				}
			}
            
		}
        */
        return vetorInteiros;
	}
	
}
