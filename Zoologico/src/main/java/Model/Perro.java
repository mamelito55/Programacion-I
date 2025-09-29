package model;

public class Perro extends Animal {

    public Perro(String nombre, byte edad, int id) {
        super(nombre, edad, "Perro", id);
    }

    @Override
    public String hacerSonido() {
        return "Ladrido";
    }
}
