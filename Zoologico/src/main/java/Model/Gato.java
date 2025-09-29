package model;

public class Gato extends Animal {

    public Gato(String nombre, byte edad, int id) {
        super(nombre, edad, "Gato", id);
    }

    @Override
    public String hacerSonido() {
        return "Maullido";
    }
}
