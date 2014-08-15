package model;

import java.util.ArrayList;

public class Convenio 
{
	private String sigla;
	private String nome;
	private String hospital;
	private ArrayList<Contato> contatos;
	
	public String getSigla()
	{
		return sigla;
	}
	public void setSigla(String sigla)
	{
		this.sigla = sigla;
		
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getHospital() 
	{
		return hospital;
	}
	public void setHospital(String hospital) 
	{
		this.hospital = hospital;
	}
	
}
