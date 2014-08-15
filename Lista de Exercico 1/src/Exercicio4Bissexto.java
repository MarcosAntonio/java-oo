import java.util.Scanner;


public class Exercicio4Bissexto 
{
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um ano com 4 Digitos");
		double ano = teclado.nextDouble();
		
		if ( ano % 4 == 0  && ano % 100 != 0 || ano % 400 == 0)
		{
			System.out.println("Bissexto");
		}else
		{
			System.out.println("Não eh Bissexto");
		}
	}
}
