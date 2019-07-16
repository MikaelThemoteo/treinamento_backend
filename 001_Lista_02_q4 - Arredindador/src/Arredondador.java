
public class Arredondador 
{
	private double numero;
		
	public Arredondador (float numero) 
	{
		this.numero = numero;		
	}
	
	public double getNumeroArredondado()
	{	int numeroConv;
		numeroConv = (int)(numero * 2) - (int)numero;
		return numeroConv;
	}

}