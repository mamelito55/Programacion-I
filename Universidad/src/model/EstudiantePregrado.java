package model;

public class EstudiantePregrado extends Estudiante {
    private boolean beca;
    private double promedio;

    public EstudiantePregrado(String id, String nombre, String documento, String programa,
                              String semestre, boolean beca, double promedio) {
        super(id, nombre, documento, programa, semestre);
        this.beca = beca;
        this.promedio = promedio;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + " | Beca: " + (beca ? "Sí" : "No") + " | Prom: " + promedio;
    }
}
