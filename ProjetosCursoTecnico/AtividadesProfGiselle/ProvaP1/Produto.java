
import javax.swing.JOptionPane;

public class Livro
{
	//atributos comuns
	private String codigo;
	private String Nome;
	private int quantidade;
	private float precoUnitario;
	
	//metodos de acesso - atributos comuns
	public String getCodigo()
	{	return codigo;	}
	
	public void setCodigo(String codigo)
	{	this.codigo = codigo;	}
	
	public String getNome()
	{	return Nome;	}
	
	public void setNome(String Nome)
	{	this.Nome = Nome;	}
	
	public int getquantidade()
	{	return quantidade;	}
	
	public void setquantidade(int quantidade)
	{	this.quantidade = quantidade;	}
	
	public float getPrecoUnitario()
	{	return precoUnitario;	}
	
	public void setPrecoUnitario(float precoUnitario)
	{	this.precoUnitario = precoUnitario;	}
	
	//metodo construtor
	public Livro()
	{	codigo = JOptionPane.showInputDialog("Informe o codigo: ");
		Nome = JOptionPane.showInputDialog("Informe o nome: ");
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade: "));
		precoUnitario = Float.parseFloat(JOptionPane.showInputDialog("Informe o preco unitario: "));
	}
}