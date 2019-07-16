import java.util.Scanner;
public class ArredondadorApp 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite numero: ");
		Arredondador numero = new Arredondador(teclado.nextFloat());
		System.out.println("O valor arredondado é: " + numero.getNumeroArredondado());
		teclado.close();
	}

}
