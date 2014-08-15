import p1.aplic.cartas.BaralhoTarot;
import p1.aplic.cartas.CartaTarot;


public class Exercicio6Tarot 
{
	public static void main(String [] agrs)
	{
		BaralhoTarot tarot = new BaralhoTarot();
		
		tarot.baralhar();
		tarot.pegaCarta();
		
		CartaTarot c1 = new CartaTarot(2,3);
		
		System.out.println("O valor da carta eh:  " +c1.getValor()+ "  " + "O Naipe da Carta eh:  " +c1.getNaipe());
		
		if ( c1.getNaipe() == CartaTarot.COPAS)
		{
			System.out.println("Você vai ter sorte no amor");
		}else if (c1.getNaipe() == CartaTarot.ESPADAS)
		{
			System.out.println("Você sofrerar uma perda finaceira");
		}else if (c1.getNaipe() == CartaTarot.OUROS)
		{
			System.out.println("Você ganhara um bônus no emprego ");
		}else if ( c1.getNaipe() == CartaTarot.PAUS)
		{
			System.out.println("Você vai ser traido por seu namorado(a)");
		}
		
	}
}
