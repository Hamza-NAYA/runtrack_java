package Jour06.Job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.print("Veuillez saisir un nombre : ");
        int nombre = scanner.nextInt();

        int nombreAuCarre = nombre * nombre;

        // Affiche le carré du nombre saisie par l'utilisateur
        System.out.println("Le carré de " + nombre + " est " + nombreAuCarre);
        
        // Ferme le scanner
        scanner.close();
    }
}