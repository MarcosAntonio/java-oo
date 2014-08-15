import java.util.Scanner;


public class Exemplo2
{

	public static void main(String[] args) 
	{
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("Digite os nome que voc  quer salvar");
		int quant = teclado.nextInt();
		
		String[] nomes = new String[quant];
		
		for(int i = 0; i < quant; i++)
		{
			
			System.out.println("Digite um nome");
			nomes[i] = teclado.nextLine();
		}
		
		boolean achou = false;
		for(int i =0; i < quant; i++)
		{
			
			
			if (nomes[i].equalsIgnoreCase("Marcos"))
			{
				achou = true;
				break;
			}
			if (achou == true)
			{
				
			}
		}

	}

}
