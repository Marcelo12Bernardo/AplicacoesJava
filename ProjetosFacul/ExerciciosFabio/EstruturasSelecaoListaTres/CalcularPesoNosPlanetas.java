

/*
Escreva um programa que leia um peso na Terra, o numero de um planeta e imprima o valor do peso neste
planeta. A relacao de planetas e dada a seguir juntamente com o valor das gravidades relativas a Terra:
*/
import java.util.Scanner;
public class CalcularPesoNosPlanetas {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
    double peso;
    int numeroPlaneta;

    System.out.println("Programa para calcular o peso em cada planeta!\n");
    System.out.println("1- Mercurio\n2- Venus\n3- Marte\n4- Jupter\n5- Saturno\n6- Urano");
	  System.out.print("Informe numero: ");
	  numeroPlaneta = leitorDoTeclado.nextInt();
    System.out.print("Informe seu peso na terra: ");
	  peso = leitorDoTeclado.nextDouble();
    switch(numeroPlaneta)
    {
      case 1:
        peso=peso*0.37;
        System.out.println("Seu peso em Mercurio e: "+peso);
        break;
      case 2:
        peso=peso*0.88;
        System.out.println("Seu peso em Venus e: "+peso);
        break;
      case 3:
        peso=peso*0.38;
        System.out.println("Seu peso em Marte e: "+peso);
        break;
      case 4:
        peso=peso*2.64;
        System.out.println("Seu peso em Jupter e: "+peso);
        break;
      case 5:
        peso=peso*1.15;
        System.out.println("Seu peso em Saturno e: "+peso);
        break;
      case 6:
        peso=peso*1.17;
        System.out.println("Seu peso em Urano e: "+peso);
        break;
      default: System.out.println("Numero invalido!");
    }
    

	}
}
