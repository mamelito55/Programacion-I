package model;

public class Leon extends Animal {

    public Leon(String nombre, byte edad, int id) {
        super(nombre, edad, "León", id);
    }

    @Override
    public String hacerSonido() {
        return "Rugido";
    }
}
