package ListaUm;
import java.util.Scanner;
public class CalcularReajuste {
    
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		float salario, reajuste, novoSalario; 
	    System.out.println("Programa pra calcular reajuste do salario!");
	    System.out.print("Informe o salario mensal: ");
	    salario = leitorDoTeclado.nextFloat();
        System.out.print("Informe o percentual de reajuste: ");
	    reajuste = leitorDoTeclado.nextFloat();
        novoSalario=salario+(salario*(reajuste/100));
        System.out.println("O novo salario e: "+novoSalario);
	}
}
