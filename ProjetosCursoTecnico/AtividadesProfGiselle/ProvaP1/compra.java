
import javax.swing.JOptionPane;

public class compra
{
	public static void main(String[] args)
	{
		String resposta = JOptionPane.showInputDialog("Pessoa fisica ou Juridica??");
		
		if(resposta.equalsIgnoreCase("Fisica"))
		{	PessoaFisica objA = new PessoaFisica();
			
		}
		else
		{	PessoaJuridica objP = new PessoaJuridica();
			
		}
	}
}