
package modelo;

import javax.swing.JOptionPane;


public class Produto {
	private String codigo;
	private String nome;
        private int quantidade;
	private float preco;
	
	public String getCodigo()
	{	return codigo;	}
	
	public void setCodigo(String cd)
	{	this.codigo = cd;	}

	public String getNome()
	{	return nome;	}
	
	public void setNome(String nome)
	{	this.nome = nome;	}
	
	public int getQuantidade()
	{	return quantidade;	}
	
	public void setQuantidade(int quantidade)
	{	this.quantidade = quantidade;	}
        
        public float getPreco()
	{	return preco;	}
	
	public void setPreco(float preco)
	{	this.preco = preco;	}
	
	
	public Produto(String cod,String nam,String qua,String pre)
	{	codigo = cod;
		nome = nam;
		quantidade = Integer.parseInt(qua);
                preco = Float.parseFloat(pre);
	}
    
}
