/*
*Aplicacion para gestionar materias, profesores y estudiantes en una carrera universitaria.
*Isabel Cristina Guerra & Samuel Marín Varón
* 30 de septiembre del 2025
* GNU GPL V3
 */

package app;

import model.*;

public class Aplicacion {
    public static void main(String[] args) {
        Carrera carrera = new Carrera("Ingeniería de Sistemas");

        ProfesorPlanta prof1 = new ProfesorPlanta("P01", "Ana Gómez", "PhD en Sistemas", 10, TipoDedicacion.TIEMPO_COMPLETO, true);
        ProfesorCatedra prof2 = new ProfesorCatedra("P02", "Carlos Ruiz", "Magíster en Ingeniería", 5, 12, true);

        System.out.println(carrera.registrarProfesor(prof1));
        System.out.println(carrera.registrarProfesor(prof2));

        MateriaTeorica mat1 = new MateriaTeorica("MAT101", "Matemáticas I", 4, 3, 1);
        MateriaPractica mat2 = new MateriaPractica("INF201", "Laboratorio Programación", 3, 2, 2, 2, 6);

        System.out.println(carrera.registrarMateria(mat1));
        System.out.println(carrera.registrarMateria(mat2));

        System.out.println(carrera.asignarProfesor("P01", "MAT101"));
        System.out.println(carrera.asignarProfesor("P02", "INF201"));

        EstudiantePregrado est1 = new EstudiantePregrado("S01", "María López", "12345", "Sistemas", "2", true, 4.3);
        EstudiantePosgrado est2 = new EstudiantePosgrado("S02", "Diego Pérez", "67890", "Sistemas", "3", "Maestría en IA", "Visión Computacional");

        System.out.println(carrera.registrarEstudiante(est1));
        System.out.println(carrera.registrarEstudiante(est2));

        System.out.println(carrera.inscribirEstudiante("S01", "MAT101"));
        System.out.println(carrera.inscribirEstudiante("S01", "INF201"));
        System.out.println(carrera.inscribirEstudiante("S02", "INF201"));

        System.out.println("\nMaterias de semestre 1:");
        carrera.materiasPorSemestre(1).forEach(System.out::println);

        System.out.println("\nEstudiantes en INF201:");
        carrera.estudiantesPorMateria("INF201").forEach(System.out::println);

        System.out.println("\nHoras semanales INF201: " + carrera.horasSemanalesMateria("INF201"));
        System.out.println("Créditos totales de S01: " + carrera.creditosDeEstudiante("S01"));
    }
}
