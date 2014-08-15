package model;

import java.util.Scanner;

public class EmpresaApp 
{
	public static void main (String [] agrs)
	{
		Empresa empresa = new Empresa("Oxente","Oxente Sistemas","12345678-01");
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o seu login");
		String log = teclado.next();
		System.out.println("Digite a senha");
		String sen = teclado.next();
		
		if(log.equals("marcos") && sen.equals("123"))
		{
		int escolha;
		int continuar;
		continuar = 0;
		
		do
		{
		System.out.println("<<<<<<<<<<<< Oxente Sistemas >>>>>>>>>>>>>");	
		System.out.println("Escolha a opção desejada:");
		System.out.println("");
		System.out.println("1......................... Cadastrar Novo Funcionário");
		System.out.println("2 ......................... Excluir Funcionário");
		System.out.println("3 ..........................Alterar Funcionário");
		System.out.println("4 ......................... Imprimir");
		System.out.println("0...........................Sair");
		escolha = teclado.nextInt();
		
			switch (escolha)
			{
			case 1:
				System.out.println("Digite o nome do funcionario");
				String nome = teclado.next();
				System.out.println("Digite o salario");
				double salario = teclado.nextDouble();
				System.out.println("Digite o cpf");
				String cpf = teclado.next();
				Funcionario f1 = new Funcionario(nome, salario, cpf);
				empresa.add(f1);
				continuar = 1;
				break;
			case 2:
				System.out.println("Digite o funcionario a ser deletado");
				cpf = teclado.next();
				empresa.removerFuncionario(cpf);
				continuar = 1;
				break;
			case 3:
				System.out.println("Digite o numero do cpf a ser alterado");
				cpf = teclado.next();
				System.out.println("Digite o nome do novo funcionario");
				nome = teclado.next();
				empresa.alterarFuncionario(cpf, nome);
				continuar = 1;
				break;
			case 4:
				empresa.getFuncionarios();
				continuar = 1;
				break;
			case 0:
				System.out.println("Sistema encerrado");
				continuar = 0;
			break;
			}
		
			
		}while(continuar !=0);
		
		}else{
		System.out.println("Login e senha errada");
		}
		
	}
}
