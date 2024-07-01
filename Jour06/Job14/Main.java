package Jour06.Job14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre 
        System.out.print("Entrez un nombre entier : ");
        int n = scanner.nextInt();

        // Vérifier si le nombre est valide
        if (n > 9) {
            System.out.println("Le nombre doit être inférieur ou égal à 9");
        } else {
            // Afficher la table de multiplication de n
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }

        scanner.close();
    }
}