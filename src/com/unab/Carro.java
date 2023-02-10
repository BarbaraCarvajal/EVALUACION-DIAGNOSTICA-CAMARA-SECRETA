package com.unab;

/**
 * @author Luis Zenteno
 *
 */
public class Carro {

    String cantOcupantes,fechaIngreso;
    int fila, columna;
    

    public Carro(String cantOcupantes, String fechaIngreso, int fila, int columna) {
        this.cantOcupantes = cantOcupantes;
        this.fechaIngreso = fechaIngreso;
        this.fila = fila;
        this.columna = columna;
    }



    @Override
    public String toString() {
        return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngreso=" + fechaIngreso + "]";
    }
}
