package com.example;

import java.util.ArrayList;
import java.util.List;
 
public class Main { 
    public static void main(String[] args) {
        /* Create menu */
        List<String> menu = new ArrayList<>();
        menu.add("Pizza");
        menu.add("Pasta");
        menu.add("Ensalada");
        menu.add("Sopa");
        menu.add("Postre");

        /* Create Restaurante */
        Restaurante restaurante = new Restaurante("La Buena Mesa", "Italiana", 
                                                  "Calle Falsa 123", 50, 
                                                  "12:00", "22:00", 10, 
                                                  menu);

        /* Info menu */
        restaurante.mostrarMenu();

        /* Reserve table */
        restaurante.reservarMesa(2);

        /* Calculate billing */
        List<String> platosPedido = new ArrayList<>();
        platosPedido.add("Pizza");
        platosPedido.add("Pasta");
        restaurante.calcularFactura(platosPedido);
    }
}