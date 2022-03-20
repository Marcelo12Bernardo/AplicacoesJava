/*
Dado o salario fixo, o valor das vendas efetuadas pelo vendedor de uma empresa
e sabendo-se que ele recebe uma comissao de 3% sobre o total das vendas ate 
R$1.500,00 e 5% sobre o que ultrapassar este valor, calcular e escrever o seu salario total
*/
import java.util.Scanner;

public class CalcularSalarioTotal {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		double salarioFixo,salarioTotal, valorVendas, comissao; 

	    System.out.println("Programa para calcular o salario total!");
	    System.out.print("Informe seu salario fixo: ");
	    salarioFixo = leitorDoTeclado.nextDouble();
        System.out.print("Informe o valor do total de vendas: ");
	    valorVendas = leitorDoTeclado.nextDouble();
        if(valorVendas>1500){comissao=valorVendas*0.05;}
        else comissao=valorVendas*0.03;
        salarioTotal=comissao+salarioFixo;
        System.out.println("Sua comissao sera de: "+comissao);
        System.out.println("Seu salario total e: "+salarioTotal);
        
	}
}
