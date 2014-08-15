import java.util.Scanner;


public class Exercicio12Media2 
{
	public static void main(String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Digite sua 1 nota");
		double nota1 = teclado.nextDouble();
		System.out.println("DIgite sua 2 nota");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media >= 9 && media <10)
		{
			System.out.println("Suas notas" + nota1 + "  " + nota2 );
			System.out.println("Sua media" + media);
			System.out.println("Conceito A e APROVADO");
		}else if (media >=7.5 && media <9)
		{
			System.out.println("Suas notas" + nota1 + "  " + nota2 );
			System.out.println("Sua media" + media);
			System.out.println("Conceito B e APROVADO");
		}else if(media >=6 && media<7.5)
		{
			System.out.println("Suas notas" + nota1 + "  " + nota2 );
			System.out.println("Sua media" + media);
			System.out.println("Conceito C e APROVADO");
		}else if(media >=4 && media<6)
		{
			System.out.println("Suas notas" + nota1 + "  " + nota2 );
			System.out.println("Sua media" + media);
			System.out.println("Conceito D e REPROVADO");
		}else if (media >=0 && media<4)
		{
			System.out.println("Suas notas" + nota1 + "  " + nota2 );
			System.out.println("Sua media" + media);
			System.out.println("Conceito E e REPROVADO");
		}
	}
}
