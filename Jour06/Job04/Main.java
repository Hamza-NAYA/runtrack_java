package Jour06.Job04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son nom
        System.out.print("Veuillez saisir votre nom: ");
        String nom = scanner.nextLine();

        // Affiche le message de bienvenue
        System.out.println("Bienvenue, " + nom + "!");
        
        // Ferme le scanner
        scanner.close();
    }
}