package Jour02.Job11;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle : ");
        int hauteur = scanner.nextInt();

        // Boucle pour chaque ligne du triangle
        for (int i = 1; i <= hauteur; i++) {

            // Afficher les étoiles pour la ligne actuelle
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            // Passer à la ligne suivante après chaque ligne de triangle
            System.out.println();
        }

        scanner.close();
    }
}
