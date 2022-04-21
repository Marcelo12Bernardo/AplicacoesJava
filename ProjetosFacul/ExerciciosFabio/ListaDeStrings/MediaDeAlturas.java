/*
Prepare um algoritmo para perguntar o nome e a altura de 20 pessoas e informar:
(a) a m´edia destas alturas
(b) a altura da pessoa mais baixa
(c) o nome da pessoa mais alta
*/
import java.util.Scanner;

public class MediaDeAlturas{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String nome,nomPessoaMaisAlta="";
        float altura, mediaDeAlturas=0, somaAlturas=0,pessoaMaisBaixa=99999, pessoaMaisAlta=0;

        

        for(int i=1;i<=20;i++)
        {
            System.out.print("Informe o nome: ");
            nome = leitorTeclado.next();
            System.out.print("Informe sua altura: ");
            altura = leitorTeclado.nextFloat();
            somaAlturas+=altura;
            if(altura>pessoaMaisAlta)
            {
                pessoaMaisAlta=altura;
                nomPessoaMaisAlta=nome;
            }
            if(altura<pessoaMaisBaixa){pessoaMaisBaixa=altura;}
            
        }
        mediaDeAlturas=somaAlturas/20;
        System.out.println("Altura da pessoa mais baixa: "+pessoaMaisBaixa);
        System.out.println("Nome da pessoa mais baixa: "+nomPessoaMaisAlta);
        System.out.println("Media das alturas: "+mediaDeAlturas);

    }
}

