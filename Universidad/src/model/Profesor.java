package model;

public abstract class Profesor {
    private String id;
    private String nombre;
    private String titulo;
    private int experiencia;
    private List<Materia> listaMaterias;

    public Profesor(String id, String nombre, String titulo, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.experiencia = experiencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + titulo + ", " + experiencia + " años)";
    }
}

