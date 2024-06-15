package Jour04.Job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Job03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la longueur de la chaîne de caractères : ");
        int length = scanner.nextInt();

        scanner.close();

        long startTime = System.currentTimeMillis();

        // Déterminer les longueurs des deux moitiés
        int halfLength = length / 2;
        int secondHalfLength = length - halfLength;

        // Créer les threads pour générer et écrire dans le fichier
        Thread thread1 = new Thread(() -> {
            String firstHalf = generateRandomString(halfLength);
            writeToFile("output.txt", firstHalf);
        });
        Thread thread2 = new Thread(() -> {
            String secondHalf = generateRandomString(secondHalfLength);
            writeToFile("output.txt", secondHalf);
        });

        // Démarrer les threads
        thread1.start();
        thread2.start();

        // Attendre la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Le temps d'exécution global est de " + duration + " millisecondes.");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    private static synchronized void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

