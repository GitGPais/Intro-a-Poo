package tp3_poo_ejercicios;

public class LibroMain {
    public static void main(String[] args) {
        // Crear libro con año válido
        Libro libro1 = new Libro("Las Dos Marías", "María Inés Falconi", 1999);
        libro1.mostrarInfo();

        // Intentar modificar el año con un valor inválido
        libro1.setAñoPublicacion(1300); // No se aplicará
        libro1.mostrarInfo();

        // Modificar con un año válido
        libro1.setAñoPublicacion(1999);
        libro1.mostrarInfo();
    }
}

