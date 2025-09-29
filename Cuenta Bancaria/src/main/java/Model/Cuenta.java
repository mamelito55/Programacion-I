/*
 *Aplicación que simula una cuenta bancaria
 *Samuel Marín Varón
 *18 de noviembre del 2025
 *GNU GPL V3
 */

package model;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;

    public Cuenta(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0;
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numeroConsignaciones++;
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }

    public void calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) / 100 * saldo;
        saldo += interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Cuenta" + "\n Saldo: " + saldo + "\n Consignaciones: " + numeroConsignaciones + "\n Retiros: " + numeroRetiros + "\n Tasa anual: " + tasaAnual + "%" + "\n Comision mensual: " + comisionMensual);
    }

    public float getSaldo() {
        return saldo;
    }
}
