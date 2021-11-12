package edu.cibertec.facturacion.documento;

import edu.cibertec.facturacion.entity.Empresa;
import edu.cibertec.facturacion.service.Impuestos;
import java.util.Date;

public class Factura {

    String numero;
    Empresa empresa;
    Date fecha;
    double montoBruto;
    
    public void calcularImpuestos() {
        this.montoBruto = 1000;
        Impuestos im = new Impuestos();
        im.calcularIGV(montoBruto);
        im.calcularRetencion(montoBruto);
    }
    
    public void imprimir(String numero)
    {
        Factura fa = new Factura();
        fa.getFactura(numero);
        System.out.println("Imprimiendo la Factura "+numero);
        //Logica de impresión
    }
    
    public Factura getFactura(String numero) {
        return new Factura();
    }
}
