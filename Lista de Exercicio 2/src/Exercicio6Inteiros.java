import java.util.Scanner;


public class Exercicio6Inteiros 
{
	public static void main(String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		int [] vet = new int[5];
		
		for(int i = 0; i < vet.length; i++)
		{
			System.out.println("Digite os numeros");
			vet[i] = teclado.nextInt();
		}
		int x = 0;
		System.out.println("Digite o numero que você quer consultar");
		x = teclado.nextInt();
		
		int comparar = 0;
		for(int i = 0; i < vet.length; i++)
		{
		
			if(x == vet[i])
			{
				comparar++;
			}
		}
		System.out.println("O numero  " + x+ " apareceu  " +comparar+ " vezes");
		
	}
}
