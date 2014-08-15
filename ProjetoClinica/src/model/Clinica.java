package model;

import java.util.ArrayList;

public class Clinica 
{
	private String razaoScial;
	private String nomeFantasia;
	private String cnpj;
	private ArrayList<FuncionarioAtendimento> funcionariosAtendimento;
	private ArrayList<Medico> medicos;
	private ArrayList<FuncionarioLimpeza> funcionariosLimpeza;
	private ArrayList<Paciente> pacientes;
	
	public Clinica(String razaoScial, String nomeFantasia, String cnpj) 
	{
		this.razaoScial = razaoScial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	
	public void addPaciente(Paciente paciente)
	{
		pacientes.add(paciente);
	}

	public String getRazaoScial() 
	{
		return razaoScial;
	}

	public void setRazaoScial(String razaoScial) 
	{
		this.razaoScial = razaoScial;
	}

	public String getNomeFantasia() 
	{
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) 
	{
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(String cnpj) 
	{
		this.cnpj = cnpj;
	}
	
	
	
}
