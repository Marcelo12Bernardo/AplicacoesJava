package Ponto;
import java.util.Scanner;
public class Ponto
{
	private float x;
	private float y;
	
	
    Scanner scanner = new Scanner(System.in);
	public void setDia(int px)
	{	x = px;	}
	
	public float getX()
	{	return x;	}

    public void setY(int py)
	{	y = py;	}
	
	public float getY()
	{	return y;	}

	public Ponto()
	{	
        System.out.print("X: ");
        x = scanner.nextFloat();
        System.out.print("Y: ");
        y = scanner.nextFloat();
       
    }

	public void mostrarPonto()
	
	{	System.out.println("P("+x+","+y+")");	}
	
	public void moverH(float px)
	{	x = x + px;	}

	public void moverV(float py)
	{	y = y + py;	}
	
	public void moverHV(float px,float py)
	{	x = x + px;
		y = y + py;	
	}
	
	public double calcularDistanciaOrigem()
	{	return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));	}

	public void informarQuandrante()
	{	if((x>0)&&(y>0))
		{	System.out.println("1 quadrante!");	}
		else if ((x<0)&&(y>0))
		{	System.out.println("2 quadrante!");	}
		else if ((x<0)&&(y<0))
		{	System.out.println("3 quadrante!");	}
		else if ((x>0)&&(y<0))
		{	System.out.println("4 quadrante!");	}
		else
		{	System.out.println("Origem!");	}
	}
}