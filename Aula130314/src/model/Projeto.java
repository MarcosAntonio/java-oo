package model;

public class Projeto 
{
	private String nome;
	private int cargaHoraria;
	private String descriao;
	
	public Projeto(String nome, int cargaHoraria, String descriao) 
	{
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descriao = descriao;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getCargaHoraria()
	{
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescriao() 
	{
		return descriao;
	}

	public void setDescriao(String descriao)
	{
		this.descriao = descriao;
	}
	
	
}
