import java.util.Scanner;
public class FomeApp 
{
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Hora atual: ");
		int hora = TECLADO.nextInt();
		
		System.out.print("Minuto atual: ");
		int minuto = TECLADO.nextInt();
		
		Fome fome = new Fome(hora, minuto);
		
		System.out.println("Proxima refeicao: " + fome.getProximaRefeicao());
	}


}
