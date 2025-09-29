package model;

public class Loro extends Animal {

    public Loro(String nombre, byte edad, int id) {
        super(nombre, edad, "Loro", id);
    }

    @Override
    public String hacerSonido() {
        return "Parloteo";
    }
}
