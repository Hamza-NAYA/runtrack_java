package Jour01.Job13;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt(); // Lire le nombre entré par l'utilisateur

        // Affichage de tous les nombres de 1 jusqu'au nombre saisi par l'utilisateur
        System.out.println("Les nombres de 1 jusqu'à " + nombre + " sont ->");
        for (int i = 1; i <= nombre; i++) {
            System.out.print(i);
            if (i < nombre) {
                System.out.print(", "); // Ajouter une virgule sauf pour le dernier nombre
            }
        }

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
