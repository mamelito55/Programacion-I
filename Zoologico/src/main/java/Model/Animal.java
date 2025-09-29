package model;

public abstract class Animal {
    protected String nombre;
    protected byte edad;
    protected String especie;
    protected int id;

    public Animal(String nombre, byte edad, String especie, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public int getId() {
        return id;
    }

    public abstract String hacerSonido();
}
