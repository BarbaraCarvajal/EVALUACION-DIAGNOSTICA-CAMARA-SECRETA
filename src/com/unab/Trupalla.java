package com.unab;

/**
<<<<<<< HEAD
 * @author Luis Zenteno
 *Clase “Trupalla”: clase hija que representa un Trupalla; 
 de este tipo de elemento interesa conocer su nivel de armadura 
 (entero entre 1 a 5) y el nombre de la persona que lo manipula.
=======
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
>>>>>>> b5fd6784baeea8f1ca6096e6d93936a6e4d8a17d
 */
public class Trupalla extends Carro {

    int nivelArmadura;
    String nombre;

    public Trupalla(String cantOcupantes, String fechaIngreso, int fila, int columna, int nivelArmadura,
            String nombre) {
        super(cantOcupantes, fechaIngreso, fila, columna);
        this.nivelArmadura = nivelArmadura;
        this.nombre = nombre;
    }

    public int getNivelArmadura() {
        return nivelArmadura;
    }

    public void setNivelArmadura(int nivelArmadura) {
        this.nivelArmadura = nivelArmadura;
    }

    

   
}

