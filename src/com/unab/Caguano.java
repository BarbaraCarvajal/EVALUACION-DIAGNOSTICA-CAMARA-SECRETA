package com.unab;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
/**
 * @author Luis Zenteno,Barbara Carvajal, María-Fernanda Villalobos
 *
 */
public class Caguano extends Carro {

    String alcanceTiro, colorConfeti;

    public Caguano(String cantOcupantes, String fechaIngreso, int fila, int columna, String alcanceTiro,
            String colorConfeti) {
                
        super(cantOcupantes, fechaIngreso, fila, columna);
        this.alcanceTiro = "50 metros";
        this.colorConfeti = getRandomColor();
    }

    // Tomar un color de forma aleatoria desde la lista
    public String getRandomColor() {
        String color = "";
        // Crear lista tipo String 
		List<String> colors = new ArrayList<>("violeta", "blanco", "azul", "celeste", "rojo", "verde", "rosado", "naranjo");
        
        // boundIndex para seleccionar en sublista
		int boundIndex = 3;

        // ThreadLocalRandom genera un número tipo int
		list.get(
			ThreadLocalRandom.current().nextInt(colors.size())
			% boundIndex);
		System.out.println(color);
        return color;
    }

    public String getAlcanceTiro() {
        return alcanceTiro;
    }

    public String getColorConfeti() {
        return colorConfeti;
    }

    public void setAlcanceTiro(String alcanceTiro) {
        this.alcanceTiro = alcanceTiro;
    }

    public void setColorConfeti(String colorConfeti) {
        this.colorConfeti = colorConfeti;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    

}
