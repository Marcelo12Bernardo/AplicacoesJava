package	Quadrado;
import java.util.Scanner;

public class Quadrado
{
	private float lado;
	Scanner scanner = new Scanner(System.in);

	public void setLado(int l)
	{	lado = l;	}
	
	public float getLado()
	{	return lado;	}

	public Quadrado()
	{	
        System.out.print("Lado: ");
        lado = scanner.nextFloat();
    }
	
	public double calcularArea()
	{	return Math.pow(lado,2);	}
	
	public float calcularPerimetro()
	{	return 4*lado;	}
	
	public double calcularDiagonal()
	{	return Math.sqrt(2*Math.pow(lado,2));	}
}