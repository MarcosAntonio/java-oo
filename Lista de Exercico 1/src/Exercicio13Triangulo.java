import java.util.Scanner;


public class Exercicio13Triangulo 
{
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		
		boolean triangulo;
		String tipoTriangulo = null;
		
		System.out.println("Digite o vértice 1 do Triangulo: ");
		String lado1 = teclado.next();
		double l1 = Double.parseDouble(lado1);
		
		System.out.println("Digite o vértice 2 do Triangulo: ");
		String lado2 = teclado.next();
		double l2 = Double.parseDouble(lado2);
		
		System.out.println("Digite o vértice 3 do Triangulo: ");
		String lado3 = teclado.next();
		double l3 = Double.parseDouble(lado3);
		
		if(((l1<l2+l3)&&(l1>Math.abs(l2-l3)))||((l2<l1+l3)&&(l2>Math.abs(l1-l3)))||((l3<l1+l2)&&(l3>Math.abs(l1-l3)))){
			triangulo = true;
		}else{
			triangulo = false;
		}
		
		if(triangulo == true){
			if((l1==l2)&&(l2==l3)&&(l1==l3)){
				tipoTriangulo = ("EQUILÁTERO");
			}else if(((l1==l2)&&(l2!=l3)||((l1==l3)&&(l2!=l1))||((l2==l3)&&(l1!=l2)))){
				tipoTriangulo = ("ISÓCELES");
			}else if((l1!=l2)&&(l2!=l3)&&(l1!=l3)){
				tipoTriangulo = ("ESCALENO");
			}
		System.out.println("Essas medidas satisfazem a condição do TRIANGULO.\n Tipo: " + tipoTriangulo);
		}else{
			System.out.println("Essas medidas não satisazem a condição do Trinagulo.");
		}		
		
	}


}
