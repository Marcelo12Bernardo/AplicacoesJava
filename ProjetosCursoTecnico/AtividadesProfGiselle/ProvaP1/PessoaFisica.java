
import javax.swing.JOptionPane;

public class PessoaFisica extends cliente
{
	//atributos
	private String cpf;
	private String dataNascimento;
	
	//metodos de acesso
	public String getCpf()
	{	return cpf;	}
	
	public void setCpf(String cpf)
	{	this.cpf = cpf;	}
	
	public String getDataNascimento()
	{	return dataNascimento;	}
	
	public void setDataNascimento(String dataNascimento)
	{	this.dataNascimento = dataNascimento;	}
	
	//metodo construtor
	public PessoaFisica()
	{	super();
		cpf = JOptionPane.showInputDialog("Informe o CPF: ");
		dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento: ");
		imprimirDados();
	}
	
	//operacoes
	public void imprimirDados()
	{	
		JOptionPane.showMessageDialog(null,"CPF: "+cpf);
		JOptionPane.showMessageDialog(null,"DATA DE NASICMENTO: "+dataNascimento);		
	}
}