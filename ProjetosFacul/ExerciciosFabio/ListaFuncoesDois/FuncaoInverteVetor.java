/*
Implemente uma funcao que receba como parametro um vetor de numeros inteiros e inverta a ordem dos elementos
armazenados nesse vetor
*/
import java.util.Scanner;

public class FuncaoInverteVetor {
    public static void main(String []  args){

        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0;

        System.out.println("Programa para inverter um vetor!\n");
        //Get tamanho
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = leitorTeclado.nextInt(); 
        //Cria vetores
        int vetorA[] = new int[tamanhoVetor];
        int vetorInvertido[] = new int[tamanhoVetor];
        //Alimenta o vetor
        for(int i=0;i<tamanhoVetor;i++)
        {
            System.out.print("Informe o "+(i+1)+"º numero do vetor: ");
            vetorA[i] = leitorTeclado.nextInt(); 
        }
        //Chama a função inverter
        vetorInvertido=InverteVetor(vetorA,tamanhoVetor);
        //Mostra valores// A' <=> A invertido
        for(int i=0;i<tamanhoVetor;i++)
        {
            System.out.println((i+1)+"º - A: "+vetorA[i]+"\t"+(i+1)+"º - A': "+vetorInvertido[i]);
        }  

    }

    //******************************************************************//
	static int[] InverteVetor(int vetorDigitado[], int tamnhoDoVetor) {
        int vetorInvertido[] = new int[tamnhoDoVetor];
        for(int i=0; i<tamnhoDoVetor; i++){
            vetorInvertido[(tamnhoDoVetor-1)-i]=vetorDigitado[i];
        }
        return vetorInvertido;
	}	
}
