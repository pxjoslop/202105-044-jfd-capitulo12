package edu.cibertec.colaimpresion;

import edu.cibertec.facturacion.documento.Factura;

public class impresionFactura {

    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.imprimir("001-121215154");
        //Empresa cibertec = new Empresa();
    }
}
