
public class Numero
{
	private int numero;
	private boolean par;
	private boolean impar;

	public Numero(int numero)
	{
		this.numero = numero;
	}

	public boolean isPar()
	{
		if(numero % 2 == 0) 
		{
			par = true;
		}else par = false;
		return par;
	}
	
	public boolean isImpar()
	{
		if(!isPar()) 
		{
			impar = true;
		}else impar = false;
		return impar;
	}
	
	public int getValorAbsoluto()
	{
		if(numero < 0)
		{
			numero = numero * -1;
		}
		return numero;
	}

}
