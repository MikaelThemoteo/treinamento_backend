import java.util.Date;
import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Pessoa 
{
	private Date dataDeNascimento;
	
	public Pessoa(Date dataDeNascimento)
	{
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public int getIdade()
	{
		GregorianCalendar nascimento = new GregorianCalendar();
		GregorianCalendar hoje = new GregorianCalendar();
		nascimento.setTime(dataDeNascimento);
		hoje.setTime(new Date());
		int idade = hoje.get(YEAR) - nascimento.get(YEAR);
		
		if(hoje.get(MONTH) < nascimento.get(MONTH))
		{
			idade --;
		}else if(hoje.get(MONTH) == nascimento.get(MONTH))
		{
			if(hoje.get(DAY_OF_MONTH) < nascimento.get(DAY_OF_MONTH))
			{
				idade --;
			}
		} 
		return idade;
	}
}
