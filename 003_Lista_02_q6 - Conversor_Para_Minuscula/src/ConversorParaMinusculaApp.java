import java.util.Scanner;
public class ConversorParaMinusculaApp {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite letra maiuscula: ");
		ConversorParaMinuscula letra = new ConversorParaMinuscula(teclado.next().charAt(0));
		System.out.println("Essa letra minuscula é: " + letra.getMinuscula());
		teclado.close();
	}

}


