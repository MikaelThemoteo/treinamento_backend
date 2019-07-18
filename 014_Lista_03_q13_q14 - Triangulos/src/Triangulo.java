public class Triangulo 
{
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double ladoA, double ladoB, double ladoC)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public boolean isTriangulo()
	{
		boolean isTriangulo = true;
		
		if(this.ladoA + this.ladoB < this.ladoC)
		{
			isTriangulo = false;
		}else if(this.ladoA + this.ladoC < this.ladoB)
		{
			isTriangulo = false;
		}else if(this.ladoB + this.ladoC < this.ladoA)
		{
			isTriangulo = false;
		}
		return isTriangulo;
	}
	
	public String getClassificacao()
	{
		String classificacao = null;
		if(!isTriangulo())
		{
			classificacao = "Nenhuma";
		}else if (this.ladoA == this.ladoB && this.ladoB == this.ladoC)
		{
			classificacao = "Equilatero";
		}else if (this.ladoA == this.ladoB || this.ladoB == this.ladoC || this.ladoA == this.ladoC)
		{
			classificacao = "Isosceles";
		}else 
		{
			classificacao = "Escaleno";
		}
		return classificacao;
	}

}
