package model;

public class ProfesorPlanta extends Profesor {
    private TipoDedicacion dedicacion;
    private boolean investigacion;

    public ProfesorPlanta(String id, String nombre, String titulo, int experiencia,
                          TipoDedicacion dedicacion, boolean investigacion) {
        super(id, nombre, titulo, experiencia);
        this.dedicacion = dedicacion;
        this.investigacion = investigacion;
    }

    public TipoDedicacion getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(TipoDedicacion dedicacion) {
        this.dedicacion = dedicacion;
    }

    public boolean isInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(boolean investigacion) {
        this.investigacion = investigacion;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + dedicacion + (investigacion ? " (investigador)" : "");
    }
}
