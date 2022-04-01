import java.util.Scanner;
public class CategoriaNadador {
    public static void main(String[] args) {

		Scanner leitorDoTeclado = new Scanner(System.in);
        
		int idadeNadador;

	    System.out.println("Programa para verificar a categoria do nadador!");
	    System.out.print("Informe a idade do nadador: ");
	    idadeNadador = leitorDoTeclado.nextInt();
        if(idadeNadador<5)
        {
            System.out.println("Não existe nenhum mes com o numero "+idadeNadador);
        }else 
        {
            switch(idadeNadador)
            {
                case 5, 6, 7:
                    System.out.println(idadeNadador+" anos e da categoria Infantil A");
                    break;
                case 8, 9, 10:
                    System.out.println(idadeNadador+" anos e da categoria Infantil B");
                    break;
                case 11, 12, 13:
                    System.out.println(idadeNadador+" anos e da categoria juvenil A");
                    break;
                case 14, 15, 16, 17:
                    System.out.println(idadeNadador+" anos e da categoria juvenil B");
                    break;
                default: System.out.println(idadeNadador+" anos e da categoria Adulto ");
                //
            }
        }
        
	}
    
    
}
