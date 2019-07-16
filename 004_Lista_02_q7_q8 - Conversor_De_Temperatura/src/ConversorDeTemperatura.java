
public class ConversorDeTemperatura 
{
	private double temp;
	
	public void setTCelsius(double temp) {
		this.temp = temp;
	}
	
	public void setTFarenheit(double temp) {
		this.temp = temp;
	}
	
	public double getTCelsius()
	{
		return (this.temp - 32 ) * 5/9;
	}
	
	public double getTFarenheit()
	{
		return (this.temp * 9/5) + 32 ;
	}
}
