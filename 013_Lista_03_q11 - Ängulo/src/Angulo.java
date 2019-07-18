public class Angulo 
{
	private float angulo;
	private int quadrante;
	
	public void setAngulo(float angulo)
	{
		this.angulo = angulo;
	}
	
	public int getAngulo()
	{
		if(angulo >= 0 && angulo <= 90)
		{
			quadrante = 1; 
		}else if(angulo > 90 && angulo <= 180)
		{
			quadrante = 2; 
		}else if(angulo > 180 && angulo <= 270)
		{
			quadrante = 3; 
		}if(angulo > 270 && angulo <= 360)
		{
			quadrante = 4; 
		}
		return quadrante;
	}
	

}
