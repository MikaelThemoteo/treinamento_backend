import java.util.Scanner;
public class InteiroApp 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		Inteiro inteiro = new Inteiro(teclado.nextInt());
		System.out.println("Algar�smos das unidades: " + inteiro.getUnidade());
		System.out.println("Algar�smos das dezenas: " + inteiro.getDezena());
		System.out.println("Algar�smos das centenas: " + inteiro.getCentena());
		
		teclado.close();
	}

}
