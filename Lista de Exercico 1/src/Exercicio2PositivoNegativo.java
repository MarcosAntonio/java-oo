import java.util.Scanner;


public class Exercicio2PositivoNegativo 
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = teclado.nextInt();
		
		if (valor > 0)
		{
			System.out.println("Valor e positivo");
		}else
		{
			System.out.println("Valor e negativo");
		}
	}
}
