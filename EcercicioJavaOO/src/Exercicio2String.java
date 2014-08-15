import java.util.Scanner;


public class Exercicio2String 
{
	public static void main ( String [] agrs)
	{
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma String"); 
		String str = teclado.next();
		
		String stri = new String(str);
		
		stri.toCharArray();
		System.out.println("Array de String  " +stri);

		StringBuilder s1 = new StringBuilder(stri);
		StringBuilder s2 = s1.reverse();
		System.out.println("Reverser  " +s2);
		
		System.out.println("Concatenar  " +str.concat(" ARARUNA"));
		
		System.out.println("Hash code  " +str.hashCode());
		
		System.out.println("Ocorencias " +str.replaceAll("a", "x"));
		
		System.out.println("Posição " +str.subSequence(2, 5));
		
	}
}
