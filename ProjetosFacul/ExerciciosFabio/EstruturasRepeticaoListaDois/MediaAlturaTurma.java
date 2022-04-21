/*
Escreva um programa que leia um conjunto de 50 fichas, cada uma contendo a altura e o sexo (M/F) de uma pessoa. 
Calcule e imprima:
(a) A maior e a menor altura da turma
(b) A media de altura das mulheres
(c) A media de altura da turma
*/
import java.util.Scanner;

public class MediaAlturaTurma{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String  sexo;
        float altura, maiorAltura=0, menorAltura=999999, mediaMulheres, somaAlturaMulheres=0, somaAlturaTurma=0, mediaTurma;
        int contAlunos=0, contMulheres=0;

        System.out.println("Programa para verificar a media de altura da Turma!");
        
        for(int i=1;i<=50;i++){

            System.out.print("Informe sexo M ou F: ");
            sexo = leitorTeclado.next();
            
            System.out.print("Informe sua altura: ");
            altura = leitorTeclado.nextFloat();
            contAlunos++;
            somaAlturaTurma+=altura;

            if(altura>maiorAltura){maiorAltura=altura;}
            if(altura<menorAltura){menorAltura=altura;}

            if(sexo.equalsIgnoreCase("f")){
               contMulheres++;
               somaAlturaMulheres+=altura;
            }
            
        }
        mediaMulheres=somaAlturaMulheres/contMulheres;
        mediaTurma=somaAlturaTurma/contAlunos;

        System.out.println("A altura media da turma e: "+mediaTurma);
        System.out.println("A altura media das mulheres e: "+mediaMulheres);
        System.out.println("A maior altura digitada foi: "+maiorAltura);
        System.out.println("A menor altura digitada foi: "+menorAltura);
    }
}
