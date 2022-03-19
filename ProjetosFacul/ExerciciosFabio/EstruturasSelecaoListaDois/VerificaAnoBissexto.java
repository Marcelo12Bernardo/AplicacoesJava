//Faca um programa que peca para entrar com um ano com 4 dıgitos e 
// determine se o mesmo e ou nao bissexto 

import java.util.Scanner;

public class VerificaAnoBissexto {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int ano; 

	    System.out.println("Programa para verificar se o ano e bissexto!");
	    System.out.print("Informe o ano: ");
	    ano = leitorDoTeclado.nextInt();

        if((((ano%4)==0)&&((ano%100)!= 0))||((ano%400)== 0)){ System.out.println(ano+" e bissesxto!");}
        else System.out.println(ano+" nao e bissexto!");
        
	}
}
