package model;

public class Elefante extends Animal {

    public Elefante(String nombre, byte edad, int id) {
        super(nombre, edad, "Elefante", id);
    }

    @Override
    public String hacerSonido() {
        return "Barrito o retumbar";
    }
}
