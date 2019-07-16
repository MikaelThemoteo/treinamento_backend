
public class Produto 
{
	private double preco;
	private double desconto;
	
	public void setPreco(double preco)
	{
		this.preco = preco;
	}
	public void setDesconto(double desconto)
	{
		this.desconto = desconto;
	}
	
	public double getPrecoComDesconto()
	{
		return preco - (preco * desconto/100);
	}
	
}
