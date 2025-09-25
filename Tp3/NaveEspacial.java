package tp3_poo_ejercicios;


public class NaveEspacial {
    private String nombre;
    private int combustible; // en unidades
    private boolean enOrbita;

    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
        this.enOrbita = false;
    }

    // Método para mostrar estado actual
    public void mostrarEstado() {
        System.out.println(" Nave: " + nombre);
        System.out.println("Combustible: " + combustible + " unidades");
        System.out.println("Estado: " + (enOrbita ? "En órbita" : "En tierra"));
        System.out.println("---------------------------");
    }

    // Método para intentar despegar
    public void despegar() {
        if (enOrbita) {
            System.out.println("La nave ya está en órbita.");
        } else if (combustible >= 50) {
            combustible -= 50;
            enOrbita = true;
            System.out.println("Despegue exitoso.");
        } else {
            System.out.println("❌ Combustible insuficiente para despegar.");
        }
    }

    // Método para recargar combustible
    public void recargar(int unidades) {
        if (unidades > 0) {
            combustible += unidades;
            System.out.println("Combustible recargado: +" + unidades + " unidades.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Método para aterrizar
    public void aterrizar() {
        if (!enOrbita) {
            System.out.println("La nave ya está en tierra.");
        } else {
            enOrbita = false;
            System.out.println("Aterrizaje exitoso.");
        }
    }
}
