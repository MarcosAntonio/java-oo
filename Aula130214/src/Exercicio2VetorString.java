import java.util.Scanner;


public class Exercicio2VetorString 
{
	public static void main(String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		int t = 0;
		String [] vetor = new String [t];
		
		for(int i = 0; i < vetor.length; i++)
		{
			System.out.println("Digite os nomes");
			vetor[i] = teclado.nextLine();
			//System.out.println("teste" +vetor[i]);
		}
		int aux = 0;
		int tam = vetor[0].length();
		
		for(int i = 0; i < vetor.length; i++)
		{
		
			if( tam < vetor[i].length() )
			{
				aux = i;
				tam = vetor[i].length();
			}
		}
		System.out.println("A maior String eh " + vetor[aux]);
	}
}
