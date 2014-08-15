package model;

import java.util.ArrayList;

public class Pessoa 
{
	private String nome;
	private String rg;
	private String cpf;
	private String dataNascimento;
	private Endereco endereco;
	private ArrayList<Contato> contatos;


	public Pessoa() 
	{
		
	}
	
	public Pessoa(String nome, String rg) 
	{	
		this.nome = nome;
		this.rg = rg;
	}



	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getRg() 
	{
		return rg;
	}

	public void setRg(String rg) 
	{
		this.rg = rg;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public void setCpf(String cpf) 
	{
		this.cpf = cpf;
	}

	public String getDataNascimento() 
	{
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
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
