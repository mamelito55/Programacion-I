package model;

public class MateriaPractica extends Materia {
    private int horasPractica;
    private int numeroLaboratorios;

    public MateriaPractica(String codigo, String nombre, int horasTeoria, int creditos, int semestre, int horasPractica, int numeroLaboratorios) {
        super(codigo, nombre, horasTeoria, creditos, semestre);
        this.horasPractica = horasPractica;
        this.numeroLaboratorios = numeroLaboratorios;
    }

    @Override
    public int calcularHorasTotales() {
        return getHorasTeoria() + horasPractica;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | %d h/práctica, %d labs", horasPractica, numeroLaboratorios);
    }
}
