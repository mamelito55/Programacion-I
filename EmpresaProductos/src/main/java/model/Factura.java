package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private List<DetalleFactura> listaDetalles = new ArrayList<>();

    public Factura(String codigo, LocalDate fecha, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        listaDetalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleFactura d : listaDetalles) {
            total += d.subTotal();
        }
        return total * (1 - cliente.getDescuento());
    }
}
