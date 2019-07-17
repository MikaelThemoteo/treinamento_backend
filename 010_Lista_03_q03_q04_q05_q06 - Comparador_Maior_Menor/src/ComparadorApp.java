import java.util.Scanner;
public class ComparadorApp 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		double num1 = teclado.nextDouble();
		System.out.print("Digite o numero: ");
		double num2 = teclado.nextDouble();
		System.out.print("Digite o numero: ");
		double num3 = teclado.nextDouble();
		
		Comparador comparador = new Comparador(num1, num2, num3);
		System.out.println("O maior valor é: " + comparador.getMaior() + "\nO menor valor é: " + comparador.getMenor());
		teclado.close();
	}

}
