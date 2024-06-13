package Jour02.Job02;

public class AfficherNombreInverse {
    public static void main(String[] args) {
        // Utiliser une boucle for pour afficher les chiffres de 100 à 1
        for (int i = 100; i >= 1 ; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(", ");
            }
        }
    }
}
