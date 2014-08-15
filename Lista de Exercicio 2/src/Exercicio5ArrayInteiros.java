import java.util.Scanner;


public class Exercicio5ArrayInteiros 
{
	public static void main(String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		int comparar = 0;
		
		System.out.println("Digite o tamanho do vetor");
		int tam = teclado.nextInt();
		int [] vet = new int[tam];
		
		for(int i =0; i < vet.length; i++)
		{
			System.out.println("Digite os numeros");
			vet[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < vet.length; i++)
		{
			comparar = vet[i];
			if(comparar > 7)
			{
				System.out.println("Maiores são  " + comparar);
			}
		}
	}
}
