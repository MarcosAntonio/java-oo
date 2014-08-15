import java.util.Scanner;

import p1.aplic.cartas.Carta;
import p1.aplic.cartas.Mao;


public class Exercicio5Cartas 
{
	public static void main (String [] agrs)
	{
		Scanner  teclado = new Scanner(System.in);
		
		
		Carta c1 = new Carta(Carta.DAMA, Carta.ESPADAS);
		Carta c2 = new Carta(Carta.REI, Carta.PAUS);
		Carta c3 = new Carta(Carta.AS, Carta.COPAS);
		Carta c4 = new Carta(8, Carta.OUROS);
		
		Mao mao = new Mao();
		
		mao.adicionar(c1);
		mao.adicionar(c2);
		mao.adicionar(c3);
		mao.adicionar(c4);
		
		System.out.println("Numeros de cartas:  " +mao.númeroDeCartas());
		System.out.println("São elas:  " +mao);
		System.out.println("Valor: " +mao.valor());
		
		System.out.println("Adicione o numero da 1 carta");
		int nu1 = teclado.nextInt();
		System.out.println("Adicione o nipe da 1 carta");
		int na1 = teclado.nextInt();
		System.out.println("Adicione o numero da 2 carta");
		int nu2 = teclado.nextInt();
		System.out.println("Adicione o nipe da 2 carta");
		int na2 = teclado.nextInt();
		System.out.println("Adicione o numero da 3 carta");
		int nu3 = teclado.nextInt();
		System.out.println("Adicione o nipe da 3 carta");
		int na3 = teclado.nextInt();
		System.out.println("Adicione o numero da 4 carta");
		int nu4 = teclado.nextInt();
		System.out.println("Adicione o nipe da 4 carta");
		int na4 = teclado.nextInt();
		
		Carta c5 = new Carta(nu1,na1);
		Carta c6 = new Carta(nu2,na2);
		Carta c7 = new Carta(nu3,na3);
		Carta c8 = new Carta(nu4,na4);
		
		Mao mao2 = new Mao();
		
		mao2.adicionar(c5);
		mao2.adicionar(c6);
		mao2.adicionar(c7);
		mao2.adicionar(c8);
		
		System.out.println("Numeros de cartas:  " +mao2.númeroDeCartas());
		System.out.println("São elas:  " +mao2);
		System.out.println("Valor: " +mao2.valor());
		
		if (mao.valor() > mao2.valor())
		{
			System.out.println("O Computador ganhou");
		}else
		{
			System.out.println("O usuario ganhou");
		}
	}
}
