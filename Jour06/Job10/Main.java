package Jour06.Job10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir son âge
        System.out.print("Veuillez saisir votre âge : ");
        int age = scanner.nextInt();

        // Vérifier si l'utilisateur est mineur ou majeur
        if (age < 18) {
            System.out.println("Vous êtes mineur");
        } else {
            System.out.println("Vous êtes majeur");
        }

        // Fermer le scanner pour libérer les ressources
        scanner.close();
    }
}