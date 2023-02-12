/**
 * 
 */
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
// TODO: Dar puntaje: proyectil da sobre una Kromi = 3 puntos, sobre Caguano= 2puntos, sobre Trupalla = 1 punto.
// TODO: Puntajes :Kromi con 3 celdas atacadas (inutilizada) =  10 puntos adicionales. 
// TODO:Puntajes: utilizar Caguano = 7 puntos adicionales.
// TODO:Puntajes:Trupalla queda inutilizado con 1 huevo ==> sin puntaje adicional
// TODO: Atributo: cantidad ilimitada de huevos a lanzar, huevo puede caer más de una vez sobre misma posición.
// TODO: Puntajes :celda atacada  == “H” en matriz. 
// TODO: Puntajes:  Celda atacada previamente NO da puntaje.
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
// TODO: Evitar la copia de código directo, tanto de Internet como de pares.
// TODO: Se valorará la participación y el trabajo colaborativo.
// TODO: Revisión se realizará durante clases.
// TODO: Duración máxima de 3 clases. 
// TODO: Se revisará en uno de los equipos de los participantes
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Tablero tablero = new Tablero();
		System.out.println("\r\n\t\t¡A Jugar!\r\n");  
		tablero.mostrarMatriz();
		tablero.crearCarro();
		tablero.lanzarHuevo(scanner);
		tablero.mostrarMatriz();

		

	}

}
