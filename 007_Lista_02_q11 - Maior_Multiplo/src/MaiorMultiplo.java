public class MaiorMultiplo 
{
	private int k;
	private int n;
	
	public void setK(int k)
	{
		this.k = k;
	}
	public int getK()
	{
		return k ;
	}
	public void setN(int n)
	{
		this.n = n;
	}
	public int getN()
	{
		return n ;
	}
	public int getMaiorMultiplo()
	{
		int numero = 0;
		if((n / k) * k < n )
		{
			numero = (n / k) *k;
		}else if((n / k) * k == n )
		{
			numero = ((n / k) * k) - k;
		}
		return numero;
	}

}
