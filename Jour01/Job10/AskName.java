package Jour01.Job10;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer son prénom
        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine(); // Lire le prénom entré par l'utilisateur

        // Demande à l'utilisateur d'entrer son nom
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine(); // Lire le nom entré par l'utilisateur

        // Fermeture de l'objet Scanner
        scanner.close();

        // Concaténation du prénom et du nom de l'utilisateur
        String nomComplet = prenom + " " + nom;

        // Affichage du prénom et du nom de l'utilisateur
        System.out.println("Bonjour, " + nomComplet + " !");
    }
}
