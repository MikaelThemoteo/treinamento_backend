import java.util.Scanner;
public class MesApp 
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		//************************************************
		// --------- Teste para quest�o 08 ---------------
		//************************************************
		
		System.out.print("Digite o numero: ");
		Mes mes = new Mes(teclado.nextInt());		
		System.out.println("O nome do m�s �: " + mes.getNomeMes());
		
		//************************************************
		// --------- Teste para quest�o 09 ---------------
		//************************************************
		
		System.out.print("Digite o nome do m�s: ");
		mes = new Mes(teclado.next());
		System.out.println("O numero do m�s �: " + mes.getNumMes());
		
		//************************************************
		// --------- Teste para quest�o 10/12 ------------
		//************************************************
		
		System.out.print("Digite o numero: ");
		mes = new Mes(teclado.nextInt());
		System.out.print("Digite o ano: ");
		mes.setAno(teclado.nextInt());
		System.out.println("A quantidade de dias do m�s �:  " + mes.getQtdDias() + 
							"\nAno bissexto: " + mes.isBissexto());
				
		teclado.close();
	}

}
