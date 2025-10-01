package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Materia {
    private String codigo;
    private String nombre;
    private int horasTeoria;
    private int creditos;
    private int semestre;
    private Profesor profesor;
    private List<Estudiante> inscritos;
    private List<Estudiante> listaEstudiantes;

    public Materia(String codigo, String nombre, int horasTeoria, int creditos, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasTeoria = horasTeoria;
        this.creditos = creditos;
        this.semestre = semestre;
        this.inscritos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getInscritos() {
        return inscritos;
    }

    public void addEstudiante(Estudiante e) {
        if (!inscritos.contains(e)) inscritos.add(e);
    }

    public abstract int calcularHorasTotales();

    @Override
    public String toString() {
        return "[%s] %s - Sem %d, %d créditos".formatted(codigo, nombre, semestre, creditos);
    }
}

