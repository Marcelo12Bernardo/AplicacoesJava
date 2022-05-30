import java.util.Scanner;

public class ImprimeNlinhas {
        //******************************************************************//
       public static void main(String[] args) {
           int n;
           Scanner entradaTeclado = new Scanner(System.in);
           
           System.out.println("Imprime N linhas!");
           System.out.print("Informe o numero de linhas: ");
           n = entradaTeclado.nextInt();
           calculaFatorial(n);
       }
       
       //******************************************************************//
       static void calculaFatorial(int n) {
            int linha=0,coluna=0;
            for(linha=1;linha<=n;linha++){
                for(coluna=1;coluna<=linha;coluna++){
                    System.out.print(linha);
                }
                System.out.println();
            }
       }
}
