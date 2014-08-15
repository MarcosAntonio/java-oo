package model;

public class Agendamento 
{
	private String hora;
	private String data;
	private Medico medico;
	private Convenio convenio;

	public Agendamento(String hora, String data, Medico medico,Convenio convenio) 
	{
		this.hora = hora;
		this.data = data;
		this.medico = medico;
		this.convenio = convenio;
	}
	
	public String getHora() 
	{
		return hora;
	}
	public void setHora(String hora) 
	{
		this.hora = hora;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) 
	{
		this.data = data;
	}
	public Medico getMedico() 
	{
		return medico;
	}
	public void setMedico(Medico medico)
	{
		this.medico = medico;
	}
	public Convenio getConvenio() 
	{
		return convenio;
	}
	public void setConvenio(Convenio convenio) 
	{
		this.convenio = convenio;
	}
	
}
