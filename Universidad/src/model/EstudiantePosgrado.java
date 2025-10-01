package model;

public class EstudiantePosgrado extends Estudiante {
    private String maestria;
    private String tema;

    public EstudiantePosgrado(String id, String nombre, String documento, String programa,
                              String semestre, String maestria, String tema) {
        super(id, nombre, documento, programa, semestre);
        this.maestria = maestria;
        this.tema = tema;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return super.toString() + " | Maestría: " + maestria + " | Investigación: " + tema;
    }
}
