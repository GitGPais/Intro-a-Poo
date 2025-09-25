package tp3_poo_ejercicios;

public class NaveMain {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Sideral", 30);

        nave1.mostrarEstado();
        nave1.despegar(); // Falla por falta de combustible
        nave1.recargar(40); // Ahora tiene 70
        nave1.despegar(); // Despega
        nave1.mostrarEstado();
        nave1.aterrizar(); // Aterriza
        nave1.mostrarEstado();
    }
}
