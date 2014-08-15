

import p1.aplic.cartas.Baralho;
import p1.aplic.cartas.Carta;


public class Exercicio4Baralho
{
	

	public static void main (String [] agrs)
	{
		
		Baralho b1 = new Baralho();
		b1.baralhar();
		System.out.println("Numero de cartas  " +b1.númeroDeCartas());
		
		Carta c1 = b1.pegaCarta();
		Carta c2 = b1.pegaCarta();
		
		
		
		System.out.println("Valor da carta 1  " +c1.getValor());
		System.out.println("Naipe da carta 1  " +c1.getNaipe());
		System.out.println("Valor da carta 2  " +c2.getValor());
		System.out.println("Naipe da carta 2  " +c2.getNaipe());
		
	}
}
