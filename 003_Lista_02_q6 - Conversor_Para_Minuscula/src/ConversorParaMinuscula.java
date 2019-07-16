
public class ConversorParaMinuscula 
{
	private char letra;

	public ConversorParaMinuscula(char letra)
	{
		this.letra = letra;
	}

	public char getMinuscula()
	{
		return (char)(letra + ('z' - 'Z'));
	}
}
