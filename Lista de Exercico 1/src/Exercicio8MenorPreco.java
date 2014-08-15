import java.util.Scanner;


public class Exercicio8MenorPreco  
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		int menor = Integer.MAX_VALUE;
		
		for( int i = 0; i <3; i++)
		{
			System.out.println("Digite o preco do produto" +(i +1));
			int preco = teclado.nextInt();
			if (preco < menor)
			{
				menor = preco;
			}
			
		}
		System.out.println("Voce deve compra o pruduto com esse valor" + menor);
	
		/*System.out.println("Digite o preco do produto1");
		int pd1 = teclado.nextInt();
		System.out.println("Digite o preco do produto2");
		int pd2 = teclado.nextInt();
		System.out.println("Digite o preco do produto2");
		int pd3 = teclado.nextInt();
		
		int menor2;
		if (pd1 < pd2 && pd1 < pd3)
		{
			menor2 = pd1;
		}else if (pd2 < pd1 && pd2 < pd3)
		{
			menor2 = pd2;
		}else
		{	menor2 = pd3;
		}
		System.out.println("Voce deve compra o pruduto" + menor2);
		*/
	}
}
