/*
Faca um programa que leia 2 strings e informe o conteudo delas seguido do seu comprimento. Informe
tambem se as duas strings possuem o mesmo comprimento e sao iguais ou diferentes no conteudo.
*/
import java.util.Scanner;

public class VerificaTamanhoConteudoStrings{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String palavraUm,palavraDois;
        

        //System.out.print("Programa para verificar qual palavra e maior!");
        System.out.print("Informe uma palavra: ");
        palavraUm = leitorTeclado.next();
        System.out.print("Informe outra palavra: ");
        palavraDois = leitorTeclado.next();
        System.out.println("A palavra *"+palavraUm+"* tem "+palavraUm.length()+" letras");
        System.out.println("A palavra *"+palavraDois+"* tem "+palavraDois.length()+" letras");

        if(palavraUm.length()==palavraDois.length()){
            if(palavraUm.equalsIgnoreCase(palavraDois)){
                System.out.println("Possuem o mesmo comprimento e sao iguais no conteudo");
            }else System.out.println("Possuem o mesmo comprimento mas nao sao iguais no conteudo");
        }else System.out.println("Nao possuem o mesmo comprimento ");
    }
}

