package edu.cibertec.facturacion.service;

public class Impuestos {

    public double calcularIGV(double bruto) {
          return bruto * 0.18;
    }
    
    public double calcularRetencion(double bruto) {
        return bruto * 0.12;
    }
    
}
