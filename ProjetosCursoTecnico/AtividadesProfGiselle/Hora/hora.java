package Hora;
import java.util.Scanner;

public class hora
{	
	private int horas=16;
	private int minutos=36;
    private int segundos=4;

    
    Scanner scanner = new Scanner(System.in);
	public void setHora(int h)
	{	horas = h;	}
	
	public int getHora()
	{	return horas;	}

    public void setMinutos(int m)
	{	minutos = m;	}
	
	public int getMinutos()
	{	return minutos;	}

    public void setSegundos(int s)
	{	segundos = s;	}
	
	public int getSegundos()
	{	return segundos;	}

	public hora()
	{	
        System.out.print("Hora: ");
        horas = scanner.nextInt();
        System.out.print("Minutos: ");
        minutos = scanner.nextInt();
        System.out.print("Segundos: ");
        segundos = scanner.nextInt();
    }
	
	public void verificarPeriodo()
	{	
        if(horas<12 && horas>4)
        {
            System.out.println("Manha");
        }else if(horas>12 && horas<18) 
        {
            System.out.println("Tarde");	
        } else if(horas>18 && horas<24) 
        {
            System.out.println("Noite");	
        }else if(horas<4)
        {
            System.out.println("Madrugada");
        }else System.out.println("Hora invalida");
    }
	
	public void mostrarHora()
	{	 
        if(horas<12)
        {
            System.out.println(horas+":"+minutos+":"+segundos+" AM");
        }else System.out.println(horas+":"+minutos+":"+segundos+" PM");	
    
    }
	
	
}