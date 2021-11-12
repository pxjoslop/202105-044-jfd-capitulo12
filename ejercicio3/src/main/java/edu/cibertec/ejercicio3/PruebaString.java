package edu.cibertec.ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class PruebaString {

    public static void main(String[] args) {
        // Prueba isBlank()
        String cadena = "Cibertec";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());
        cadena = "";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());
        cadena = "\t \t";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());

        System.out.println("--- Líneas en una cadena ----");
        String lineasCadena = "Bienvenidos\nal\ncurso\rJava";
        System.out.println(lineasCadena);
        List lineas = lineasCadena.lines().collect(Collectors.toList());
        System.out.println(lineas);

        System.out.println("--- Limpia espacios y tabuladores ---");
        cadena = "  Hola,  \tMundo\t ";
        System.out.println("#" + cadena + "#");
        System.out.println("#" + cadena.strip() + "#");
        System.out.println("#" + cadena.stripLeading() + "#");
        System.out.println("#" + cadena.stripTrailing() + "#");
        
        System.out.println("--- Repeat ----");
        String cancion = "De ";
        cancion += "Do ".repeat(3);
        cancion += "De ";
        cancion += "Da ".repeat(3);
        System.out.println("Canción "+cancion);

        
        System.out.println("--- Join ---");
        String union = String.join(",", "Juan", "Pedro", 
                new StringBuilder("Marcos"), new StringBuffer("Maria"));
        System.out.println(union);
        
        
    }

}
