package Jour04.Job05;

import java.util.Scanner;

public class ParallelCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir le nombre maximum à compter
        System.out.print("Veuillez entrer le nombre maximum à compter : ");
        int max = scanner.nextInt();


        // Ferme le scanner
        scanner.close();

        // Divise le nombre maximum en deux plages
        int mid = max / 2;

        // Variables pour stocker les résultats des comptages
        final long[] count1 = {0};
        final long[] count2 = {0};

        // Crée le premier thread pour compter de 1 à mid
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= mid; i++) {
                synchronized (System.out) {
                    System.out.println(i);
                }
                count1[0]++;
            }
        });

        // Crée le deuxième thread pour compter de mid + 1 à max
        Thread thread2 = new Thread(() -> {
            for (int i = mid + 1; i <= max; i++) {
                synchronized (System.out) {
                    System.out.println(i);
                }
                count2[0]++;
            }
        });

        // Enregistre le temps de début
        long startTime = System.currentTimeMillis();

        // Démarre les threads
        thread1.start();
        thread2.start();

        try {
            // Attend la fin des threads
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Enregistre le temps de fin
        long endTime = System.currentTimeMillis();

        // Calcule le temps d'exécution
        long executionTime = endTime - startTime;

        // Combine les résultats des deux threads
        long totalCount = count1[0] + count2[0];

        // Affiche le compte total et le temps d'exécution
        System.out.println("Comptage terminé jusqu'à " + max);
        System.out.println("Compte total : " + totalCount);
        System.out.println("Temps d'exécution : " + executionTime + " millisecondes");

    }
}
