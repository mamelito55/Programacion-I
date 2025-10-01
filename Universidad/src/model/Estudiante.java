package model;

import java.util.*;

public abstract class Estudiante {
    private String id;
    private String nombre;
    private String documento;
    private String programa;
    private String semestre;
    private static Map<String, List<Estudiante>> estudiantesPorMateria = new HashMap<>();

    public Estudiante(String id, String nombre, String documento, String programa, String semestre) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.programa = programa;
        this.semestre = semestre;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public static String inscribirEstudianteEnMateria(String materia, Estudiante estudiante) {
        estudiantesPorMateria.putIfAbsent(materia, new ArrayList<>());
        estudiantesPorMateria.get(materia).add(estudiante);
        return "Inscrito en " + materia;
    }

    public static String listarEstudiantesPorMateria(String materia) {
        List<Estudiante> lista = estudiantesPorMateria.get(materia);
        if (lista == null || lista.isEmpty()) return "Sin estudiantes en " + materia;
        StringBuilder sb = new StringBuilder();
        for (Estudiante e : lista) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Doc: " + documento +
                " | Programa: " + programa + " | Semestre: " + semestre;
    }
}
