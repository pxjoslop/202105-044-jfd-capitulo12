package edu.cibertec.ejercicio2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PruebaVar {

    public static void main(String[] args) {
        var cadena = "Cibertec";
        if (cadena.equalsIgnoreCase("CIBErtec")) {
            System.out.println("Son iguales");
        }

        var map = new HashMap<String, String>();

        var padre = new Object();
        padre = new String("Hola mundo");
        System.out.println("Contenido del padre = " + padre.toString());

        Map<String, List<String>> empresaEmpleado = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : empresaEmpleado.entrySet()) {
            List<String> empleados = entry.getValue();
        }

        var empresaEmpleado2 = new HashMap<String, List<String>>();
        for (var entry : empresaEmpleado.entrySet()) {
            var empleados2 = entry.getValue();
        }

    }

}
