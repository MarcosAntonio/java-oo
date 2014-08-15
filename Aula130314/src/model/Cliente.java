package model;


public class Cliente 
{
	private String nome;
	private String cpf;
	private String rg;
	private Dependente dependente;
	private Data data;
	private Endereco endereco;
	private Projeto projeto;
	
	Cliente(String nome, String cpf, String rg, Dependente dependente, Data data, Endereco endereco, Projeto projeto)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dependente = dependente;
		this.data = data;
		this.endereco = endereco;
		this.projeto = projeto;
		
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

	public String getRg() 
	{
		return rg;
	}

	public void setRg(String rg) 
	{
		this.rg = rg;
	}

	public Dependente getDependente() 
	{
		return dependente;
	}

	public void setDependente(Dependente dependente)
	{
		this.dependente = dependente;
	}

	public Data getData() 
	{
		return data;
	}

	public void setData(Data data) 
	{
		this.data = data;
	}

	public Endereco getEndereco() 
	{
		return endereco;
	}

	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}

	public Projeto getProjeto() 
	{
		return projeto;
	}

	public void setProjeto(Projeto projeto) 
	{
		this.projeto = projeto;
	}
	
	
}
