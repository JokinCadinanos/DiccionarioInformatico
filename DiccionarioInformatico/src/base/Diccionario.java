package base;

import java.util.Scanner;

public class Diccionario {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public Diccionario() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String palabra = new String();
		System.out.print ("Introduce palabra: ");
		palabra = teclado.next();
		
		if(palabra != null && palabra.equalsIgnoreCase("bit")) {
			System.out.println("Mínima unidad de información que representa un 0 ó un 1.");
		}else {
				System.out.println("Palabra no encontrada");
			}
			
		 if (palabra != null && palabra.equalsIgnoreCase("raton")) {
			System.out.println("El ratón o mouse (en inglés pronunciado /maʊs/) es un dispositivo apuntador utilizado para facilitar el manejo de un entorno gráfico en una computadora");
	}else {
		System.out.println("Palabra no encontrada");
	}
}
}
