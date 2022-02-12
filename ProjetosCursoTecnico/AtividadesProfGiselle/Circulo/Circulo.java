package Circulo;
import java.util.Scanner;


public class Circulo
{
	
	private float raio;
	Scanner scanner = new Scanner(System.in);
	public void setRaio(float r)
	{	raio = r;	}
	
	public float getRaio()
	{	return raio;	}

	public Circulo()
	{	System.out.print("Informe o Raio: ");
		raio = scanner.nextFloat();	
	}

	public float calcularDiametro()
	{	return 2*raio;	}
	
	public double calcularArea()
	{	return Math.PI*Math.pow(raio,2);	}
	
	public double calcularPerimetro()
	{	return 2*Math.PI*raio;	}
}