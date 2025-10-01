package model;

public class ProfesorCatedra extends Profesor {
    private int horas;
    private boolean empresaExterna;

    public ProfesorCatedra(String id, String nombre, String titulo, int experiencia,
                           int horas, boolean empresaExterna) {
        super(id, nombre, titulo, experiencia);
        this.horas = horas;
        this.empresaExterna = empresaExterna;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isEmpresaExterna() {
        return empresaExterna;
    }

    public void setEmpresaExterna(boolean empresaExterna) {
        this.empresaExterna = empresaExterna;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + horas + "h" + (empresaExterna ? " (empresa externa)" : "");
    }
}
