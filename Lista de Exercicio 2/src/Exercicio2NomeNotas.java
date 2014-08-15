import java.util.Scanner;


public class Exercicio2NomeNotas 
{
	public static void main (String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		String [] nomes = new String [5];
		double [] notas = new double [5];
		
		double soma= 0;
		double media;
		for (int i = 0; i <nomes.length; i++ )
		{
			System.out.println("Digite o nome do aluno");
			nomes[i] = teclado.nextLine();
		}
		for ( int i = 0; i < notas.length; i++)
		{
			System.out.println("Digite a nota do aluno: " +nomes[i] );
			notas[i] = teclado.nextDouble();
			soma = soma + notas[i];
		}
		media = soma / 5;
		System.out.println("Medias doa alunos eh  " +media);
		for(int i = 0; i < nomes.length; i++)
		{
			if ( notas[i] > media)
			{
				System.out.println("Notas superior a media:  " +nomes[i]);
			}
		}
		 
	}
}
