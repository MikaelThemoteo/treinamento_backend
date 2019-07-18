import java.util.Scanner;
public class TrianguloApp {

	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Digite o lado A: ");
		double ladoA = TECLADO.nextDouble();
		System.out.print("Digite o lado B: ");
		double ladoB = TECLADO.nextDouble();
		System.out.print("Digite o lado C: ");
		double ladoC = TECLADO.nextDouble();
		
		Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
		System.out.println("É triangulo: " + triangulo.isTriangulo());
		System.out.println("Classificação : " + triangulo.getClassificacao());
	}
}
