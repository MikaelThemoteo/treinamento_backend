
public class Inteiro 
{
	private int inteiro;
	
	public Inteiro(int inteiro)
	{
		this.inteiro = inteiro;		
	}
	
	public int getUnidade()
	{
		return inteiro % 10;
	}
	
	public int getDezena()
	{
		return (inteiro/10) % 10;
	}
	
	public int getCentena()
	{
		return (inteiro / 100) % 10;
	}
}
