/*
 Prepare um algoritmo para perguntar o nome e o sexo de 10 pessoas e informar quantas s˜ao homens
e quantas sao mulheres.
*/
import java.util.Scanner;

public class ContadorDeMulheresEHomens{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String nome, sexo;
        int contMulheres=0,contHomens=0;

        

        for(int i=1;i<=10;i++){
            System.out.print("Informe o nome: ");
            nome = leitorTeclado.next();
            System.out.print("Informe sexo M ou F: ");
            sexo = leitorTeclado.next();
            if(sexo.equalsIgnoreCase("F")){
                contMulheres++;
            }else if(sexo.equalsIgnoreCase("M")){contHomens++;}
            
        }
       
        System.out.println("Foram cadastradas "+contMulheres+" mulheres");
        System.out.println("Foram cadastrados "+contHomens+" homens");

    }
}
