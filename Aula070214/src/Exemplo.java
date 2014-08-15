import java.util.Scanner;


public class Exemplo 
{
	public static void main (String [] args)
	{           
		//Class  //Obj   //inst
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
	  //var	
		int idade = teclado.nextInt();
		if (idade >= 18)
		{
			System.out.println("Maior idade");
		}else
		{
			System.out.println("Menor idade");
		}
	}
}
