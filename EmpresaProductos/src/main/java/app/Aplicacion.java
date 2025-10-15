/*
*Aplicacion para generar el valor total de la factura de un cliente
* Samuel Marin Varon
* 14 de octubre del 2025
* GNU GPL V3
 */

package app;

import model.*;

import java.time.LocalDate;

public class Aplicacion {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Comercializadora UQ", "Calle 10 #20-30", "900123456");

        Cliente cliente1 = new ClienteFrecuente("Ana Pérez", "12345678", "Calle A", 10);
        Cliente cliente2 = new ClienteCorporativo("Industrias XYZ", "87654321", "Avenida B", "9008001", 0.10);

        empresa.registrarCliente(cliente1);
        empresa.registrarCliente(cliente2);

        Producto producto1 = new ProductoAlimenticio("A001", "Leche", 3.5, 100, LocalDate.of(2025, 10, 1));
        Producto producto2 = new ProductoElectrodomestico("E001", "Licuadora", 120.0, 10, 12);

        empresa.registrarProducto(producto1);
        empresa.registrarProducto(producto2);

        Factura factura1 = new Factura("F001", LocalDate.now(), cliente1);
        factura1.agregarDetalle(new DetalleFactura(producto1, 3));
        factura1.agregarDetalle(new DetalleFactura(producto2, 1));

        empresa.registrarFactura(factura1);

        System.out.println("Total factura cliente frecuente: " + factura1.calcularTotal());
    }
}
