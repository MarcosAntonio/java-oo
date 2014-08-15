import java.util.Scanner;


public class Exercicio8Altura 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Numero de alunos: ");
		int numAlunos = teclado.nextInt();
		
		int [] idades = new int[numAlunos];
		double [] alturas = new double[numAlunos];
		double somaAlturas = 0;
		
		for(int i=0; i<numAlunos; i++)
		{
			System.out.println("Digite a idade: ");
			idades[i] = teclado.nextInt();			
			System.out.println("Digite sua altura: ");
			alturas[i] = teclado.nextDouble();
			somaAlturas += alturas[i];
		}
		
		double mediaAlturas = 0;
		mediaAlturas = somaAlturas/numAlunos;
		
		int cont = 0;
		for(int i=0; i<numAlunos; i++)
		{
			if((idades[i]== 13) && (alturas[i] < mediaAlturas))
			{
				cont++;
			}
		}
		
		System.out.println(cont);
		

	}
}
