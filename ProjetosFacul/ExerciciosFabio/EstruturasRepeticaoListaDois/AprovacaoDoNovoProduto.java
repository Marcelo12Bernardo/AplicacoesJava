/*
Uma certa firma fez uma pesquisa para saber se as pessoas gostaram ou nao de um novo produto lancado
no mercado. Para isso, cadastrou o sexo do entrevistado e sua resposta ((s)sim ou (n)nao). Sabendo-se
que foram entrevistadas 2.000 pessoas, fazer um programa que informe:
(a) O numero de pessoas que responderam sim
(b) O numero de pessoas que responderam nao
(c) A porcentagem de pessoas do sexo feminino que responderam sim
(d) A porcentagem de pessoas do sexo masculino que responderam nao
(e) A mensagem ”Produto Aprovado”, ”Produto Reprovado” ou ”Produto Indiferente”, dependendo da
quantidade de respostas sim e n˜ao
*/
import java.util.Scanner;

public class AprovacaoDoNovoProduto{
    public static void main(String[] args ){
        Scanner leitorTeclado =new Scanner(System.in);
        String  sexo, resposta;
        int totalSim=0, totalNao=0, respostasInvalidas=0, totalMulheres=0, totMulhereRespS=0;
        int totalHomens=0, totHomRespNao=0;
        float porcentagemMulheresSim=0, porcentagemHomensNao=0;
        System.out.print("Programa para verificar se um produto é ou não aprovado pelos funcionarios!");
        for(int i=1;i<=2000;i++){
            System.out.print("Informe sexo M ou F: ");
            sexo = leitorTeclado.next();
            System.out.print("Voce gostou do novo produto? S ou N: ");
            resposta = leitorTeclado.next();
            if(resposta.equalsIgnoreCase("S"))
            {
                totalSim++;
                if(sexo.equalsIgnoreCase("F"))
                {
                    totalMulheres++;
                    totMulhereRespS++;
                }else if(sexo.equalsIgnoreCase("M"))
                {
                    totalHomens++;
                }
            }else if(resposta.equalsIgnoreCase("N"))
            {
                totalNao++;
                if(sexo.equalsIgnoreCase("F"))
                {
                    totalMulheres++;
                }else if(sexo.equalsIgnoreCase("M"))
                {
                    totalHomens++;
                    totHomRespNao++;
                }
            }
            else respostasInvalidas++;
        }
          
        System.out.println("Total de pessoas que responderam SIM: "+totalSim);
        System.out.println("Total de pessoas que responderam NAO: "+totalNao);
        porcentagemMulheresSim=((totMulhereRespS*100)/totalMulheres);
        porcentagemHomensNao=((totHomRespNao*100)/totalHomens);
        System.out.println("Dos "+totalHomens+" homens que participaram, "+porcentagemHomensNao+"% responderam NAO");
        System.out.println("Das "+totalMulheres+" mulheres que participaram, "+porcentagemMulheresSim+"% responderam SIM");
        if(totalSim>totalNao){
            System.out.println("Produto aprovado!");
        }else if(totalNao>totalSim){
            System.out.println("Produto reprovado!");
        }else System.out.println("Produto indiferente!");
        /*
            totalMulheres ----- 100
            totalMulhresSim ----- x
            x=totalMulhresSim/totalMulheres
         */
       

    }
}
