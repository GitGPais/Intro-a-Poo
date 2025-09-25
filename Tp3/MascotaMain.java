
package tp3_poo_ejercicios;


public class MascotaMain { 
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Zoe", "Perro", 2);
        System.out.println("Información inicial de la mascota:");
        m1.mostrarInfo();
        m1.cumplirAnios();
        System.out.println("\nDespués de cumplir años:");
        m1.mostrarInfo();
    }
}


