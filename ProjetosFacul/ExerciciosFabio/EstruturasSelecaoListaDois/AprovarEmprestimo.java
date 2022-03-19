/*
A prefeitura de Campos abriu uma linha de credito para os funcionarios estatutarios. O valor maximo da
prestacao nao podera ultrapassar 30% do salario bruto. Fazer um programa que permita entrar com o salario
bruto e o valor da prestacao, e informar se o emprestimo pode ou nao ser concedido.
*/
import java.util.Scanner;
public class AprovarEmprestimo {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
		double salario, porcentagemSalario, valorParcelas; 

	    System.out.println("Programa para aprovar emprestimos!");
	    System.out.print("Informe seu salario bruto: ");
	    salario = leitorDoTeclado.nextDouble();
        System.out.print("Informe o valor das parcelas: ");
	    valorParcelas = leitorDoTeclado.nextDouble();
        porcentagemSalario=valorParcelas/salario;

        if(porcentagemSalario<=0.3){ System.out.println("Emprestimo concedido!");}
        else System.out.println("Emprestimo nao pode ser concedido!");
        
	}
}
