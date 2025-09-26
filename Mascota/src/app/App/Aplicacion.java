/*
*Programa para almacenar y mostrar la informacion de las mascotas de la veterinaria
*Samuel Marin Varon
*25 de septiembre del 2025
*GNU GPL V3
*/

package app;

import model.Mascota;
import java.util.ArrayList;

public class Aplicacion {

    public static void main(String[] args) {

        ArrayList<Mascota> listaMascotas = new ArrayList<>();

        Mascota m1 = new Mascota("001", "Tony", "Perro", "Labrador", (byte) 3,
                "Dorado", 24.5, new String[]{"Dermatitis", "Otitis"});

        Mascota m2 = new Mascota("002", "Candy", "Gato", "Criollo", (byte) 2,
                "Gris", 4.2);

        Mascota m3 = new Mascota("003", "Tom", "Perro", "Bulldog", (byte) 5,
                "Blanco", 30.0, new String[]{"Artritis"});

        listaMascotas.add(m1);
        listaMascotas.add(m2);
        listaMascotas.add(m3);

        System.out.println("Mascotas registradas:");
        for (Mascota m : listaMascotas) {
            System.out.println(" \n"+m);
        }
    }
}
