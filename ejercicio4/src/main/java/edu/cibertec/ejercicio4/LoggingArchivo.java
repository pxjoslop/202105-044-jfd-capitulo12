package edu.cibertec.ejercicio4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingArchivo {

    private static final Logger LOGGER
            = Logger.getLogger(LoggingArchivo.class.getName());

    public static void main(String[] args) {

        try {
            // lee archivo log.properties en carpeta del proyecto
            File archivo = new File("src/main/resources/miLog.properties");
            LogManager.getLogManager().readConfiguration(
                    new FileInputStream(archivo));

            // archivo .log a grabar mensajes
            FileHandler fileHandler = new 
                FileHandler("src/main/resources/auditoria.txt", true);
            LOGGER.addHandler(fileHandler);

            // mensajes
            LOGGER.info("log INFO");
            LOGGER.severe("log SEVERE");
            LOGGER.warning("log WARNING");

            System.out.println("fin...");

        } catch (FileNotFoundException e) {
            LOGGER.severe("No existe log.properties");

        } catch (IOException | SecurityException e) {
            LOGGER.log(Level.SEVERE, "Error: {0}", e);
        }
    }
}
