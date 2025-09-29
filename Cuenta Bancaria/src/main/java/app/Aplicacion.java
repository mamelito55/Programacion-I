package app;

import model.*;

public class Aplicacion {
    public static void main(String[] args) {

        CuentaAhorros ahorro = new CuentaAhorros(11500, 5);
        ahorro.consignar(2000);
        ahorro.retirar(1000);
        ahorro.extractoMensual();
        ahorro.imprimir();

        System.out.println();

        CuentaCorriente corriente = new CuentaCorriente(5000, 5);
        corriente.retirar(8000);
        corriente.consignar(4000);
        corriente.extractoMensual();
        corriente.imprimir();
    }
}
