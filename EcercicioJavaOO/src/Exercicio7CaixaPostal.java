import java.util.Scanner;

import p1.aplic.correio.CaixaPostal;
import p1.aplic.correio.CorreioIU1;
import p1.aplic.correio.CorreioIU2;
import p1.aplic.correio.CorreioIU3;
import p1.aplic.correio.MensagemTexto;


public class Exercicio7CaixaPostal 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		CaixaPostal cx = new CaixaPostal();
		
		MensagemTexto msg = new MensagemTexto("Marcos" , "JavaOO", "JavaOO eh legal");
		
		System.out.println("Quantidade de MSG " +cx.númeroDeMensagens());
		cx.inserir(msg);
		cx.salvar();
		msg.exibir();
		msg.isLida();
		msg.excluir();
		
		
		CorreioIU1 correio = new CorreioIU1(null);
		
		correio.interfaceComUsuário();
		
	}
}
