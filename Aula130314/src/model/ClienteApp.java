package model;


public class ClienteApp 
{
	public static void main(String [] agrs)
	{
		Endereco end1 = new Endereco("Antiga","nova","velho","aquele", 8);
		Endereco end2 = new Endereco("Nova", "Velha", "Antigo","Quaquer",10);
		Dependente dep1 = new Dependente("joao","12345","primo",end1);
		Dependente dep2 = new Dependente("maria","45612","prima",end2);
		Data dat1 = new Data(22,03,1985);
		Data dat2 = new Data(26,02,1990);
		Projeto proj1 = new Projeto("TCC",10,"Ali");
		Projeto proj2 = new Projeto("Artigo",18,"Aqui");
		
		Cliente cliente1 = new Cliente("Marcos","1234567","123456", dep1, dat1, end1 , proj1);
		Cliente cliente2 = new Cliente("Vittor", "7894561", "789456",dep2, dat2,end2, proj2);
		
		
		System.out.println("O 1° é: " +cliente1.getNome() + " Seu endereço é: " +cliente1.getEndereco().getRua()+ " " +cliente1.getEndereco().getNumero());
		System.out.println("O 2° é: " +cliente2.getNome() + " Seu endereço é: " +cliente2.getEndereco().getRua()+ " " +cliente2.getEndereco().getNumero());
		System.out.println("O projeto do 1° cliente é  " + cliente1.getProjeto().getNome());
		System.out.println("O projeto do 2° cliente é  " + cliente2.getProjeto().getNome());
		
		
		
	}
}
