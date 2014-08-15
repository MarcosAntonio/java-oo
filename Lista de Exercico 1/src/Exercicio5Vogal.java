import java.util.Scanner;


public class Exercicio5Vogal 
{
	public static void main(String [] args)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = teclado.nextLine();
		
		
		switch (letra)
		{
			case "a":
			case "e":	
			case "i":
			case "o":
			case "u":
				System.out.println("Eh vogal");
				break;
			default:
				System.out.println("Eh consoante");	
		}
	}
}
