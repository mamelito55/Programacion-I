package model;

import java.util.Arrays;

public class Mascota {

    private String id;
    private String nombre;
    private String especie;
    private String raza;
    private byte edad;
    private String color;
    private double peso;
    private String[] enfermedades;

    public Mascota(String id, String nombre, String especie, String raza,
                   byte edad, String color, double peso, String[] enfermedades) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;

        this.enfermedades = new String[5];
        if (enfermedades != null) {
            int n = Math.min(enfermedades.length, 5);
            for (int i = 0; i < n; i++) {
                this.enfermedades[i] = enfermedades[i];
            }
        }
    }

    public Mascota(String id, String nombre, String especie, String raza,
                   byte edad, String color, double peso) {
        this(id, nombre, especie, raza, edad, color, peso, null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String[] getEnfermedades() {
        return Arrays.copyOf(enfermedades, enfermedades.length);
    }

    public void setEnfermedades(String[] nuevas) {
        this.enfermedades = new String[5];
        if (nuevas != null) {
            int n = Math.min(nuevas.length, 5);
            for (int i = 0; i < n; i++) {
                this.enfermedades[i] = nuevas[i];
            }
        }
    }

    @Override
    public String toString() {
        return "Mascota id: " + id + "\n nombre: " + nombre + "\n especie: " + especie + "\n raza: " + raza + "\n edad: " + edad + "\n color: " + color + "\n peso: " + peso;
    }
}
