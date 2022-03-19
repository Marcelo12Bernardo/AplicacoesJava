//Fa¸ca um programa que verifique se uma letra digitada ´e ”F” ou ”M”.
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv´alido.

import java.util.Scanner;

public class VerificaFouM {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		String genero; 

	    System.out.println("Programa para verificar o genero!");
	    System.out.print("Informe F ou M: ");
	    genero = leitorDoTeclado.nextLine();

        if(genero.equalsIgnoreCase("F")){ System.out.println("F - Feminino!");}
        else if(genero.equalsIgnoreCase("M")){ System.out.println("M - Masculino!");}
        else System.out.println(genero+" - Genero Invalido!");
        
	}
}
