package Jour02.Job05;

import java.util.Scanner;

public class WorkAge {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();

        // Verifie l'âge de l'utilisateur et répond en fonction de son âge
        if(age < 16) {
            System.out.println("Tu ne peux pas travailler, tu est encore trop jeune !");
        } else if(age > 55 && age < 67) {
            System.out.println("Tu auras du mal à trouver un emploi...");
        } else if (age >= 67) {
            System.out.println("Tu est à la retraite");
        } else {
            System.out.println("Vous etes en âge pour travailler");
        }

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
