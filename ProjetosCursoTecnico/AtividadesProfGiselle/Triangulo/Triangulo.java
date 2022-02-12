package Triangulo;
import java.util.Scanner;

public class Triangulo
{
	private float base;
	private float altura;
	private float lado1;
	private float lado2;
	private String tipo ;
	Scanner scanner = new Scanner(System.in);

	public void setBase(int b)
	{	base = b;	}
	
	public float getBase()
	{	return base;	}

	public void setAltura(int h)
	{	altura = h;	}
	
	public float getAltura()
	{	return altura;	}

	public void setLado1(int l1)
	{	lado1 = l1;	}
	
	public float getLado1()
	{	return lado1;	}

	public void setLado2(int l2)
	{	lado2 = l2;	}
	
	public float getLado2()
	{	return lado2;	}

	public void setTipo(String t)
	{	tipo = t;	}
	
	public String getTipo()
	{	return tipo;	}

	public Triangulo()
	{	
        System.out.print("Base: ");
        base = scanner.nextFloat();
		System.out.print("Altura: ");
        altura = scanner.nextFloat();
		System.out.print("Lado 1: ");
        lado1 = scanner.nextFloat();
		System.out.print("Lado 2: ");
        lado2 = scanner.nextFloat();
		System.out.print("Tipo: ");
        tipo = scanner.nextLine();
		
    }

	public String verificarTipo()
	{ 
		if((lado1==lado2)&&(lado2==base))
		{ 
			tipo= "equilatero";
		}else if((lado1!=lado2)&&(lado2!=base)&&(base!=lado1))
		{
			tipo="escaleno";
		}else tipo = "isoceles";
		
		return tipo;
	
	}
	
	public float calcularArea()
	{	return (base*altura)/2;	}
	
	public double calcularPerimetro()
	{	
		return lado1+lado2+base;
	}

	

}