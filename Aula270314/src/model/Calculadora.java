package model;

public class Calculadora 
{
	private int cont = 0;
	double [] numeros = new double[3];
	
	public Calculadora(double [] numeros)
	{
		
	}
	
	public boolean add(double numero)
    {
                    if (cont < numeros.length)
                    {
                            //cont = 0;
                            numeros[cont] = numero;
                            cont++;
                    }
           
            return false;
           
    }
	
	public double Soma()
	{
		double soma = 0;
		for ( int i = 0; i < numeros.length; i++)
		{
			soma += numeros[i];
		}
		return soma;
	}
	
	public double Subitracao()
	{
		double sub = 0;
		for ( int i = 0; i < numeros.length; i++)
		{
			sub -= numeros[i];
		}
		return sub;
	}
	
	public double Multiplicacao()
	{
		double mult = 1;
		for ( int i = 0; i < numeros.length; i++)
		{
			mult *= numeros[i];
		}
		return mult;
	}
	public void getNumeros()
	{
		for (int i =0; i < numeros.length; i++)
		{
			System.out.println("Vetor " +this.numeros[i]);
		}
	}
	
}	