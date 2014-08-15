import java.util.Scanner;


public class Exercicio11Semana 
{
	public static void main (String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o numero correspondente o dia da semana");
		int dia = teclado.nextInt();
		
		String nome;
		
		switch (dia)
		{
			case 1:
				nome = "Domingo";
				break;
			case 2:
				nome = "Segunda";
				break;
			case 3:
				nome = "Terça";
				break;
			case 4:
				nome = "Quarta";
				break;
			case 5:
				nome = "Quinta";
				break;
			case 6:
				nome = "Sexta";
				break;
			case 7:
				nome = "Sabado";
				break;
				
			default:
				nome = "Valor invalido";
				break;	
			}
		
		System.out.println(nome);
	}
}
