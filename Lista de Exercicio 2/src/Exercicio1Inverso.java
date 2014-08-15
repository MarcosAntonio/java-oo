import java.util.Scanner;


public class Exercicio1Inverso 
{
	public static void main (String []agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = teclado.nextInt();
		
		int [] vetor = new int [tam];
		
		for(int i = 0; i<vetor.length; i++)
		{
			System.out.println("Digite os numeros" );
			vetor[i] = teclado.nextInt();
		}
		for(int i = tam -1; i >=0; i-- )
		{
			System.out.println(+ vetor[i]);
		}
	}
}
