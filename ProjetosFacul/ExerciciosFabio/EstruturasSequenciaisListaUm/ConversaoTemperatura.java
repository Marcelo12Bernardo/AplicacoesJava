package ListaUm;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		float temperaturaCel, temperaturaFah, temperaturaKel; // Declaração de variáveis

	    System.out.println("Programa Conversao de Temperatura!");
	    System.out.print("Informe a temperatura em Celsius: ");

	    temperaturaCel = leitorDoTeclado.nextFloat();
	    temperaturaFah=((9*temperaturaCel)+160)/5;
        temperaturaKel=temperaturaCel+273;

	    System.out.println(temperaturaCel+"°C equivale a: "+temperaturaFah+"°F");
        System.out.println(temperaturaCel+"°C equivale a: "+temperaturaKel+"°K");
	}
}
