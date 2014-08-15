package model;

import java.util.Scanner;

public class ToDo 
{
	private static AcaoTo to1;

	public static void main (String [] agr)
	{
		Scanner teclado = new Scanner(System.in);
		AcaoTo to = new AcaoTo();
		
		int escolha;
		int continuar;
		continuar = 0;
		
		
		do
		{
		System.out.println(" 1. ADD-TO");
		System.out.println(" 2. ADD-TODO");
		System.out.println(" 0. ADD-DONE");
		escolha = teclado.nextInt();
		
			switch (escolha)
			{
			case 1:
				System.out.println("Digite no TO");
				String addto1 = teclado.next();
				to1 = new AcaoTo(addto1);
				break;
			}
		
			
		}while(continuar !=0);
		
		to = to1;
		System.out.println("    TO    " + "    TODO    ");
		System.out.println(""+to.getTo());
		
	}
}
