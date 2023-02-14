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
// PKS, grupo que contempla Kromis, caguanos, trupallas
// TODO: Kromis: largo de tres metros cada una,utilizadas para transportar efectivos de PKS.
// TODO:Trupallas: efectivos cibernéticos con tecnología de punta, c/u ocupa metro cuadrado de espacio, opresores de manifestantes 
// TODO: Programa que simule posiciones de efectivos alrededor de Cámara Secreta, y  coordinar acciones previas a invasión.


//TODO: 3 Kromis, c/u utiliza 3 celdas de matriz y siempre de forma vertical. => letra “K”.
//TODO: Caguanos, siempre horizontalmente==>letra“C” y usa 2 espacios. (izq-> der)
//TODO:10 Trupallas 1 celda ==> letra “T”.

//TODO: Situar los vehículos de forma aleatoria
//TODO: Se recomienda hacerlo en el orden antes mencionado, pero no es obligación. 
//TODO: No pueden existir vehículos encima de otros.
//TODO: Validar que celda esté vacía antes de agregar.
//TODO: Obtener otro par de coordenadas de forma aleatoria si está ocupada
//TODO: Validar que se agregue dentro de matriz
// TODO: Solicitar otra fila y columna si quedase fuera de rango

// TODO: Verificar si en la matriz está ubicado un vehículo o no:
// TODO: Indicar el puntaje total obtenido por el usuario al finalizar programa.

// TODO: Crear Clase “Kromi” (child class) 
// TODO: Atributo: año de fabricación y su marca.
// TODO: Crear Clase “Trupalla” (child class) 
// TODO: Atributos: nivel de armadura (entero entre 1 a 5) y nombre de persona que manipula.

// TODO:  Crear métodos set, get y toString en todas las clases
// TODO: Crear constructor apropiado en todas las clases.
// TODO: Crear otras clases si es necesario
// TODO: Crear menú que despliegue acciones que contempla programa, y mostrar hasta que usuario salga del programa.
// TODO: Considerar POO: Estructura de clases y superclases, conceptos de herencia y polimorfismos.
// TODO: Implementar la mayor cantidad de conceptos vistos en cada una de las clases
// TODO: Duración máxima de 3 clases. 
// TODO: Se revisará en uno de los equipos de los participantes

	static Scanner scanner = new Scanner(System.in);
	//El programa debe contar con un menú que despliegue las acciones que
  //contempla el programa,ydebemostrarsetantasvecesseanecesariohastaelusuario indique lo contrario.

	public void menu(){

		boolean condMenu = true;
		while (condMenu){
			System.out.println("Ingrese su opción");
			System.out.println(""
													+"Opcion 1) " 
													+"Opcion 2) " 
													+"Opcion 3) "
													+"Opcion 4) SALIR ");
			String opcion = scanner.nextLine();
			if (opcion.equals("1")){

			}else if (opcion.equals("2")){

			}else if (opcion.equals("2")){
				
			}else if (opcion.equals("4")){
				System.out.println("Hasta luego");
				condMenu = false;
			}
		}
	}
	public static void main(String[] args) {


		
		Tablero tablero = new Tablero();
		// Graficas graph = new Graficas();
		
		tablero.crearTablero();
		tablero.crearCarro();
		System.out.println("\r\n\t\t¡A Jugar!");  
		System.out.println("\r\n\t\tPuntaje Inicial: 0");  

		boolean gameOn = true;
		while (gameOn) {
			tablero.mostrarMatriz();
			tablero.lanzarHuevo(scanner);
		}
	}
}
