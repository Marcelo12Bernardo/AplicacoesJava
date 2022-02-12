
import javax.swing.JOptionPane;

public class Pedido
{
	//atributos comuns
	private String dataPedido;
	private int quantidade;
	private int numPedido;
	
	//atributos de referencia
	private Pedido atRefPedido;
	private Pedido atRefUsuario;

	//metodos de acesso - atributos comuns
	public String getdataPedido()
	{	return dataPedido;	}
	
	public void setdataPedido(String dataPedido)
	{	this.dataPedido = dataPedido;	}
	
	public int getnumPedido()
	{	return numPedido;	}
	
	public void setnumPedido(int numPedido)
	{	this.numPedido = numPedido;	}

	public int getquantidade()
	{	return quantidade;	}
	
	public void setquantidade(int quantidade)
	{	this.quantidade = quantidade;	}

	//metodos de acesso - atributos de referencia
	public Pedido getAtRefPedido()
	{	return atRefPedido;	}

	public void setAtRefPedido(Pedido atRefPedido)
	{	this.atRefPedido = atRefPedido;	}

	//metodo construtor
	public Pedido()
	{	dataPedido = JOptionPane.showInputDialog("Informe a data do pedido: ");
		numPedido = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do pedido: "));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
		gerarPedido();
	}
	
	//operacao
	public void gerarPedido()
	{	atRefPedido = new Pedido();	}
}