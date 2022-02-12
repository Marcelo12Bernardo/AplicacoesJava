package NumeroInteiro;

public class testeNumero {
    public static void main(String[] args)
	{
		NumeroInteiro objN = new NumeroInteiro();
        
        System.out.println("Raiz Quadrada = "+objN.calcularRaiz2());
		System.out.println("Raiz Cubica = "+objN.calcularRaiz3());
		System.out.println("Potencia = "+objN.calcularPotencia(9));
        System.out.println("Fatorial = "+objN.calcularFatorial());
        objN.informarParouImpar();
        objN.informarPrimo();
        
	}
    
}
