/*
Tendo como dados de entrada a altura o sexo e o peso de uma pessoa, construa
um algoritmo que calcule seu peso ideal, utilizando as seguintes formulas:
Para homens: (72.7*h) - 58 e Para mulheres: (62.1*h) - 44.7 (h = altura)
Informe se o peso da pessoa esta dentro, acima ou abaixo do peso 
(Considere a margem de erro de 1 Kg para
mais ou para menos como estando no peso ideal).
*/

import java.util.Scanner;

public class CalcularPesoIdeal {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
        String sexo;
		double peso, altura, pesoIdeal;

	    System.out.println("Programa para calcular o peso ideal!");
	    System.out.print("Informe seu sexo: ");
	    sexo = leitorDoTeclado.nextLine();
        System.out.print("Informe sua altura: ");
	    altura = leitorDoTeclado.nextDouble();
        System.out.print("Informe seu peso: ");
	    peso = leitorDoTeclado.nextDouble();
        if(sexo.equalsIgnoreCase("masculino"))
		{
			pesoIdeal = (72.7 * altura) - 58;
			System.out.print("O peso ideal para sua altura e: "+pesoIdeal);
			if((peso<=pesoIdeal+1)&&(peso>=pesoIdeal-1))
			{
				System.out.print(peso+" Esta dentro do peso ideal!");
			}else if(peso<pesoIdeal-1)
			{
				System.out.print(peso+" Esta abaixo do peso ideal!");
			}else System.out.print(peso+" Esta acima do peso ideal!");
		}else if(sexo.equalsIgnoreCase("feminino"))
		{
			pesoIdeal = (62.1 * altura) - 44.7;
			if((peso<=pesoIdeal+1)&&(peso>=pesoIdeal-1))
			{
				System.out.print(peso+" Esta dentro do peso ideal!");
			}else if(peso<pesoIdeal-1)
			{
				System.out.print(peso+" Esta abaixo do peso ideal!");
			}else System.out.print(peso+" Esta acima do peso ideal!");

		}else System.out.print("Sexo invalido!");
	}
}
