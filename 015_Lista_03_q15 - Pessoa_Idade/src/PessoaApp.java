import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static java.util.GregorianCalendar.*;

public class PessoaApp 
{
	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Digite dia: ");
		int dia = TECLADO.nextInt();
		
		System.out.print("Digite mes: ");
		int mes = TECLADO.nextInt();
		
		System.out.print("Digite ano: ");
		int ano = TECLADO.nextInt();
		
		GregorianCalendar aniversario = new GregorianCalendar(ano, mes - 1, dia);
		Pessoa pessoa = new Pessoa(aniversario.getTime());
		
		System.out.println("Idade: " + pessoa.getIdade());
	}

}
