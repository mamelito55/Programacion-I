package model;

public class MateriaTeorica extends Materia {
    public MateriaTeorica(String codigo, String nombre, int horasTeoria, int creditos, int semestre) {
        super(codigo, nombre, horasTeoria, creditos, semestre);
    }

    @Override
    public int calcularHorasTotales() {
        return getHorasTeoria();
    }
}
