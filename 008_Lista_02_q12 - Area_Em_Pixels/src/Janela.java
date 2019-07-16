
public class Janela
{
	private int x0;
	private int x1;
	private int y0;
	private int y1;
	
	public void steX0(int x0)
	{
		this.x0 = x0;
	}
	public void steX1(int x1)
	{
		this.x1 = x1;
	}
	
	public void steY0(int y0)
	{
		this.y0 = y0;
	}
	public void steY1(int y1)
	{
		this.y1 = y1;
	}
	
	public int getAreaDaJanela()
	{
		return (this.x0 - this.x1) * (this.y0 - this.y1);
	}

}
