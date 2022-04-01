
package apresentacao;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import modelo.Produto;

public class TelaProduto extends JFrame {

	private JLabel lCodigo,lNome,lPreco,lQuantidade;
	private JTextField tCodigo,tNome,tPreco,tQuantidade;
	private JButton bSalvar,bListar,bLimpar,bFechar;
	private JPanel painelTopo,painelCentral,painelInferior;
	private int screenHeight;
	private int screenWidth;

	private Produto produto;
	
	String codigo,nome,preco,quantidade;

	
	public TelaProduto()
	{
                this.setTitle("Tela De Cadastro De Produto");
                Toolkit tk = Toolkit.getDefaultToolkit();
                Dimension d = tk.getScreenSize();
                screenHeight = d.height-400;
                screenWidth = d.width-950;
                this.setSize(screenWidth,screenHeight);
                this.setResizable(false);
                this.setLocationRelativeTo(null); 
                this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		Container c = this.getContentPane();
				
		BorderLayout layout = new BorderLayout(5,5);
		c.setLayout(layout);
		
		JPanel painelSuperior = new JPanel();
		JLabel texto = new JLabel("     TELA DE PRODUTO");
		texto.setFont(new Font ("Arial",Font.BOLD,20));
		painelSuperior.add(texto);
		c.add(painelSuperior,BorderLayout.NORTH);	 
		
		JPanel painelCentral = new JPanel();
		GridLayout layoutCentral = new GridLayout(5,2,5,5);
		painelCentral.setLayout(layoutCentral);

		//ao painel central de acordo com o gerenciador de layout definido 
		lCodigo = new JLabel("     Codigo do Produto: ");
		lCodigo.setFont(new Font ("Arial",Font.BOLD,16));
		painelCentral.add(lCodigo);	
		
		tCodigo = new JTextField();
		painelCentral.add(tCodigo);

		lNome = new JLabel("     Nome do Produto: ");
		lNome.setFont(new Font ("Arial",Font.BOLD,16));
		painelCentral.add(lNome);	
		
		tNome = new JTextField();
		painelCentral.add(tNome);
				
		lPreco = new JLabel("     Preco do Produto: ");
		lPreco.setFont(new Font ("Arial",Font.BOLD,16));
		painelCentral.add(lPreco);
		
		tPreco = new JTextField();
		painelCentral.add(tPreco);
		
		lQuantidade = new JLabel("     Quantidade de Produto: ");
		lQuantidade.setFont(new Font ("Arial",Font.BOLD,16));
		painelCentral.add(lQuantidade);
		
		tQuantidade = new JTextField();
		painelCentral.add(tQuantidade);

		JPanel painelInferior = new JPanel();
		GridLayout layoutInferior = new GridLayout(1,4,0,0);
		painelInferior.setLayout(layoutInferior);
		
		//criando classe interna para funcionar como ouvinte dos eventos de mouse
		class BatSinal extends MouseAdapter {
			public void mouseClicked(MouseEvent e) {
				//se o bot�o Salvar for clicado pelo mouse...
				if (e.getSource() == bSalvar)
				{	codigo = tCodigo.getText();
					nome = tNome.getText();
                                        preco = tPreco.getText();
					quantidade = tQuantidade.getText();
					produto = new Produto(codigo,nome,quantidade,preco);
					JOptionPane.showMessageDialog(null,"Produto salvo com sucesso!");
				}
				//se o bot�o Listar for clicado pelo mouse...				
				if (e.getSource() == bListar)
				{	if(produto==null)
					{	JOptionPane.showMessageDialog(null,"Nao tem o que listar!");	}
					else
					{	JOptionPane.showMessageDialog(null,"DADOS DO PRODUTO:"
						+ "\nCodigo: "+produto.getCodigo()
						+ "\nNome: "+produto.getNome()
						+ "\nPreco: "+produto.getPreco()
						+ "\nQuantidade: "+produto.getQuantidade());
					}
				}	
				//se o bot�o Limpar for clicado pelo mouse...				
				if (e.getSource() == bLimpar)
				{	tCodigo.setText("");
					tNome.setText("");
					tPreco.setText("");
					tQuantidade.setText("");
				}	
				//se o bot�o Fechar for clicado pelo mouse...
				if (e.getSource() == bFechar)
				{	dispose();	}
			}
		}
		
		//adicionando ouvinte do mouse para os bot�es
		BatSinal batman = new BatSinal();
		
		bSalvar = new JButton("Salvar");
		bSalvar.setFont(new Font ("Arial",Font.BOLD,16));
		bSalvar.setForeground(Color.white);
		bSalvar.setBackground(new Color(3,101,173));
		bSalvar.addMouseListener(batman); //aplicando o ouvinte do mouse a cada bot�o
		painelInferior.add(bSalvar);
		
		bListar = new JButton("Listar");
		bListar.setFont(new Font ("Arial",Font.BOLD,16));
		bListar.setForeground(Color.white);
		bListar.setBackground(new Color(3,101,173));
		bListar.addMouseListener(batman); //aplicando o ouvinte do mouse a cada bot�o
		painelInferior.add(bListar);

		bLimpar = new JButton("Limpar");
		bLimpar.setFont(new Font ("Arial",Font.BOLD,16));
		bLimpar.setForeground(Color.white);
		bLimpar.setBackground(new Color(3,101,173));
		bLimpar.addMouseListener(batman); //aplicando o ouvinte do mouse a cada bot�o
		painelInferior.add(bLimpar);
		
		bFechar = new JButton("Fechar");
		bFechar.setFont(new Font ("Arial",Font.BOLD,16));
		bFechar.setForeground(Color.white);
		bFechar.setBackground(new Color(3,101,173));
		bFechar.addMouseListener(batman); //aplicando o ouvinte do mouse a cada bot�o
		painelInferior.add(bFechar);
					
		
		c.add(painelCentral,BorderLayout.CENTER);
		c.add(painelInferior,BorderLayout.SOUTH);
		
		this.repaint();
		this.setVisible(true);
	}
    
}
