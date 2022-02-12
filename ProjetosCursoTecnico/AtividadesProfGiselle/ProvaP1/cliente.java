
import javax.swing.JOptionPane;

public abstract class cliente
{
	
	protected String nome;
	
	protected Endereco atRefEndereco;
	protected Telefone atRefTelefone;
		
	//metodos de acesso - atributo comum
	public String getNome()
	{	return nome;	}

	public void setNome(String nome)
	{	this.nome = nome;	}
	
	//metodos de acesso - atriburos de referencia	
	public Endereco getAtRefEndereco()
	{	return atRefEndereco;	}

	public void setAtRefEndereco(Endereco atRefEndereco)
	{	this.atRefEndereco = atRefEndereco;	}

	public Telefone getAtRefTelefone()
	{	return atRefTelefone;	}

	public void setAtRefTelefone(Telefone atRefTelefone)
	{	this.atRefTelefone = atRefTelefone;	}

	//metodos de acesso - atributos de referencia
	public Pedido getatRefPedido()
	{	return atRefPedido;	}

	public void setatRefPedido(Pedido atRefPedido)
	{	this.atRefPedido = atRefPedido;	}

	//metodos de acesso - atributos de referencia
	public Pedido getatRefFatura()
	{	return atRefFatura;	}

	public void setAtRefPedido(Pedido atRefFatura)
	{	this.atRefFatura = atRefFatura;	}

	//atributos de referencia
	private cliente atRefPedido;
	private cliente atRefFatura;

	//metodo construtor
	public cliente()
	{	nome = JOptionPane.showInputDialog("Informe o nome: ");
		atRefEndereco = new Endereco();
		atRefTelefone = new Telefone();
	}
	
	
	public void FazerPedido()
	{	
		atRefPedido = new Pedido();	
	}
	public void ImprimirFatura()
	{	
		atRefFatura = new fatura();	
	}
}