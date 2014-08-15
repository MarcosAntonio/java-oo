import java.util.Scanner;


public class Exercicio3NomesPessoas 
{
	public static void main(String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = teclado.nextInt();
		String [] nomes = new String[tam];
		
		for(int i = 0; i <nomes.length; i++)
		{
			System.out.println("Digites os nomes");
			nomes[i] = teclado.next();
		}
		System.out.println("Digite o nome que você quer");
		String nome = teclado.next();
		
		for(int i = 0; i < nomes.length; i++)
		{
			if(nome.equalsIgnoreCase(nomes[i]))
			{
				System.out.println(nomes[i]);
			}else
			{
				System.out.println("Nome invalido");
			}
		}
	}
}
