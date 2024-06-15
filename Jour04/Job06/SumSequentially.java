package Jour04.Job06;

import java.util.Scanner;

public class SumSequentially {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez le nombre d'éléments dans le tableau : ");
        int n = scanner.nextInt();

        // Créer un tableau pour stocker les nombres saisis
        int[] numbers = new int[n];

        // Saisir les nombres dans le tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculer la somme des éléments dans le tableau
        long startTime = System.nanoTime(); // Temps de début d'exécution en nanosecondes
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        long endTime = System.nanoTime(); // Temps de fin d'exécution en nanosecondes

        long durationInNano = endTime - startTime;
        double durationInSeconds = durationInNano / 1_000_000_000.0; // Convertir en secondes

        // Afficher la somme et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + sum);
        System.out.println("Temps d'exécution : " + durationInNano + " nanosecondes soit " + durationInSeconds + " secondes");

        scanner.close();
    }
}
