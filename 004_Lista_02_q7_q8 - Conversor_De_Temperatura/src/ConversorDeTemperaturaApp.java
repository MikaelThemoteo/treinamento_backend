import java.util.Scanner;

public class ConversorDeTemperaturaApp 
{
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		ConversorDeTemperatura temperatura = new ConversorDeTemperatura();
				
		System.out.print("Digite a temperatura C: ");
		temperatura.setTCelsius(teclado.nextDouble());
		System.out.println("A temperatura C em F é: " + temperatura.getTFarenheit());
		
		System.out.print("Digite a temperatura F: ");
		temperatura.setTFarenheit(teclado.nextDouble());
		System.out.println("A temperatura F em C é: " + temperatura.getTCelsius());
		
		teclado.close();
	}

}
