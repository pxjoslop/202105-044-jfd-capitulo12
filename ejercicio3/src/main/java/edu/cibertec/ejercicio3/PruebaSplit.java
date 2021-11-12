package edu.cibertec.ejercicio3;

public class PruebaSplit {

    public static void main(String[] args) {
        String cadena = "Nuevo;Curso;Java;Fundamentos";
        String partes[] = cadena.split(";");
        for (String parte : partes) {
            System.out.println(parte);
        }
        System.out.println(" ---- Con caracter | ----");
        cadena="Nuevo|Curso|Java|Fundamentos";
        partes = cadena.split("\\|", 3);
        for (String parte : partes) {
            System.out.println(parte);
        }
    }
}
