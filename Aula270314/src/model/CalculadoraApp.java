package model;

import java.util.Scanner;

public class CalculadoraApp 
{
	public static void main (String[] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		Calculadora calc = new Calculadora (null);
		
		int continuar;
		continuar = 0;
		int escolha;
		
		do
		{
		System.out.println(" Bem vindo a Calculadora");
		System.out.println("1... Preencher Vetor");
		System.out.println("2... Somar");
		System.out.println("3... Subritra��o");
		System.out.println("4... Multiplica��o");
		System.out.println("5... Imprimir");
		escolha = teclado.nextInt();
		
		switch (escolha)
		{
		case 1:
		System.out.println("Digite o numero");
		double n1 =  teclado.nextDouble();
		calc.add(n1);
		continuar = 1;
		break;
		case 2:
			System.out.println("Soma " +calc.Soma());
			continuar = 1;
			break;
		case 3:
			System.out.println("Subitra�ao " +calc.Subitracao());
			continuar = 1;
			break;
		case 4:
			System.out.println("Multiplica��o " +calc.Multiplicacao());
			continuar = 1;
			break;
		case 5:
			calc.getNumeros();
			continuar = 1;
			break;
		default : 
			System.out.println("Voc� digitou a op��o errada");
			continuar = 1;
		}
		}while(continuar !=0);
	}
}
