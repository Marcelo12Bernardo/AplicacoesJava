package ExemplosBase;

public class TiposDeVariaveis {
	public static void main(String[] args) {
		char caractereComEntradaAscii = 'A';
		char caractereComEntradaNumerica = 65;//'Letra A inserida através do valor ASCII correspondente'
		char caractereComEntradaUnicode = '\u0041';////'Letra A inserida através do valor UNICODE correspondente'
		System.out.println("Imprimindo a variável caractereComEntradaAscii: " + caractereComEntradaAscii);
		System.out.println("Imprimindo a variável caractereComEntradaNumerica: " + caractereComEntradaNumerica);
		System.out.println("Imprimindo a variável caractereComEntradaUnicode: " + caractereComEntradaUnicode);
		System.out.println("Imprimindo a conversão da variável caractereEntradaAscii para inteiro: " + (int)caractereComEntradaAscii);
		boolean valorBooleano = true;
		System.out.println("Imprimindo a variável booleana valorBoleano: " + valorBooleano);
		int inteiroComEntradaDecimal = 15;
		int inteiroComEntradaHexadecimal = 0xF;
		long inteiroLongo = 15l; //Para se utilizar uma constante long se faz necessário colocar a letra l na frente da mesma 
		float realComEntradaFloat = 15.1f; //Para se utilizar uma constante float se faz necessário colocar a letra f na frente da mesma
		double realComEntradaDouble = 15.1;
		System.out.println("Imprimindo a variável inteira inteiroComEntradaDecimal: " + inteiroComEntradaDecimal);
		System.out.println("Imprimindo a variável inteira inteiroComEntradaHexadecimal: " + inteiroComEntradaHexadecimal);
		System.out.println("Imprimindo a variável inteira inteiroLongo: " + inteiroLongo);
		System.out.println("Imprimindo a variável inteira realComEntradaFloat: " + realComEntradaFloat);
		System.out.println("Imprimindo a variável inteira realComEntradaDouble: " + realComEntradaDouble);
	}
}
