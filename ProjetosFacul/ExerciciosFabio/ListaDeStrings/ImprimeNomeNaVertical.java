
/*
 Faca um programa que solicite o nome do usuario e imprima-o na vertical
*/
import java.util.Scanner;

public class ImprimeNomeNaVertical{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String palavraUm;
        

        System.out.println("Programa para escrever nomes na vertical!");
        System.out.println("Informe seu nome: ");
        palavraUm = leitorTeclado.next();
        char pegaCharDaString;  

        for(int i=0;i<palavraUm.length(); i++)
        {
            pegaCharDaString = palavraUm.charAt(i);
            System.out.println(pegaCharDaString);
        }
}
}


