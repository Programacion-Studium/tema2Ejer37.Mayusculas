package ejercicio37.Mayusculas;

import java.util.Scanner;

public class Mayusculas {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char letra;
				//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
					//pedimos un Caracter por teclado .CharAt (0)Nos permite cojer solo 1 caracter
		System.out.println("Introduzca el caracter que quiere poner en mayusculas");
		letra = teclado.next().charAt(0);
		teclado.close();
		int asciiValue =(int)letra; //convierto la letra a numero
		if((asciiValue>=97)&&(asciiValue<=122))
			{
				System.out.println("Has introducido " +letra);
				int letra2=asciiValue-32;
				System.out.println("Has introducido " +(char)letra2);
			}
		else
			{
			System.out.println("El caracter introducido es invalido");
			}
				
	}

}
