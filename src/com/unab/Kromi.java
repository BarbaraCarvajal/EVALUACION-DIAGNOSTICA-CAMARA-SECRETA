package com.unab;

/**
 * @author 56958
 *
 */
public class Kromi extends Carro {

    String anioFabricacion, marca;

    public Kromi(String cantOcupantes, String fechaIngreso, int fila, int columna, String anioFabricacion,
            String marca) {
                
        super(cantOcupantes, fechaIngreso, fila, columna);
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
    }

    



}
