import java.util.Scanner;


public class Exemplo3 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o login");
		String login = teclado.nextLine();
		if (login.equals("admin"))
		{
			System.out.println("Login Correto");
		}else
		{
			System.out.println("Login errado");
		}
	}
}
