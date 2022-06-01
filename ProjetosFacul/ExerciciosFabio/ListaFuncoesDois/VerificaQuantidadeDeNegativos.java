/*
Implemente uma funcao que receba como parametro um vetor de numeros reais e retorne quantos numeros
negativos estao armazenados nesse vetor
*/
import java.util.Scanner;
public class VerificaQuantidadeDeNegativos {
    //******************************************************************//
    public static void main(String []  args){
        Scanner leitorTeclado =new Scanner(System.in);
        int tamanhoVetor=0, quantidadeNegativos=0;
        System.out.println("Programa para verificar quantos negativos tem no vetor!\n");
        System.out.print("Informe o tamanho do vetor: ");
        tamanhoVetor = leitorTeclado.nextInt(); 
        Float[] vetorA = new Float[tamanhoVetor];
        for(int i=0;i<tamanhoVetor;i++)
        {
            System.out.print("Informe o "+(i+1)+"º numero do Vetor: ");
            vetorA[i] = leitorTeclado.nextFloat(); 
        }
        quantidadeNegativos=ContaNegativos(vetorA,tamanhoVetor);
        System.out.print("O vetor possui "+quantidadeNegativos+" numeros negativos");
    }

    //******************************************************************//
	static int ContaNegativos(Float vetorDigitado[], int tamnhoDoVetor) {
        int contadorDeNegativos=0;
        for(int i=0; i<tamnhoDoVetor; i++){
            if(vetorDigitado[i]<0){
                contadorDeNegativos++;
            }
        }
        return contadorDeNegativos;
	}	
}
