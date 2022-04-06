/*
Prepare um programa para controlar as informacoes sobre utilizacao de um banco eletronico.
Seu programa devera perguntar aos clientes qual foi a operacao que eles realizaram.
O programa devera mostrar um menu com as as seguintes opcoes:
1 - Deposito
2 - Retirada
3 - Saldo
4 - Extrato
5 - Sair do Programa
O programa devera ficar em loop, apresentando o menu e lendo a opcao do usuario. Apos lida a opcao de
sair do programa, informe quantas operacoes foram efetuadas de cada tipo e finalize a execucao. (Utilizar
a estrutura de repeticao do...while e a estrutura de selecao switch...case)
*/
import java.io.IOException;
import java.util.Scanner;

import javax.swing.DefaultBoundedRangeModel;

public class BancoEletronico {
    public static void main(String[] args) throws IOException, InterruptedException {

		Scanner leitorDoTeclado = new Scanner(System.in);
		int operacao, contDepositos=0,contRetiradas=0,contSaldo=0,contExtrato=0;
        float saldo=0,deposito=0,retirado=0;
        do
        {
            //Limpa o terminal
            if (System.getProperty("os.name").contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else Runtime.getRuntime().exec("clear");

            System.out.println("\t\tMENU DE OPERACOES\n1 - Deposito\n2 - Retirada\n3 - Saldo\n4 - Extrato\n5 - Sair do Programa");
            System.out.print("Qual operacao deseja executar? ");
            operacao = leitorDoTeclado.nextInt();
            switch(operacao)
            {
                case 1:
                    System.out.print("Quanto deseja depositar?");
                    deposito = leitorDoTeclado.nextFloat();
                    saldo=saldo+deposito;
                    contDepositos++;
                    System.out.print("Saldo atualizado, ENTER para continuar.....");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.print("Quanto deseja retirar?");
                    retirado = leitorDoTeclado.nextFloat();
                    if(retirado<=saldo)
                    {
                        saldo=saldo-retirado;
                        System.out.print("Saque feito! ENTER para continuar.....");
                        contRetiradas++;
                    }else System.out.print("Saldo insuficiente, ENTER para continuar.....");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.println("Saldo: "+saldo);
                    contSaldo++;
                    System.out.print("Precione ENTER para continuar.....");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    System.out.println("Ultimo saque: "+retirado);
                    System.out.println("Ultimo deposito: "+deposito);
                    System.out.println("Saldo atual: "+saldo);
                    contExtrato++;
                    System.out.print("Precione ENTER para continuar.....");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 5:
                    System.out.println("Total de saques: "+contRetiradas);
                    System.out.println("Total de depositos: "+contDepositos);
                    System.out.println("Total de consultas ao saldo: "+contSaldo);
                    System.out.println("Total de extratos retirados: "+contExtrato);
                    System.out.print("Precione ENTER para continuar.....");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                default: System.out.println("Operacao Invalida");
            }
        } while (operacao!=5);
        System.out.println("Fim da execucao!");
        
    }
}
