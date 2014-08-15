import java.util.Scanner;


public class Exercicio1VetorInteiros
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = teclado.nextInt();
		int [] vetor = new int[tam];
		
		for(int i = 0; i< vetor.length; i++)
		{
			System.out.println("Digite um numero");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i = tam -1; i >= 0; i--){
			System.out.println(vetor[i]);
		}
		
		int met = tam/2;
		
		for(int i = met, len = vetor.length; i<len; i++)
		{
			System.out.println("Metade eh " + vetor[i]);
		}
		
		for(int i = 0; i< vetor.length; i++)
		{
			if ((vetor[i] % 2) == 0)
			{
				System.out.println("Numeros pares " + vetor[i]);
			}
		}
		
		
	}	
	
}
