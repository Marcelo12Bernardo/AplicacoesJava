/*
 Escreva um programa que determine se um dado numero N (digitado pelo usuario) e primo ou nao
*/
import java.util.Scanner;

public class VerificaPrimos{

    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);

        int numeroN, cont=0;
        boolean primo=true;
        System.out.println("Programa para Verificaar se N e primo!");

        System.out.print("Informe o numero N: ");
        numeroN = leitorTeclado.nextInt();

        do{
            cont++;
            if(((numeroN%cont)==0)&& (cont!=numeroN)){
                if(cont!=1){
                    primo=false;
                }
            }
        }while((cont<=numeroN)&&(primo==true));

        if(primo==false ){
            System.out.println(numeroN+" nao e um numero primo");
        } else System.out.println(numeroN+" e um numero primo");
    }

    }

