package Triangulo;

public class testeTriangulo {
    

public static void main(String[] args)
	{
		Triangulo objT = new Triangulo();
        System.out.println("Tipo = "+objT.verificarTipo());
		System.out.println("Perimetro = "+objT.calcularPerimetro());
		System.out.println("Area = "+objT.calcularArea());
       
	}
}