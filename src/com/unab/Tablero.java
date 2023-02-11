package com.unab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
 */
public class Tablero {

    /*Clase “Tablero”: 
    clase que representa el terreno en el que se ubica cada 
    carro y en el cual se sitúan proyectiles. Esta clase debe contener dos atributos: 
    una lista o arreglo de instancias de la clase “Carro” y una lista de instancias 
    de la clase “Huevo”; se sabe que la primera lista no tendrá más de 18 
    elementos, mientras que en el segundo no hay límite de instancias a crear. 
    Esta clase, además, debe tener definidos los siguientes métodos:
    */
    
    // Array<Usuario> listaUsuarios = new ArrayList<>();

    
    Carro[] matrizCarro = new Carro[18];
    ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>();

    // tablero
    int[][] matrizTablero = new int[15][15];

    //fila y columna aleatorio
    Random numRandom = new Random();

    //Crear Carro: crea una subclase de la clase Carro y la asigna a la lista respectiva. 
    //Recuerde que las coordenadas del carro se calculan de forma aleatoria, y no se 
    //puede traslapar un carro con otro.
    //instanciar
    public void crearCarro(){
       
        matrizCarro[0] = new Kromi("12-02-2000", 2, numRandom.nextInt(15), numRandom.nextInt(15), "1998", "Mercedes");
        matrizCarro[1] = new Kromi("13-08-1993", 2, numRandom.nextInt(15), numRandom.nextInt(15), "1993", "Toyota");
        matrizCarro[2] = new Kromi("12-09-2020", 1,numRandom.nextInt(15) , numRandom.nextInt(15), "2000", "BMW");
        
        matrizCarro[3] = new Caguano("12-04-2000", 3, numRandom.nextInt(15) , numRandom.nextInt(15), "200", "naranja");
        matrizCarro[4] = new Caguano("14-09-2010", 3, numRandom.nextInt(15) , numRandom.nextInt(15), "100", "rojo");
        matrizCarro[5] = new Caguano("15-05-2002", 2, numRandom.nextInt(15) , numRandom.nextInt(15), "300", "rosa");
        matrizCarro[6] = new Caguano("17-03-2005", 5, numRandom.nextInt(15) , numRandom.nextInt(15),"150", "celeste");
        matrizCarro[7] = new Caguano("03-05-2005", 6, numRandom.nextInt(15) , numRandom.nextInt(15), "230", "negro");

        matrizCarro[8] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla1");
        matrizCarro[9] = new Trupalla("03-05-2005", 4, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla2");
        matrizCarro[10] = new Trupalla("03-05-2005", 5, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla3");
        matrizCarro[11] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla4");
        matrizCarro[12] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla5");
        matrizCarro[13] = new Trupalla("03-05-2005", 1, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla6");
        matrizCarro[14] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla7");
        matrizCarro[15] = new Trupalla("03-05-2005", 3, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla8");
        matrizCarro[16] = new Trupalla("03-05-2005", 4, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla9");
        matrizCarro[17] = new Trupalla("03-05-2005", 2, numRandom.nextInt(15) , numRandom.nextInt(15), 0, "trupalla10");


       
    }

    //Lanzar Huevo: crea una instancia de la clase “Huevo”, solicita la coordenada de 
    //lanzamiento,asigna el puntaje al movimiento y la almacena en el listado correspondiente.
    public void lanzarHuevo(){
        Huevo huevo1 = new Huevo(0, 0, 0);
    }

    //Mostrar Matriz: este método debe mostrar en forma de matriz cada uno de los 
    //carros existentes y los lanzamientos que se han registrado hasta el momento. 
    //Recuerde que donde hubo un lanzamiento debe haber una letra “H”, 
    //independiente de si acierta a un carro o no.Una vez que realiza la acción, 
    //debe calcular el puntaje obtenido hasta el momento.
    public void mostrarMatriz(){
       
    for (int fila = 0; fila < matrizTablero.length; fila++) {
        System.out.println(Arrays.toString(matrizTablero[fila]));
    }
    
    

}
    //Calcular puntaje: suma los puntajes asignados a cada lanzamiento y los 
    //entrega como resultado. Este método debe ser visible solo dentro de la 
    //clase, y es utilizado en los métodosde la misma clase. Clase “Huevo”: 
    //clase que define cada lanzamiento realizado dentro del tablero.
    public void calcularPuntaje(){
        
    }
}
