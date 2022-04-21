/*
Construa um programa para calcular a media de valores PARES e IMPARES, que serao digitados pelo usuario
Ao final o programa deve mostrar estas duas medias. O programa deve mostrar tambem o maior numero PAR
digitado e o menor numero IMPAR digitado. Para finalizar o usuario ira digitar um valor negativo
*/
import java.util.Scanner;

public class SomaParesImpares {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int numero=2, contPar=0, contImpar=0, totalPar=0, totalImpar=0,maiorPar=0,menorImpar=9999999; 
        float mediaPar=0,mediaImpar=0;
        System.out.println("Programa para verificar quantos numeros são par e quantos são impar!");

        System.out.print("Informe um numero: ");
        numero = leitorDoTeclado.nextInt();

        while (numero>=0)
        {
            if((numero%2)==0)
            {
                contPar++;
                totalPar+=numero;
                if(numero>maiorPar){maiorPar=numero;}
            }else
            {
                contImpar++;
                totalImpar+=numero;
                if(numero<menorImpar){menorImpar=numero;}
            }
            System.out.print("Informe um numero: ");
            numero = leitorDoTeclado.nextInt();
        }
        mediaImpar=totalImpar/contImpar;
        mediaPar=totalPar/contPar;
        System.out.println("Total de numeros PAR: "+contPar);
        System.out.println("Total de numeros IMPAR: "+contImpar);
        System.out.println("Media dos numeros PARES: "+mediaPar);
        System.out.println("Media dos numeros IMPARES: "+mediaImpar);
        System.out.println("Maior numero PAR: "+maiorPar);
        System.out.println("Menor numero IMPAR: "+menorImpar);
	}
}
