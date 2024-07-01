package Jour06.Job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somme = 0; // Variable pour stocker la somme des entiers
        int nombreEntiers = 5; // Nombre d'entiers pour la moyenne

        System.out.println("Veuillez entrer " + nombreEntiers + " entiers :");

        for (int i = 0; i < nombreEntiers; i++) {
            System.out.print("Entier " + (i + 1) + ": ");
            int entier = scanner.nextInt();
            somme += entier; // Ajoute l'entier à la somme
        }

        // Calcul de la moyenne
        double moyenne = (double) somme / nombreEntiers;

        System.out.println("La moyenne des entiers est : " + moyenne);

        scanner.close();
    }
}