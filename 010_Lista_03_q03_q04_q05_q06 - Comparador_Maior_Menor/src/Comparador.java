
public class Comparador 
{
	private double num1;
	private double num2; 
	private double num3;
	private double maior;
	private double menor;
	
	public Comparador(double num1, double num2, double num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public double getMaior()
	{
		if(num1 == num2 && num1 == num3 )
		{maior = num1;
		}else if(num1 > num2 && num1 > num3 )
		{maior = num1;
		}else if(num2 > num1 && num2 > num3 )
		{maior = num2;
		}else if(num3 > num2 && num3 > num1 )
		{maior = num3;
		}
		
		return maior;
	}
	
	public double getMenor()
	{
		if(num1 == num2 && num1 == num3 )
		{menor = num1;
		}else if(num1 < num2 && num1 < num3 )
		{menor = num1;
		}else if(num2 < num1 && num2 < num3 )
		{menor = num2;
		}else if(num3 < num2 && num3 < num1 )
		{menor = num3;
		}
		
		return menor;
	}
	
	
}
