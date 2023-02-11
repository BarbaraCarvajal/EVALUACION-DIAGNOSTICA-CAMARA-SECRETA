package com.unab;

/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
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
}

