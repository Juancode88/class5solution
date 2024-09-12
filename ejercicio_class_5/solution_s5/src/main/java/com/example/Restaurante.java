package com.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
 
public class Restaurante { 
    /* Feautres */
    private String nombre;
    private String tipoCocina;
    private String direccion;
    private int capacidad;
    private String horarioApertura;
    private String horarioCierre;
    private int mesasDisponibles;
    private List<String> menu;

    /* Builder */
    public Restaurante() {
        this.nombre = "Restaurante";
        this.tipoCocina = "No definido";
        this.direccion = "No definida";
        this.capacidad = 0;
        this.horarioApertura = "00:00";
        this.horarioCierre = "00:00";
        this.mesasDisponibles = 0;
        this.menu = new ArrayList<>();
    }

    /* Builder - parameters */
    public Restaurante(String nombre, String tipoCocina, String direccion, int capacidad, 
                       String horarioApertura, String horarioCierre, int mesasDisponibles, 
                       List<String> menu) {
        this.nombre = nombre;
        this.tipoCocina = tipoCocina;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.mesasDisponibles = mesasDisponibles;
        this.menu = menu;
    }

    /* Getters y Setters */ 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public int getMesasDisponibles() {
        return mesasDisponibles;
    }

    public void setMesasDisponibles(int mesasDisponibles) {
        this.mesasDisponibles = mesasDisponibles;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    /* Method */
    public void mostrarMenu() {
        System.out.println("Menú de " + nombre + ":");
        for (String plato : menu) {
            System.out.println("- " + plato);
        }
    }

    public void reservarMesa(int numeroPersonas) {
        if (mesasDisponibles > 0) {
            mesasDisponibles--;
            System.out.println("Reserva confirmada para " + numeroPersonas + " personas en " + nombre + ".");
        } else {
            System.out.println("Lo siento, no hay mesas disponibles.");
        }
    }

    /* Private method */
    private double calcularPrecioPlato(String nombrePlato) {
        HashMap<String, Double> preciosMenu = new HashMap<>();
        preciosMenu.put("Pizza", 8.99);
        preciosMenu.put("Pasta", 7.49);
        preciosMenu.put("Ensalada", 5.99);
        preciosMenu.put("Sopa", 4.99);
        preciosMenu.put("Postre", 3.99);

        return preciosMenu.getOrDefault(nombrePlato, 0.0);
    }

    public void calcularFactura(List<String> platosPedido) {
        double total = 0.0;
        System.out.println("Factura de " + nombre + ":");
        for (String plato : platosPedido) {
            double precio = calcularPrecioPlato(plato);
            total += precio;
            System.out.println(plato + ": $" + precio);
        }
        System.out.println("Total a pagar: $" + total);
    }
}