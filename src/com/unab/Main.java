package com.unab;
import java.util.Scanner;
/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static Scanner scanner = new Scanner(System.in);

	static public void menu(){

		System.out.println("¡Hola! ¿Cómo te llamas?");
		String nombreJugador = scanner.nextLine();
		System.out.println("Bienvenid@ "+nombreJugador);
		Tablero tablero = new Tablero();
		// Graficas graph = new Graficas();
		
		tablero.crearTablero();
		tablero.crearCarro();
		tablero.tableroFalso();
		boolean condMenu = true;
		while (condMenu){
			System.out.println(nombreJugador+", ingresa tu opción:");
			System.out.println("\r\n\tOpcion 1) Iniciar Juego\r\n\tOpcion 2) Lanzar Huevo\r\n\tOpcion 3) Salir ");
			System.out.print("\nOpcion:  ");

			String opcion = scanner.nextLine();
			if (opcion.equals("1")){
				System.out.println("\r\n\t\t   ¡A Jugar!");  
				System.out.println("\r\n\t\tPuntaje Inicial: 0");  
				condMenu = tablero.mostrarMatriz();
				// tablero.mostrarMatrizControl();
				tablero.lanzarHuevo(scanner);

			}else if (opcion.equals("2")){
				tablero.mostrarMatrizControl();
				tablero.lanzarHuevo(scanner);
				
			}else if (opcion.equals("3")){

				condMenu = false;
			} else {
				System.out.println("Opción inválida");
			}
		}
	}
	public static void main(String[] args) {
		
		menu();

	}
}
