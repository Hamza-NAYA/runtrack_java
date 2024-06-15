package Jour04.Job07;

import java.util.Scanner;

public class SumParallel {
    private static int[] numbers; // Tableau des nombres saisis par l'utilisateur
    private static int sumTotal = 0; // Somme totale calculée par les threads

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez le nombre d'éléments dans le tableau : ");
        int n = scanner.nextInt();

        scanner.close();

        // Créer un tableau pour stocker les nombres saisis
        numbers = new int[n];

        // Saisir les nombres dans le tableau
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Créer et démarrer deux threads pour calculer la somme en parallèle
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < n / 2; i++) {
                    sum += numbers[i];
                }
                synchronized (SumParallel.class) {
                    sumTotal += sum;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = n / 2; i < n; i++) {
                    sum += numbers[i];
                }
                synchronized (SumParallel.class) {
                    sumTotal += sum;
                }
            }
        });

        thread1.start();
        thread2.start();

        // Attendre que les threads se terminent
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Somme totale calculée par les threads
        int totalSum = sumTotal;

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        double durationInSeconds = durationInNano / 1_000_000_000.0;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + totalSum);
        System.out.println("Temps d'exécution : " + durationInNano + " nanosecondes soit " + durationInSeconds + " secondes");
    }
}
