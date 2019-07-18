import java.util.Scanner;
public class AnguloApp
{
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Angulo angulo = new Angulo();
		System.out.print("Digite o valor do angulo: ");
		angulo.setAngulo(TECLADO.nextFloat());
		
		System.out.println("Esse angulo pertence ao quadrante: " + angulo.getAngulo());
	}

}
