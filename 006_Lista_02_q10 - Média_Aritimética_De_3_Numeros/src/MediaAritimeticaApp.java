import java.util.Scanner;
public class MediaAritimeticaApp {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		MediaAritimetica num = new MediaAritimetica();
		
		System.out.print("Digite o numero 1: ");
		num.setNum1(teclado.nextDouble());
		System.out.print("Digite o numero 2: ");
		num.setNum2(teclado.nextDouble());
		System.out.print("Digite o numero 3: ");
		num.setNum3(teclado.nextDouble());
		System.out.println("A média é :" + num.getMedia());
		teclado.close();
	}

}
