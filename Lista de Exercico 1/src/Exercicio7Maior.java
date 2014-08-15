import java.util.Scanner;


public class Exercicio7Maior 
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		int menor = Integer.MAX_VALUE;          
        int maior = 0; 
		
		for (int i = 0; i < 3; i++)
		{
		   System.out.println("Digite o " +(i +1)+ "valor");
		   int valor = teclado.nextInt();
		
		   if (valor < menor)
		   {
			menor = valor;
		   }else if (valor > maior)
		   {
			maior = valor;
		   }
		}
		
		System.out.println("Maior numero eh" + maior);
		System.out.println("Menor numero eh" + menor);
		
	}
}
