import java.util.Scanner;


public class Exercicio7ParesImpar 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		
		int [] vetorCompleto = {1,2,3,4,5,6,7,8,9,10,11,10,6};
		
		int [] vetorPares = new int[vetorCompleto.length];
		int [] vetorImpares = new int[vetorCompleto.length];
		
		
		int contPar = 0;
		int contImpar = 0;
		
		for(int i=0; i<vetorCompleto.length; i++)
		{
			if(vetorCompleto[i] % 2 == 0)
			{
				vetorPares[contPar] = vetorCompleto[i];	
				contPar++;
			}
			
			if(vetorCompleto[i] % 2 != 0)
			{
				vetorImpares[contImpar] = vetorCompleto[i];
				contImpar++;
			}
		}
		
		
		for( int x: vetorPares)
		{
			if(x != 0)
			{
				System.out.println("Vetores pares  " +x);
			}
		}
		
		System.out.println();
		
		for( int x: vetorImpares)
		{			
			if(x != 0)
			{
				System.out.println("Vetores imprares  " +x);
			}
		}
		System.out.println();
		
		for (int x: vetorCompleto)
		{
			System.out.println("Vetor completo  " +x);
		}
		
		
	}
}
