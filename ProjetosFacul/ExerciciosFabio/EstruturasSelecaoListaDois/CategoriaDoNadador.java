/*
Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das
seguintes categorias:infantil A= 5-7 anos; infantil B = 8-10 anos; 
juvenil A = 11-13 anos;juvenil B = 14-17 anos;adulto = maiores de 18 anos.
*/
import java.util.Scanner;
public class CategoriaDoNadador {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int idadeNadador;

	    System.out.println("Programa para classificar o nadador!");
	    System.out.print("Informe a idade do nadador: ");
	    idadeNadador = leitorDoTeclado.nextInt();
        

        if((idadeNadador>=5)&&(idadeNadador<=7)){ System.out.println("Infantil A");}
        else if((idadeNadador>=8)&&(idadeNadador<=10)){System.out.println("Infantil B");}
        else if((idadeNadador>=11)&&(idadeNadador<=13)){System.out.println("Juvenil A");}
        else if((idadeNadador>=14)&&(idadeNadador<=17)){System.out.println("Juveil B");}
        else if(idadeNadador>=18){System.out.println("Adulto");}
        else System.out.println("Nadador sem categoria");
	}
}
