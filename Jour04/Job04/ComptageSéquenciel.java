package Jour04.Job04;

import java.util.Scanner;

public class ComptageSéquenciel {

    public static void main(String[] args) {
        // Crée un scanner pour obtenir l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Veuillez entrer le nombre maximum à compter : ");
        int max = scanner.nextInt();

        // Ferme le scanner
        scanner.close();

        // Enregistre le temps de début
        long startTime = System.currentTimeMillis();

        // Compte de 1 jusqu'au nombre maximum
        for (int i = 1; i <= max; i++) {
            System.out.println(i);
        }

        // Enregistre le temps de fin
        long endTime = System.currentTimeMillis();

        // Calcule le temps d'exécution
        long executionTime = endTime - startTime;

        // Affiche le compte total et le temps d'exécution
        System.out.println("Comptage terminé jusqu'à " + max);
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes");

    }
}
