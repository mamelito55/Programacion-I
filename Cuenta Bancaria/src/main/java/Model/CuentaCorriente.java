package model;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            super.retirar(cantidad);
        } else {
            float diferencia = cantidad - saldo;
            saldo = 0;
            sobregiro += diferencia;
            numeroRetiros++;
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                super.consignar(cantidad);
            } else {
                sobregiro -= cantidad;
            }
        } else {
            super.consignar(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        System.out.println("Cuenta Corriente" + "\n Salgo: " + saldo + "\n Comision mensual:" + comisionMensual + "\n Transacciones: " + (numeroConsignaciones + numeroRetiros) + "\n Sobregiro: " + sobregiro);
    }
}
