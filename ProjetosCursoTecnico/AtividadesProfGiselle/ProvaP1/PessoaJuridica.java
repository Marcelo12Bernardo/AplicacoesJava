

import javax.swing.JOptionPane;

public class PessoaJuridica extends cliente
{
	//atributos
		private String cnpj;
		private String razaoSocial;
		
		//metodos de acesso
		public String getCnpj()
		{	return cnpj;	}

		public void setCnpj(String cnpj)
		{	this.cnpj = cnpj;	}

		public String getRazaoSocial()
		{	return razaoSocial;		}

		public void setRazaoSocial(String razaoSocial)
		{	this.razaoSocial = razaoSocial;		}

		//metodo construtor
		public PessoaJuridica()
		{	super();
			cnpj = JOptionPane.showInputDialog("Informe o CNPJ: ");
			razaoSocial = JOptionPane.showInputDialog("Informe a razao social: ");
			imprimirDados();
		}
		
		//operacoes
		public void imprimirDados()
		{	
			JOptionPane.showMessageDialog(null,"CNPJ: "+cnpj);
			JOptionPane.showMessageDialog(null,"RAZAO SOCIAL: "+razaoSocial);		
		}
}