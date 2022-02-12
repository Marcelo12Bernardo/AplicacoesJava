package Retangulo;
import java.util.Scanner;

public class Retangulo
{	
	private float base;
	private float altura;
	Scanner scanner = new Scanner(System.in);

	public void setBase(int b)
	{	base = b;	}
	
	public float getBase()
	{	return base;	}

	public void setAltura(int h)
	{	altura = h;	}
	
	public float getAltura()
	{	return altura;	}

	public Retangulo()
	{	
        System.out.print("Base: ");
        base = scanner.nextFloat();
		System.out.print("Altura: ");
        altura = scanner.nextFloat();
    }

	public float calcularArea()
	{	return base*altura;		}
	
	public float calcularPerimetro()
	{	return 2*(base+altura);		}
	
	public double calcularDiagonal()
	{	return Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)); 	}
}