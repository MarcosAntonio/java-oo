import java.util.Scanner;


public class Exemplo1 
{
	public static void main (String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Didigte o tamanho do vetor");
		int num = teclado.nextInt();
		
		//Cria um vetor notas, guarda o tamanho do vetor.
		double [] notas = new double[num];
		
		//Vare o vetor
		for(int i = 0; i < num; i++)
		{
			//Preenche o vetor os valores
			System.out.println("Digite a nota");
			notas[i] = teclado.nextDouble();
		}
		// varer para imprimir a 1 metade
		for (int i = 0; i < num/2; i++)
		{
			
		}
		//Saberquem eh o maior
		double maior = 0;
		for (int i = 0; i < num; i++)
		{
			if(notas[i]> maior)
			{
				maior = notas[i];
			}
		}
		System.out.println("Maior eh" + maior);
	}
}
