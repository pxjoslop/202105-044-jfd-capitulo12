package edu.cibertec.ejercicio3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebaPattern {

    public static void main(String[] args) {
        Pattern p = Pattern.compile(";");
        String cadena = "Nuevo;Curso;Java;Fundamentos";
        String partes[] = p.split(cadena);
        for (String parte : partes) {
            System.out.println(parte);
        }
        
        //Comparando cadenas
        p = Pattern.compile(".");
        Matcher m = p.matcher("X");
        System.out.println(m.matches());
        Matcher m1 = p.matcher("XYZ");
        System.out.println(m1.matches());

        //Comparando cadenas 2
        System.out.println(" --- 2 ---");
        p = Pattern.compile("[abc]");
        m = p.matcher("b");
        System.out.println(m.matches());
        m1 = p.matcher("e");
        System.out.println(m1.matches());
        
        //Comparando fijos Perú
        System.out.println(" --- 3 ---");
        p = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}");
        m = p.matcher("(051)485-6368");
        System.out.println(m.matches());
        m1 = p.matcher("442-12545");
        System.out.println(m1.matches());
        
    }
}
