
package tp3_poo_ejercicios;

    /**
 * Clase que representa una mascota con nombre, especie y edad.
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " (" + especie + ")");
        System.out.println("Edad: " + edad + " años");
    }

    // Método para simular el paso del tiempo
    public void cumplirAnios() {
        edad++;
    }
}

