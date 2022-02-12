package NumeroInteiro;
import java.util.Scanner;

public class NumeroInteiro
{
	Scanner scanner = new Scanner(System.in);
	private int valor;
	
	public void setNumero(int n)
	{	valor = n;	}
	
	public int getNumero()
	{	return valor;	}

	public NumeroInteiro()
	{ 
		System.out.print("Numero: ");
		valor= scanner.nextInt();
	}

	public double calcularRaiz2()
	{	return Math.sqrt(valor);	}
	
	public double calcularRaiz3()
	{	return Math.cbrt(valor);	}
	
	public void informarParouImpar()
	{	if(valor%2==0)
		{	System.out.println("Numero e PAR!");	}
		else
		{	System.out.println("Numero e IMPAR!");;	}
	}

	public double calcularPotencia(float exp)
	{	return Math.pow(valor,exp);		}
	
	public int calcularFatorial()
	{	int fat=1;
		if(valor>1)
		{	for(int i=1;i<=valor;i++)
			{	fat = fat*i;	}
		}
		return fat;
	}
	
	public void informarPrimo()
	{	int cont=0;
		for(int i=1;i<=valor;i++)
		{	if(valor%i==0)
			{	cont++;	}
		}
		if(cont==2)
		{	System.out.println("Numero Primo!");	}
		else
		{	System.out.println("Numero nao e Primo!");	}
	}
}