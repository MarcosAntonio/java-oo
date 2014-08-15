import java.util.Scanner;


public class Exercicio3Letra 
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite F ou M");
		String letra = teclado.nextLine();
		
		if (letra.equalsIgnoreCase("f"))
		{
			System.out.println("F- Femenino");
		}else if (letra.equals("m"))
		{
			System.out.println("M- Masculino");
		}else
		{
			System.out.println("Sexo Invalido");
		}
	}
}
