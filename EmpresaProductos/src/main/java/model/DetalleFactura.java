package model;

public record DetalleFactura(Producto producto, int cantidad) {
    public double subTotal() {
        return producto.getPrecioUnitario() * cantidad;
    }
}
