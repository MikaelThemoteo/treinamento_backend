
public class Mes
{
	private int numMes;
	private int mesNum;
	private int ano;
	private int qtdDias;
	private boolean bissexto;
	private String nomeMes;
	private String mesNome;

	public Mes(int numMes)		// Construtor recebendo numero do mes
	{
		this.numMes = numMes;
	}
	
	public Mes(String mesNome)		// Construtor recebendo nome do mes
	{
		this.mesNome = mesNome;
	}
	
	public void setAno(int ano)
	{
		this.ano = ano;
	}
	
	public int getQtdDias()
	{
		if (numMes == 2 && isBissexto())
		{
			qtdDias = 29;
		}else if (numMes == 2 && !isBissexto())
		{
			qtdDias = 28;
		}
		else if ((numMes % 2) == 0 && numMes != 2)
		{
			qtdDias = 30;
		}else if ((numMes % 2) != 0 && numMes != 2)
		{
			qtdDias = 31;
		}
		return qtdDias;
	}
	
	public boolean isBissexto() 	//Questão 12 resolvida aqui
	{
		if((ano % 100) != 0)
		{
			if((ano % 4) == 0)
			{
				bissexto = true;
			}
		}else bissexto = false;
		
		return bissexto;
	}
	
	public String getNomeMes()
	{
		switch(numMes)
		{
		case 1: nomeMes  = "Janeiro"; 		break;
		case 2: nomeMes  = "Feveiro";		break;
		case 3: nomeMes  = "Março";			break;
		case 4: nomeMes  = "Abril";			break;
		case 5: nomeMes  = "Maio";			break;
		case 6: nomeMes  = "Junho";			break;
		case 7: nomeMes  = "Julho";			break;
		case 8: nomeMes  = "Agosto";		break;
		case 9: nomeMes  = "Setembro";		break;
		case 10: nomeMes = "Outubro";		break;
		case 11: nomeMes = "Novembro";		break;
		case 12: nomeMes = "Dezembro";		break;
		}
		return nomeMes;
	}
	
	public int getNumMes()
	{
		this.mesNome.toLowerCase();
		if(mesNome.equals("janeiro"))		 mesNum = 1;
		else if(mesNome.equals("fevereiro")) mesNum = 2;
		else if(mesNome.equals("março")) 	 mesNum = 3;
		else if(mesNome.equals("abril")) 	 mesNum = 4;
		else if(mesNome.equals("maio")) 	 mesNum = 5;
		else if(mesNome.equals("junho")) 	 mesNum = 6;
		else if(mesNome.equals("julho")) 	 mesNum = 7;
		else if(mesNome.equals("agosto")) 	 mesNum = 8;
		else if(mesNome.equals("setembro"))  mesNum = 9;
		else if(mesNome.equals("outubro")) 	 mesNum = 10;
		else if(mesNome.equals("novembro"))  mesNum = 11;
		else if(mesNome.equals("dezembro"))  mesNum = 12;
		
		return mesNum;
	}
}
