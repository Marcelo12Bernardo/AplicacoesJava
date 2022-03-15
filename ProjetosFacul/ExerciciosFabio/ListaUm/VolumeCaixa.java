package ListaUm;
import java.util.Scanner;

public class VolumeCaixa {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int comprimentoCai, alturaCai, larguraCai, volumeCai; // Declaração de variáveis

	    System.out.println("Programa pra calcular volume da caixa!");

	    System.out.print("Informe o comprimento da caixa: ");
	    comprimentoCai = leitorDoTeclado.nextInt();
        System.out.print("Informe a largura da caixa: ");
	    larguraCai = leitorDoTeclado.nextInt();
        System.out.print("Informe altura da caixa: ");
	    alturaCai = leitorDoTeclado.nextInt();
        volumeCai=comprimentoCai*larguraCai*alturaCai;
        System.out.println("O volume da caixa e: "+volumeCai);
	}
    
}
