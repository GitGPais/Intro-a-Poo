package tp3_poo_ejercicios;

public class EstudianteMain {

    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante e1 = new Estudiante("Gabriela", "Pais", "Programación II", 7.5);

        // Mostrar información inicial
        System.out.println("Información inicial:");
        e1.mostrarInfo();

        // Modificar calificación
        e1.subirCalificacion(1.0);
        e1.bajarCalificacion(0.5);

        // Mostrar información final
        System.out.println("\nInformación final:");
        e1.mostrarInfo();
    }
}

