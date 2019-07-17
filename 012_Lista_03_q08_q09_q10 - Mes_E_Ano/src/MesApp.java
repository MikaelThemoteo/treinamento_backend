import java.util.Scanner;
public class MesApp 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		//************************************************
		// --------- Teste para questão 08 ---------------
		//************************************************
		
		System.out.print("Digite o numero: ");
		Mes mes = new Mes(teclado.nextInt());		
		System.out.println("O nome do mês é: " + mes.getNomeMes());
		
		//************************************************
		// --------- Teste para questão 09 ---------------
		//************************************************
		
		System.out.print("Digite o nome do mês: ");
		mes = new Mes(teclado.next());
		System.out.println("O numero do mês é: " + mes.getNumMes());
		
		//************************************************
		// --------- Teste para questão 10/12 ------------
		//************************************************
		
		System.out.print("Digite o numero: ");
		mes = new Mes(teclado.nextInt());
		System.out.print("Digite o ano: ");
		mes.setAno(teclado.nextInt());
		System.out.println("A quantidade de dias do mês é:  " + mes.getQtdDias() + 
							"\nAno bissexto: " + mes.isBissexto());
				
		teclado.close();
	}

}
