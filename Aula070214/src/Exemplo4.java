import java.util.Scanner;


public class Exemplo4 
{
	public static void main (String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		
		
		String login;
		do
		{
			System.out.println("Digite o login");
			login = teclado.nextLine();
			cont++;
			
		}while (login.equals("admin") && cont <=3);
	}
}
