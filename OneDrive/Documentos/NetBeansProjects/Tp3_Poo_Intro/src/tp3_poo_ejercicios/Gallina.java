package tp3_poo_ejercicios;

/**
 * Clase que representa una gallina en una granja digital.
 * Modela su edad, producción de huevos y estado actual.
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // Inicialmente no ha puesto huevos
    }

    // Método para simular que pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
    }

    // Método para simular que envejece
    public void envejecer() {
        edad++;
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Gallina #" + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("---------------------------");
    }
}