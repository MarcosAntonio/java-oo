import java.util.Scanner;


public class Exercicio9Turno 
{
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a letra do seu turno: M- Matutino, V- Vespertino, N- Noturno");
		String letra = teclado.nextLine();
		
		if (letra.equals("m"))
		{
			System.out.println("Bom dia");
		}else if (letra.equals("v"))
		{
			System.out.println("Boa tarde");
		}else if(letra.equals("n"))
		{
			System.out.println("Boa noite");
		}else
		{
			System.out.println("Valor invalido");
		}
	}
}
