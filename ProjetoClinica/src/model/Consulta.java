package model;

public class Consulta 
{
	private String hora;
	private String data;
	private Paciente paciente;
	private Convenio convenio;
	private Medico medico;
	
	public Consulta(String hora, String data, Paciente paciente,Convenio convenio, Medico medico) 
	{
		
		this.hora = hora;
		this.data = data;
		this.paciente = paciente;
		this.convenio = convenio;
		this.medico = medico;
	}

	public String getHora() 
	{
		return hora;
	}

	public void setHora(String hora) 
	{
		this.hora = hora;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public Paciente getPaciente() 
	{
		return paciente;
	}

	public void setPaciente(Paciente paciente) 
	{
		this.paciente = paciente;
	}

	public Convenio getConvenio() 
	{
		return convenio;
	}

	public void setConvenio(Convenio convenio) 
	{
		this.convenio = convenio;
	}

	public Medico getMedico() 
	{
		return medico;
	}

	public void setMedico(Medico medico)
	{
		this.medico = medico;
	}

	
}
