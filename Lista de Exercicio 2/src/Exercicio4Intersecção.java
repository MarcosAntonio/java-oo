import java.util.Scanner;


public class Exercicio4Intersecção 
{
	public static void main(String[] agrs)
	{
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = teclado.nextInt();
		
		int [] vet1 = new int [tam];
		int [] vet2 = new int [tam];
		int [] vet3 = new int [tam];
		int comparar = 0;
		
		for ( int i = 0; i < vet1.length; i++ )
		{
			System.out.println("Digite os numeros do 1 vetor");
			vet1[i] = teclado.nextInt();
		}
		for (int i = 0; i < vet2.length; i++)
		{
			System.out.println("Digite os numeros do 2 vetor");
			vet2[i] = teclado.nextInt();
		}
		for(int i = 0; i < vet1.length; i++ )
		{
			comparar = vet1[i];
			for(int j = 0; j < vet2.length; j++)
			
				if(comparar == vet2[j])
				{
					vet3[j] = comparar;
					System.out.println("Os numeros iguais são:  " +vet3[j] );
				}
		
		}
	}
}
