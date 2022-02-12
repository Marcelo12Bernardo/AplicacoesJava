package Data;
import java.util.Scanner;
public class data
{	
	private int dia;
	private int mes;
    private int ano;

    Scanner scanner = new Scanner(System.in);
	public void setDia(int d)
	{	dia = d;	}
	
	public int getDia()
	{	return dia;	}

    public void setMes(int m)
	{	mes = m;	}
	
	public int getMes()
	{	return mes;	}

    public void setAno(int a)
	{	ano = a;	}
	
	public int getAno()
	{	return ano;	}

	public data()
	{	
        System.out.print("Dia: ");
        dia = scanner.nextInt();
        System.out.print("Mes: ");
        mes = scanner.nextInt();
        System.out.print("Ano: ");
        ano = scanner.nextInt();
    }
	
	public void verificarEstacao()
	{	if(mes>=9 && mes<=12){
        System.out.println("PRIMAVERA!");
        }else if(mes>=3 && mes<=6){
            System.out.println("OUTONO!");
        }else if(mes>=6 && mes<=9){
            System.out.println("INVERNO!");
        }else System.out.println("VERAO!");
    
    }
	
	public void mostrarData()
	{	 System.out.println(dia+"/"+mes+"/"+ano);	}
	
	public void verificarBisexto()
	{	if(ano%2 == 0)
        {
            System.out.println("Ano BISEXTO!");
    } 	 else System.out.println("Nao BISEXTO!");
    }  
} 