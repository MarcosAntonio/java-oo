import java.util.Scanner;


public class Exercicio15Adivinhar 
{
	public static void main(String[]args)
	{
		Scanner teclado = new Scanner (System.in);
		
		String [] respostas = new String[5];
		int i = 0;
		int cont = 0;
			
		System.out.println("Telefonou para a v�tima?");
		respostas[i] = teclado.next();
		if(respostas[i].equals("sim")){
			cont++;
		}
		i = i++;		
		
		System.out.println("Esteve no local do crime?");
		respostas[i] = teclado.next();
		if(respostas[i].equals("sim")){
			cont++;
		}
		i = i++;
		
		System.out.println("Mora perto da v�tima?");
		respostas[i] = teclado.next();
		if(respostas[i].equals("sim")){
			cont++;
		}
		i = i++;
		
		System.out.println("Devia para a v�tima?");
		respostas[i] = teclado.next();
		if(respostas[i].equals("sim")){
			cont++;
		}
		i = i++;
		
		System.out.println("J� trabalhou com a v�tima?");
		respostas[i] = teclado.next();
		if(respostas[i].equals("sim")){
			cont++;
		}
		
		System.out.println("Voc� responde SIM a "+cont+" perguntas.");
		if(cont == 2){
			System.out.println("Voc� � uma pessoa SUSPEITA!");
		}else if((cont == 3)||(cont == 4)){
			System.out.println("Voc� � uma CUMPLICE!");
		}else if(cont == 5){
			System.out.println("Voc� � o ASSASSINO(A), esteja preso!");
		}else{
			System.out.println("Voc� � INOCENTE!");
		}
		
		
	}

}
