package Circulo;

public class testeCirculo
{
	public static void main(String[] args)
	{
		Circulo objC = new Circulo();
	
        System.out.println("Diametro = "+objC.calcularDiametro());
		System.out.println("Area = "+objC.calcularArea());
		System.out.println("Perimetro = "+objC.calcularPerimetro());
	}
}