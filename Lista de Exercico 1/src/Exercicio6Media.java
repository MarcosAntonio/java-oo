import java.util.Scanner;


public class Exercicio6Media 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite sua 1 nota");
		double nota1 = teclado.nextDouble();
		System.out.println("Digite sua 2 nota");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <10)
		{
			System.out.println("Voc� est� aprovado, sua media foi" + media);
		}else if (media < 7)
		{
			System.out.println("Voc� est� REPROVADO, sua media foi" + media);
		}else if (media == 10)
		{
			System.out.println("Voc� est� APROVADO COM DESTIN��O, sua media foi" + media);
		
		}
		
	}
}
