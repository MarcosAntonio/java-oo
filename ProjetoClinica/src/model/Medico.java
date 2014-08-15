package model;

import java.util.ArrayList;

public class Medico extends Pessoa
{
	private String crm;
	private ArrayList<Convenio> convenios;
	private ArrayList<Especializacao> especializacaoes;
	
	public Medico() 
	{
	
	}

	public Medico(String crm, ArrayList<Convenio> convenios) 
	{
		this.crm = crm;
		this.convenios = convenios;
	}

	public String getCrm() 
	{
		return crm;
	}

	public void setCrm(String crm) 
	{
		this.crm = crm;
	}

	public ArrayList<Convenio> getConvenios() 
	{
		return convenios;
	}

	public void setConvenios(ArrayList<Convenio> convenios) 
	{
		this.convenios = convenios;
	}

	
	
}
