
public class ConversorParaMaiusculo 
{
	private char letra;
	
	public ConversorParaMaiusculo(char letra)
	{
		this.letra = letra;
	}
	
	public char getMaiuscula()
	{
		return (char)(letra - ('z' - 'Z'));
	}
}
