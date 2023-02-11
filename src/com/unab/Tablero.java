package com.unab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * @autor Luis Zenteno
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


    //Crear Carro: crea una subclase de la clase Carro y la asigna a la lista respectiva. 
    //Recuerde que las coordenadas del carro se calculan de forma aleatoria, y no se 
    //puede traslapar un carro con otro.
    //instanciar
    public void crearCarro(){
        for(int i = 0; i<3; i++){
            matrizCarro[i] = new Kromi(null, null, 0, 2, null, null);
        }
        for(int x=3; x<8; x++){
            matrizCarro[x] = new Caguano(null, null, 0, 0, null, null);
        }
        for(int j = 8; j<18; j++){
            matrizCarro[j] = new Trupalla(null, null, 0, 0, 0, null);
        }
        
        System.out.println(matrizCarro);
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

    }

    //Calcular puntaje: suma los puntajes asignados a cada lanzamiento y los 
    //entrega como resultado. Este método debe ser visible solo dentro de la 
    //clase, y es utilizado en los métodosde la misma clase. Clase “Huevo”: 
    //clase que define cada lanzamiento realizado dentro del tablero.
    public void calcularPuntaje(){
        
    }
}
