package edu.cibertec.ejercicio4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

    private static final Logger LOGGER
            = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {

        // nivel INFO
        LOGGER.log(Level.INFO, "etiqueta de log: {0}", LOGGER.getName());

        // nivel WARNING
        LOGGER.warning("log WARNING");

        // log con parámetros
        Object[] parametros = new Object[]{5, "hola", 8f};
        LOGGER.log(Level.INFO, "\np 0: {0}" + "\np 1: {1}"
                + "\np 2: {2}" + "\np 1: {1} (2da. vez)", parametros);

        // mensaje log para sentencia catch
        try {
            Double c = Double.valueOf("Cibertec");

        } catch (NumberFormatException e) {
            LOGGER.log(Level.WARNING, "problema: {0}", e.getMessage());
        }
    }
}
