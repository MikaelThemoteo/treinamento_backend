import java.util.Scanner;
public class NumeroApp 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite n�mero: ");
		Numero numero = new Numero(teclado.nextInt());
		System.out.println("� par? " + numero.isPar() + "\n� impar? " + numero.isImpar()
							+ "\nO valor absoluto �: " + numero.getValorAbsoluto());
		teclado.close();
	}

}
