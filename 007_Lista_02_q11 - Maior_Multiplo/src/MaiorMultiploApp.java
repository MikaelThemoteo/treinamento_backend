import java.util.Scanner;
public class MaiorMultiploApp
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		MaiorMultiplo num = new MaiorMultiplo();
		System.out.print("Digite para k: ");
		num.setK(teclado.nextInt());
		System.out.print("Digite para n: ");
		num.setN(teclado.nextInt());
		System.out.println("O maior multiplo de " + num.getK() + " menor que " +
							num.getN() + " é: " + num.getMaiorMultiplo());
		teclado.close();
	}

}
