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
			System.out.println("M�nima unidad de informaci�n que representa un 0 � un 1.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("moneda")) {
			System.out.println("Pieza de metal, generalmente redonda y con un relieve en cada cara, a la que se le asigna un valor econ�mico determinado y se emplea como medio legal de pago.");
		} else if (palabra != null && palabra.equalsIgnoreCase("Videojuego")) {
			System.out.println("Un videojuego es un juego electr�nico en el que una o m�s personas interact�an por medio de un controlador, con un dispositivo que muestra im�genes de v�deo.");
		}else  if(palabra != null && palabra.equalsIgnoreCase("CPU")){
			System.out.println("Unidad central de procesamiento: Lleva a cabo la union completa del las caracteristicas del equipo.");
    }else if(palabra !=null && palabra.equals("lan")) {
			  System.out.println("Una LAN, abreviatura para Local"
					+ " Area Network (Red de Area Local), es una red que "
					+ "cubre un �rea geogr�fica peque�a, como hogares, oficinas y grupos de edificios.");
		}else if(palabra != null && palabra.equalsIgnoreCase("informatica")){
			  System.out.println("Conjunto de conocimientos técnicos que se ocupan del tratamiento automático de la información por medio de computadoras");
		}
    else if(palabra != null && palabra.equalsIgnoreCase("ordenador")) {
				System.out.println("es una máquina que almacena y automatiza la información a través de programas informáticos diseñados específicamente para esta tarea.");
		}
		else if(palabra != null && palabra.equalsIgnoreCase("algoritmo")) {
				System.out.println("Un algoritmo informático es un conjunto de instrucciones definidas, ordenadas y acotadas para resolver un problema o realizar una tarea..");
		}
		else {
			System.out.println("Palabra no encontrada");
		
		}
		
		

	}

}
