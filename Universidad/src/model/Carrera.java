package model;

import java.util.*;
import java.util.stream.Collectors;

public class Carrera {
    private String nombre;
    private List<Materia> materias;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public String registrarMateria(Materia m) {
        if (materias.stream().anyMatch(mat -> mat.getCodigo().equals(m.getCodigo())))
            return "Materia ya existe";
        materias.add(m);
        return "Materia registrada";
    }

    public String registrarProfesor(Profesor p) {
        if (profesores.stream().anyMatch(prof -> prof.getId().equals(p.getId())))
            return "Profesor ya existe";
        profesores.add(p);
        return "Profesor registrado";
    }

    public String registrarEstudiante(Estudiante e) {
        if (estudiantes.stream().anyMatch(st -> st.getId().equals(e.getId())))
            return "Estudiante ya existe";
        estudiantes.add(e);
        return "Estudiante registrado";
    }

    public String asignarProfesor(String idProf, String codMat) {
        var prof = profesores.stream().filter(p -> p.getId().equals(idProf)).findFirst();
        var mat = materias.stream().filter(m -> m.getCodigo().equals(codMat)).findFirst();
        if (prof.isEmpty() || mat.isEmpty()) return "No encontrado";
        mat.get().setProfesor(prof.get());
        return "Profesor asignado";
    }

    public String inscribirEstudiante(String idEst, String codMat) {
        var est = estudiantes.stream().filter(e -> e.getId().equals(idEst)).findFirst();
        var mat = materias.stream().filter(m -> m.getCodigo().equals(codMat)).findFirst();
        if (est.isEmpty() || mat.isEmpty()) return "No encontrado";
        mat.get().addEstudiante(est.get());
        Estudiante.inscribirEstudianteEnMateria(codMat, est.get());
        return "Inscripción hecha";
    }

    public List<Materia> materiasPorSemestre(int sem) {
        return materias.stream().filter(m -> m.getSemestre() == sem).toList();
    }

    public List<Estudiante> estudiantesPorMateria(String codMat) {
        return materias.stream()
                .filter(m -> m.getCodigo().equals(codMat))
                .findFirst()
                .map(Materia::getInscritos)
                .orElse(Collections.emptyList());
    }

    public int horasSemanalesMateria(String codMat) {
        return materias.stream()
                .filter(m -> m.getCodigo().equals(codMat))
                .findFirst()
                .map(Materia::calcularHorasTotales)
                .orElse(0);
    }

    public int creditosDeEstudiante(String idEst) {
        return materias.stream()
                .filter(m -> m.getInscritos().stream().anyMatch(e -> e.getId().equals(idEst)))
                .mapToInt(Materia::getCreditos)
                .sum();
    }
}
