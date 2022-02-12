package Ponto;

public class testePonto {
    public static void main(String[] args)
	{
		Ponto objP = new Ponto();
	
        objP.mostrarPonto();
        objP.moverH(5);
        objP.moverV(18);
        objP.moverHV(7, 8);
        objP.informarQuandrante();
        System.out.println("Distancia da Origem = "+objP.calcularDistanciaOrigem());
        

	}
    
}
