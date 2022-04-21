/*
 Prepare um algoritmo para perguntar a um certo numero de pessoas seu nome, sexo, peso e nacionalidade.
Informe:
(a) A media de peso destas pessoas
(b) O nome da pessoa mais pesada
(c) O nome da mulher brasileira mais leve
*/
import java.util.Scanner;

public class PesoPessoas{
    public static void main(String[] args ){

        Scanner leitorTeclado =new Scanner(System.in);
        String nome, sexo, nacionalidade,nomeMaisPesado="",mulherMaisLeve="";
        float peso,maiorPeso=0, menorPesoF=9999999, somaPesos=0, mediaPesos;
        int contPessoas=0;

        System.out.print("Informe o nome: ");
        nome = leitorTeclado.next();

        while(nome.equalsIgnoreCase("sair")== false){
            System.out.print("Informe sexo masculino ou feminino: ");
            sexo = leitorTeclado.next();
            System.out.print("Informe nacionalidade: ");
            nacionalidade = leitorTeclado.next();
            System.out.print("Informe peso: ");
            peso = leitorTeclado.nextFloat();
            contPessoas++;
            somaPesos+=peso;
            if(peso>maiorPeso){
                nomeMaisPesado=nome;
                maiorPeso=peso;
            }
            if((sexo.equalsIgnoreCase("feminino"))&&(nacionalidade.equalsIgnoreCase("brasileira"))&&(peso<menorPesoF)){
                menorPesoF=peso;
                mulherMaisLeve=nome;
            }
            System.out.print("Informe o nome: ");
            nome = leitorTeclado.next(); 
        }
        mediaPesos=somaPesos/contPessoas;
        System.out.println("Peso medio dessas pessoas "+mediaPesos);
        System.out.println(mulherMaisLeve+" pesa "+menorPesoF+" Kg e por isso e a mulher mais leve");
        System.out.println(nomeMaisPesado+" pesa "+maiorPeso+" Kg e por isso e a pessoa mais pesada");

    }
}
