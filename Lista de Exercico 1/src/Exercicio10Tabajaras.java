import java.util.Scanner;


public class Exercicio10Tabajaras
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu salario");
		double salario = teclado.nextDouble();
		
		double aumento;
		double salariofinal;
		double reajuste20 = (20.0 / 100.0);
		double reajuste15 = (15.0 / 100.0);
		double reajuste10 = (10.0 / 100.0);
		double reajuste5  = (5.0 / 100.0);
		
		if (salario <= 280)
		{	salariofinal = salario + (reajuste20 * salario);
			aumento = salariofinal - salario;
			
			System.out.println("Seu salario era" + salario );
			System.out.println("O percentual de aumento eh" + reajuste20);
			System.out.println("O aumento eh" + aumento);
			System.out.println("Seu salario novo eh" + salariofinal);
		
		}else if (salario >= 280 && salario<= 700 )
		{	salariofinal = salario + (reajuste15 * salario);
			aumento = salariofinal - salario;
			
			System.out.println("Seu salario era" + salario );
			System.out.println("O percentual de aumento eh" + reajuste15);
			System.out.println("O aumento eh" + aumento);
			System.out.println("Seu salrio novo eh" + salariofinal);
		
		}else if ( salario >= 700 && salario <= 1500)
		{	salariofinal = salario + (reajuste10  * salario);
			aumento = salariofinal - salario;
			
			System.out.println("Seu salario era" + salario );
			System.out.println("O percentual de aumento eh" + reajuste10);
			System.out.println("O aumento eh" + aumento);
			System.out.println("Seu salario novo eh" + salariofinal);
		}else if (salario == 1500)
		{	salariofinal = salario + (reajuste5 * salario);
			aumento = salariofinal - salario;
		
			System.out.println("Seu salario era" + salario );
			System.out.println("O percentual de aumento eh" + reajuste5);
			System.out.println("O aumento eh" + aumento);
			System.out.println("Seu salario novo eh" + salariofinal);
		}
		
	}
}
