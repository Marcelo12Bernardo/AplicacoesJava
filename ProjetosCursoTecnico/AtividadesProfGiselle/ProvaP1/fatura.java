import javax.swing.JOptionPane;

public class fatura {

    //atributos comuns
	private String dataVencimento;
	private int valorTotal;
	private int numFatura;
    //metodos de acesso - atributos comuns
	public String getdataVencimento()
	{	return dataVencimento;	}
	
	public void setdataVencimento(String dataVencimento)
	{	this.dataVencimento = dataVencimento;	}
	
	public int getnumFatura()
	{	return numFatura;	}
	
	public void setnumFatura(int numFatura)
	{	this.numFatura = numFatura;	}

	public int getvalorTotal()
	{	return valorTotal;	}
	
	public void setvalorTotal(int valorTotal)
	{	this.valorTotal = valorTotal;	}


	//metodo construtor
	public fatura()
	{	dataVencimento = JOptionPane.showInputDialog("Informe a data de vencimento da fatura: ");
		numFatura = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da  fatura: "));
	}

}
