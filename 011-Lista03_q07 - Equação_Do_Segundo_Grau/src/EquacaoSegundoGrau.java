import java.lang.Math;
public class EquacaoSegundoGrau 
{
	private double a;
	private double b;
	private double c;
	private double delta;
	private int qtdRaiz;
	
	public EquacaoSegundoGrau(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDelta()
	{
		delta = (b*b) - (4*a*c);
		return delta;
	}
	
	public int getQtdRaiz()
	{
		if(getDelta() > 0)
		{
			qtdRaiz = 2;
		}else if(getDelta() == 0)
		{
			qtdRaiz = 1;
		}else if(getDelta() > 0)
		{
			qtdRaiz = 2;
		}else qtdRaiz = 0;
		return qtdRaiz;
	}
	
	public double getX1()
	{
		return (b + Math.sqrt(getDelta())) / 2*a;
	}
	
	public double getX2()
	{
		return (b - Math.sqrt(getDelta())) / 2*a;
	}

}
