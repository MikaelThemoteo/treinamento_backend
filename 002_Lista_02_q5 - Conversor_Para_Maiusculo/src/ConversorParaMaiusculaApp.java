import java.util.Scanner;
public class ConversorParaMaiusculaApp {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite letra minuscula: ");
		ConversorParaMaiusculo letra = new ConversorParaMaiusculo(teclado.next().charAt(0));
		System.out.println("Essa letra maiuscula é: " + letra.getMaiuscula());
		teclado.close();
	}

}


