import java.util.Scanner;


public class Exemplo1 
{
	
	
	public static void main(String[] args) 
	{	
		final int TAM = 10;
		
		Scanner teclado = new Scanner(System.in);
		
		int [] vetor = new int [TAM];
		
		for(int i = 0; i<TAM; i++)
		{
			System.out.println("Digite um numero");
			vetor[i] = teclado.nextInt();
		}
		int soma =0;
		
		for (int i = 0; i<TAM; i++)
		{
			soma += vetor[i]; 
		}
		double media = soma/TAM;
		
		System.out.println("A mediaeh " +media);

	}

}
