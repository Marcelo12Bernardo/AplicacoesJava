/*
 Se tivermos uma lista dos numeros naturais menores do que 10 que sao multiplos de 3 ou 5 obtemos
3,5, 6 e 9. A soma destes multiplos e 23. Imprima a soma dos multiplos de 3 ou 5 menores do que 1000.
(Utilizar a estrutura de repeticao while
*/

public class MultiplosDeTresCinco {
    public static void main(String[] args) {

		int soma=0,controle=0;

        System.out.println("Programa verificar a suma dos multiplos de 3 e 5!");

        while(controle<1000)
        {
            if(((controle%3)==0)||((controle%5)==0))
            {
                soma=soma+controle;
            }
            controle++;
        }
        System.out.println("A soma e: "+soma);
    }
}
