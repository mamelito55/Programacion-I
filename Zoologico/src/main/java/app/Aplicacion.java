/*
*Aplicación para registrar animales a un zoologico
*Samuel Marín Varón
*18 de noviembre del 2025
*GNU GPL V3
*/

package app;

import model.*;

public class Aplicacion {

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("Zoo Uku", "Medellín");

        Animal a1 = new Perro("Candy", (byte)5, 1);
        Animal a2 = new Gato("Tom", (byte)3, 2);
        Animal a3 = new Elefante("Dumbo", (byte)10, 3);
        Animal a4 = new Loro("Jack", (byte)2, 4);
        Animal a5 = new Leon("Simba", (byte)7, 5);

        System.out.println(zoo.registrarAnimal(a1));
        System.out.println(zoo.registrarAnimal(a2));
        System.out.println(zoo.registrarAnimal(a3));
        System.out.println(zoo.registrarAnimal(a4));
        System.out.println(zoo.registrarAnimal(a5));

        System.out.println("\nAnimales en el zoológico: ");
        for (Animal a : zoo.getListaAnimales()) {
            System.out.println("-" + a.getNombre() + " (" + a.getEspecie() + ")" +"\n-Edad: "+a.getEdad()+"\n-ID: "+a.getId()+"\n");
        }

        System.out.println("\nSonidos de los animales: ");
        zoo.hacerSonarAnimales();
    }
}
