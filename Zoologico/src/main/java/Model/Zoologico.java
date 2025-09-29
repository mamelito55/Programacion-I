package model;

import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String direccion;
    private ArrayList<Animal> listaAnimales;

    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaAnimales = new ArrayList<>();
    }

    public String registrarAnimal(Animal nuevoAnimal) {
        listaAnimales.add(nuevoAnimal);
        return "Animal registrado correctamente.";
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public Animal buscarAnimalPorId(int id) {
        for (Animal a : listaAnimales) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public boolean actualizarNombreAnimal(int id, String nuevoNombre) {
        Animal a = buscarAnimalPorId(id);
        if (a != null) {
            a.nombre = nuevoNombre;
            return true;
        }
        return false;
    }

    public boolean eliminarAnimal(int id) {
        Animal a = buscarAnimalPorId(id);
        if (a != null) {
            return listaAnimales.remove(a);
        }
        return false;
    }

    public void hacerSonarAnimales() {
        for (Animal a : listaAnimales) {
            System.out.println(a.getNombre() + " (" + a.getEspecie() + "): " + a.hacerSonido());
        }
    }
}
