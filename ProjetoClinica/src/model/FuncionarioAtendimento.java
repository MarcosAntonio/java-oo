package model;


public class FuncionarioAtendimento extends Pessoa
{
	private int anoConclusao;
	private String curso;
	private String tcc;
	
	public int getAnoConclusao() 
	{
		return anoConclusao;
	}
	public void setAnoConclusao(int anoConclusao) 
	{
		this.anoConclusao = anoConclusao;
	}
	public String getCurso() 
	{
		return curso;
	}
	public void setCurso(String curso) 
	{
		this.curso = curso;
	}
	public String getTcc() 
	{
		return tcc;
	}
	public void setTcc(String tcc) 
	{
		this.tcc = tcc;
	}
	
	
}
