package model;


public class Dependente 
{
	private String nome;
	private String cpf;
	private String grauparentesco;
	private Endereco endereco;
	
	public Dependente(String nome, String cpf, String grauparentesco, Endereco endereco)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.grauparentesco = grauparentesco;
		this.endereco = endereco;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getCpf()
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getGrauparentesco()
	{
		return grauparentesco;
	}

	public void setGrauparentesco(String grauparentesco) {
		this.grauparentesco = grauparentesco;
	}

	public Endereco getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}
}
