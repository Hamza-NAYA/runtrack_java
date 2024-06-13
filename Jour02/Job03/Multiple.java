package Jour02.Job03;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        // Affichage de la table de multplication jusqu'à 10
        System.out.println("La table de multiplication de " + nombre + " est :");
        for (int i = 1; i <= 10; i++) {
            int result = i * nombre;
            System.out.println(i + " X " + nombre + " = " + result);
        }

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
