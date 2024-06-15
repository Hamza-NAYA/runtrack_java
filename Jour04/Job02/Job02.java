package Jour04.Job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Job02 {
    public static void main(String[] args) {
        // Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la longueur de la chaîne
        System.out.print("Entrez la longueur de la chaîne de caractères : ");
        int length = scanner.nextInt();

        scanner.close();

        // Mesurer le temps de début
        long startTime = System.currentTimeMillis();

        // Générer une chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Écrire la chaîne dans un fichier
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Mesurer le temps de fin
        long endTime = System.currentTimeMillis();

        // Calculer et afficher le temps d'exécution
        long duration = endTime - startTime;
        System.out.println("Le programme a pris " + duration + " millisecondes pour s'exécuter");

    }

    // Méthode pour générer une chaîne de caractères aléatoire
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
