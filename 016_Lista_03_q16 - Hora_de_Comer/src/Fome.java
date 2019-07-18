public class Fome 
{
	private int hora;
	private int minuto;
	
	public Fome(int hora, int minuto)
	{
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public String getProximaRefeicao()
	{
		String proxima = null;
		if(hora < 6 || (hora == 6 && minuto <= 30) || (hora >= 19 && minuto < 45))
		{
			proxima = "Cafe da manha";
		}else if(hora < 13 || (hora == 13 && minuto <= 0))
		{
			proxima = "Almoco";
		}else if(hora < 19 || (hora == 19 && minuto <= 45))
		{
			proxima = "Jantar";
		}
		return proxima;
	}

}
