/*
 Programa que le duas palavras da entrada e, na saıda, imprime a menor palavra.
*/
import java.util.Scanner;

public class VerificaMenorPalavra{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String palavraUm,palavraDois;
        

        System.out.print("Programa para verificar qual palavra e maior!");
        System.out.print("Informe uma palavra: ");
        palavraUm = leitorTeclado.next();
        System.out.print("Informe outra palavra: ");
        palavraDois = leitorTeclado.next();
        if(palavraUm.length()>palavraDois.length()){
            System.out.println("A maior palavra e: "+palavraUm);
        }else if(palavraUm.length()<palavraDois.length()){
            System.out.println("A maior palavra e: "+palavraDois);
        }else System.out.println("As palavras tem o mesmo tamanho");
    }
}

