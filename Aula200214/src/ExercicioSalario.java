import java.util.Scanner;


public class ExercicioSalario 
{
	public static void main (String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		final double MINIMO =724;
		
		String [] vetString = new String [5];
		double [] vetdouble = new double [5];
		
		double soma = 0;
		double media;
		
		for (int i = 0; i < vetString.length; i++)
		{
			System.out.println("Digite os nomes ");
			vetString[i] = teclado.next();
		}	
			for(int i = 0; i < vetdouble.length; i++)
			{	
				System.out.println("Digite o salario da pessoa " +vetString[i]);
				vetdouble[i] = teclado.nextDouble();
				soma = soma + vetdouble[i];
			}
			media = soma / 5;
			System.out.println("A media salarial eh " +media);
			
			for (int i =0; i < vetdouble.length; i++)
			{
				if (vetdouble[i] == MINIMO )
				{
					System.out.println("O funcionario que recebe salario minimo " +vetString[i]);
				}else if (vetdouble[i] > MINIMO)
				{
					System.out.println("O funcionario que recebe mais que um salario " + vetString[i]);
				}else if (vetdouble[i] < MINIMO)
				{
					System.out.println("O funcionario que recebe menos que umsalario minimo " +vetString[i]);
				}
			}
			
			double maior = 0;
		
			for (int i = 0; i < vetdouble.length; i++)
			{
				if ( vetdouble[i] > maior)
				{
					maior = vetdouble[i];
					
				}
				
			}
			System.out.println("O maior salario eh  " +maior);
	}
}
