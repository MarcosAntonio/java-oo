import java.util.Scanner;


public class Exercicio1MaiorNumero 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1 valor");
		int valor1 = teclado.nextInt();
		System.out.println("Digite o 2 valor");
		int valor2 = teclado.nextInt();
		
		int maior = 0;
		if (valor1 > valor2)
		{	
			maior = valor1;
		}else
		{
			 maior = valor2;
		}
		
		System.out.println("Maior numero eh " +maior);
	}
}
