package tp3_poo_ejercicios;

/**
 * Clase que representa un libro con atributos privados.
 * Aplica encapsulamiento estricto y validación en el setter.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usamos el setter para validar
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // Setter con validación
    public void setAñoPublicacion(int año) {
        if (año >= 1450 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("⚠️ Año inválido. Debe estar entre 1450 y 2025.");
        }
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " de " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
}

