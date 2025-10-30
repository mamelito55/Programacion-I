package app;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Thomas", 14));
        personas.add(new Persona("John", 20));
        personas.add(new Persona("Patricia", 39s));
        personas.add(new Persona("Daniel", 28));

        System.out.println("Lista principal:");
        for (Persona personaList : personas) {
            System.out.println(personaList);
        }

        Ordenador ordenador = new Ordenador();
        ordenador.burbujaNombre(personas);

        System.out.println("\nLista ordenada por el nombre:");
        for (Persona personaList : personas) {
            System.out.println(personaList);
        }

        ordenador.burbujaEdad(personas);
        System.out.println("\nLista ordenada por la edad (menor a mayor):");
        for (Persona personaList : personas) {
            System.out.println(personaList);
        }
    }
}
