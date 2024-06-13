package Jour02.Job08;

import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre : ");
        int numero = scanner.nextInt();

        // Convertir le nombre en une chaîne de caractères pour compter les chiffres
        String numeroString = Integer.toString(numero);

        // Calculer le nombre de chiffres
        int nombreDeChiffres = numeroString.length();

        // Afficher le résultat
        System.out.println("Le nombre " + numero + " contient " + nombreDeChiffres + " chiffre(s)");

        // Fermer le scanner
        scanner.close();
    }
}
