import java.util.Scanner;

import p1.aplic.banco.ContaSimples;
import p1.aplic.banco.Extrato;
import p1.aplic.geral.Data;
import p1.aplic.geral.Pessoa;


public class BrincarOO 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa da conta 1");
		String nome = teclado.next();
		System.out.println("Digite o CPF");
		String cpf = teclado.next();
		System.out.println("Digite o nome da pessoa da conta 2");
		String nome2 = teclado.next();
		System.out.println("Digite o CPF da conta 2");
		String cpf2 = teclado.next();
		
		Pessoa p = new Pessoa(nome);
		ContaSimples cs1 = new ContaSimples(nome, cpf, 1);
		ContaSimples cs2 = new ContaSimples(nome2, cpf2, 1);
		
		cs1.depositar(1000);
		cs2.depositar(2000);
		cs1.sacar(500);
		cs2.sacar(700);
		cs1.transferir(cs2, 200);
		cs2.transferir(cs1, 300);
		
		Data dataIni = new Data(25, 02, 2014);
		Data dataFin = new Data(25, 02, 2014);
		
		Extrato ext = cs1.criarExtrato(dataIni, dataFin);
		System.out.println("Extrato da conta " + ext.formatar());
		
	}
}
