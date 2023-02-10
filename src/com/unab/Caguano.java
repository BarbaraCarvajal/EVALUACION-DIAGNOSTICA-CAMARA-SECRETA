package com.unab;

public class Caguano extends Carro {

    String alcanceTiro, colorConfeti;

    public Caguano(String cantOcupantes, String fechaIngreso, int fila, int columna, String alcanceTiro,
            String colorConfeti) {
                
        super(cantOcupantes, fechaIngreso, fila, columna);
        this.alcanceTiro = alcanceTiro;
        this.colorConfeti = colorConfeti;
    }

    

    

}
