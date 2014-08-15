import java.util.Scanner;


public class Exercicio1Math 
{
	public static void main (String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor para x");
		int valor1 = teclado.nextInt();
		System.out.println("Digite alor para y");
		int valor2 = teclado.nextInt();
		
		Math.abs(valor1);
		System.out.println("O valores absoluto de X " +Math.abs(valor1));
		Math.abs(valor2);
		System.out.println("O valores absoluto de Y " +Math.abs(valor2));
		
		
		System.out.println();
		
		Math.sqrt(valor1);
		System.out.println("A raiz quadrada de X  " +Math.sqrt(valor1));
		Math.sqrt(valor2);
		System.out.println("A raiz quadrada de Y  " +Math.sqrt(valor2));
		
		
		System.out.println();
		
		Math.max(valor1, valor2);
		System.out.println("O maior numero eh " +Math.max(valor1, valor2));
		Math.min(valor1, valor2);
		System.out.println("O menor mumero eh " +Math.min(valor1, valor2));
		
	}
}
 