package Jour01.Job11;

import java.util.Scanner;

public class GiveTime {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer l'heure en minutes
        System.out.print("Entrez une durée en minutes : ");
        int minutes = scanner.nextInt(); // Lire le nombre de minutes entrées par l'utilisateur

        // Calcul des heures et des minutes
        int heures = minutes / 60; // Division entière pour obtenir les heures
        int resteMinutes = minutes % 60; // Calcul du reste pour obtenir les minutes restantes

        // Affichage de l'heure
        System.out.println(minutes + " minutes est équivalent à " + heures + " heures et " + resteMinutes + " minutes.");

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
