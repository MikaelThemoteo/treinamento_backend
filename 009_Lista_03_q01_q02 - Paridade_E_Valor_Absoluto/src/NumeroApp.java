import java.util.Scanner;
public class NumeroApp 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite número: ");
		Numero numero = new Numero(teclado.nextInt());
		System.out.println("É par? " + numero.isPar() + "\nÉ impar? " + numero.isImpar()
							+ "\nO valor absoluto é: " + numero.getValorAbsoluto());
		teclado.close();
	}

}
