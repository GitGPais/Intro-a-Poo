package tp3_poo_ejercicios;

public class GallinaMain {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        // Simular acciones
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("Estado final de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
