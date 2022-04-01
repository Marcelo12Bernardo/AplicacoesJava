/*
Criar um programa que leia um numero inteiro entre 1 e 12 e escreva o nome do mes correspondente.
Caso o usuario digite um numero fora desse intervalo, devera aparecer uma mensagem informando que nao
existe mes com este numero.

*/

import java.util.Scanner;
public class VerificarMes {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
        
		int numeroMes;

	    System.out.println("Programa para verificar o mes digitado!");
	    System.out.print("Informe o numero do mes: ");
	    numeroMes = leitorDoTeclado.nextInt();
        switch(numeroMes)
        {
            case 1:
                System.out.println(numeroMes+" e o mes de JANEIRO");
                break;
            case 2:
                System.out.println(numeroMes+" e o mes de FEVEREIRO");
                break;
            case 3:
                System.out.println(numeroMes+" e o mes de MARCO");
                break;
            case 4:
                System.out.println(numeroMes+" e o mes de ABRIL");
                break;
            case 5:
                System.out.println(numeroMes+" e o mes de MAIO");
                break;
            case 6:
                System.out.println(numeroMes+" e o mes de JUNHO");
                break;
            case 7:
                System.out.println(numeroMes+" e o mes de JULHO");
                break;
            case 8:
                System.out.println(numeroMes+" e o mes de AGOSTO");
                break;
            case 9:
                System.out.println(numeroMes+" e o mes de SETEMBRO");
                break;
            case 10:
                System.out.println(numeroMes+" e o mes de OUTUBRO");
                break;
            case 11:
                System.out.println(numeroMes+" e o mes de NOVEMBRO");
                break;
            case 12:
                System.out.println(numeroMes+" e o mes de DEZEMBRO");
                break;
            default: System.out.println("Não existe nenhum mes com o numero "+numeroMes);
        }
        
	}
    
}
