package Jour06.Job01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée 
        Scanner scanner = new Scanner(System.in);
        
        // Afficher un message pour inviter l'utilisateur à saisir quelque chose
        System.out.print("Veuillez saisir quelque chose : ");
        
        // Lire la saisie de l'utilisateur
        String saisie = scanner.nextLine();
        
        // Afficher la saisie de l'utilisateur
        System.out.println("Vous avez saisi : " + saisie);
        
        // Fermer le scanner pour libérer les ressources
        scanner.close();
    }
}
