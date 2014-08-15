
public class TesteIf 
{
	public static void main (String [] args)
	{
		int x = 10;
		int y = 7;
		int soma;
		int subitracao;
		int multiplicacao;
		int divisao;
		int resto;
		
		
		System.out.println (soma = x+y);
		System.out.println (subitracao = x-y);
		System.out.println (multiplicacao = x*y);
		System.out.println (divisao = x/y);
		System.out.println (resto = x%y);
		
		if (resto >= 1 && resto <= 5)
		{
			System.out.println("Baixo");
		
		}
		else if (resto >= 6 && resto <=10)
		{
			System.out.println("Médio");
		}
		else if (resto >= 11 && resto <=20)
		{
			System.out.println("Alto");
		}else
		{
			System.out.println("Perfeito");
		}
		
		
	}
}
