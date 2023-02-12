package com.unab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
 */

//  Clase “Tablero”: representa terreno en que se ubica cada carro y proyectiles.
public class Tablero {

    //Crear 2 atributos: un arreglo de instancias de “Carro”(<19 elementos) y un arreglo de instancias de “Huevo”(ilimitado)
    Carro[] matrizCarro = new Carro[18];
    ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();

    // tablero
    String[][] matrizTablero = new String[16][16];

    // Calcular coordenadas del carro de forma aleatoria sin traslaparse entre si.
    // fila y columna aleatorio
    Random numRandom = new Random();

    String[] columnas = {"a", "b" , "c" , "d", "e", "f", "g", "h", "i", "j", "k", "l","m", "n", "o" };

    //Crear una subclase de clase Carro y asignar a lista respectiva.
    public void crearCarro() {

        matrizCarro[0] = new Kromi("12-02-2000", 2, numRandom.nextInt(15), numRandom.nextInt(15), "1998", "Mercedes");
        matrizCarro[1] = new Kromi("13-08-1993", 2, numRandom.nextInt(15), numRandom.nextInt(15), "1993", "Toyota");
        matrizCarro[2] = new Kromi("12-09-2020", 1, numRandom.nextInt(15), numRandom.nextInt(15), "2000", "BMW");

        matrizCarro[3] = new Caguano("12-04-2000", 3, numRandom.nextInt(15), numRandom.nextInt(15), "200", "naranja");
        matrizCarro[4] = new Caguano("14-09-2010", 3, numRandom.nextInt(15), numRandom.nextInt(15), "100", "rojo");
        matrizCarro[5] = new Caguano("15-05-2002", 2, numRandom.nextInt(15), numRandom.nextInt(15), "300", "rosa");
        matrizCarro[6] = new Caguano("17-03-2005", 5, numRandom.nextInt(15), numRandom.nextInt(15), "150", "celeste");
        matrizCarro[7] = new Caguano("03-05-2005", 6, numRandom.nextInt(15), numRandom.nextInt(15), "230", "negro");

        matrizCarro[8] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla1");
        matrizCarro[9] = new Trupalla("03-05-2005", 4, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla2");
        matrizCarro[10] = new Trupalla("03-05-2005", 5, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla3");
        matrizCarro[11] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla4");
        matrizCarro[12] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla5");
        matrizCarro[13] = new Trupalla("03-05-2005", 1, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla6");
        matrizCarro[14] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla7");
        matrizCarro[15] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla8");
        matrizCarro[16] = new Trupalla("03-05-2005", 4, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla9");
        matrizCarro[17] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15), numRandom.nextInt(15), 0, "trupalla10");

    }

    // Crear instancia de clase “Huevo”, 
    
    // Solicitar coordenada de lanzamiento,asigna el puntaje al movimiento y la almacena en el listado
    // correspondiente.
    public void lanzarHuevo(Scanner scanner) {
        Huevo huevo1 = new Huevo(0, 0, 0);
        System.out.print("\r\n> Ingresa Fila y columna que deseas atacar (Ej: a1): ");
        String input = scanner.nextLine();
        //FIXME: Se podría validar input para q sea vocal de lista o N° del 1-15
        String colAtaque = input.substring(0, 1);
        int filaAtaque = Integer.parseInt(input.substring(1)) ;    
        huevo1.setFila(filaAtaque);
        // System.out.println(huevo1.fila +" es Indice de fila: " + filaAtaque);
        for (String letra : columnas) {
            if (colAtaque.equals(letra)) {
                huevo1.setColumna(findIndex(columnas, colAtaque) + 1);
                // System.out.println(huevo1.columna +" es Indice de columna : " + colAtaque);            
            }            
        }
        //FIXME: No cambia el elemento
        matrizTablero[huevo1.fila][huevo1.columna] = "H";
        // matrizTablero[5][8] = "H";

    }

    public int findIndex(String arr[], String t)
    {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    // Mostrar carros existentes y lanzamientos registrados(“H”).
    // independiente de si acierta a un carro o no.
    //Realizada la acción, calcular puntaje obtenido hasta el momento.
    public void mostrarMatriz() {

        for (int i = 1; i < matrizTablero.length; i++) {
            matrizTablero[0][0] = "   ";
            matrizTablero[0][i]= columnas[i-1] + " " ;
          
            for (int celdas = 1; celdas < matrizTablero[i].length; celdas++) {
                if (celdas > 9) {
                    matrizTablero[celdas][0] = Integer.toString(celdas);
                } else {
                    matrizTablero[celdas][0] =" " +  Integer.toString(celdas);

                }
                matrizTablero[i][celdas] = " _";

            }
        }
        
        for (String[] fila : matrizTablero) {
            String filaStr = String.join(" ", fila);      
            System.out.println(filaStr);  
        }
        // for (int fila = 0; fila < matrizTablero.length; fila++) {
        //     System.out.println(Arrays.toString(matrizTablero[fila]));
        // }

    }

    // Calcular puntaje por cada lanzamiento y mostrar resultado. 
    // Este método visible sólo dentro de clase, y es utilizado en métodos la clase.
    public void calcularPuntaje() {

    }


    
}
