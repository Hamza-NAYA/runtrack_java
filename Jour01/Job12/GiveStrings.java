package Jour01.Job12;

import java.util.Scanner;

public class GiveStrings {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux chaînes de caractères
        System.out.print("Entrez la première chaîne : ");
        String str1 = scanner.nextLine(); // Lire la première chaîne entrée par l'utilisateur

        System.out.print("Entrez la deuxième chaîne : ");
        String str2 = scanner.nextLine(); // Lire la deuxième chaîne entrée par l'utilisateur

        // Échange des valeurs des chaînes sans variable temporaire
        str1 = str1 + str2; // Concaténation des deux chaînes
        str2 = str1.substring(0, str1.length() - str2.length()); // Extraction de la première partie de la chaîne1
        str1 = str1.substring(str2.length()); // Extraction de la deuxième partie de la chaîne1

        // Affichage des chaînes après échange
        System.out.println("Après l'échange ->");
        System.out.println("Première chaîne : " + str1);
        System.out.println("Deuxième chaîne : " + str2);

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
