package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Producto> listaProductos = new ArrayList<>();
    private List<Factura> listaFacturas = new ArrayList<>();

    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void registrarFactura(Factura factura) {
        listaFacturas.add(factura);
    }
}

