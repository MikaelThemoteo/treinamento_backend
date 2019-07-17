import java.util.Scanner;
public class EquacaoSegundoGrauApp
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite 'a': ");
		double a = teclado.nextDouble();
		System.out.print("Digite 'b': ");
		double b = teclado.nextDouble();
		System.out.print("Digite 'c': ");
		double c = teclado.nextDouble();
		
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a,b,c);
		
		if(equacao.getDelta() < 0)
		{
			System.out.println(equacao.getDelta() + "\nNão possui raizes reais.");
		}
		if(equacao.getDelta() == 0)
		{
			if(equacao.getX1()!=0)
			{
				System.out.println(equacao.getDelta() + "\nX1: " + equacao.getX1());
			}else if(equacao.getX2()!=0)
			{
				System.out.println("X1: " + equacao.getX2());
			}
		}
		
		if(equacao.getDelta() > 0)
		{
			System.out.println(equacao.getDelta() + "\nX1: " + equacao.getX1());
			System.out.println("X2: " + equacao.getX2());
			
		}
		
		teclado.close();
		
	}

}
