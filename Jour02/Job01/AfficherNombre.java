package Jour02.Job01;

public class AfficherNombre {
    public static void main(String[] args) {
        // Utiliser une boucle for pour afficher les chiffres de 1 à 100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i < 100) {
                System.out.print(", ");
            }
        }
    }
}
