package Jour06.Job02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée 
        Scanner scanner = new Scanner(System.in);
        
        // Afficher un message pour inviter l'utilisateur à saisis son prénom
        System.out.print("Veuillez entrer votre prénom : ");
        
        // Lire la saisie de l'utilisateur
        String prenom = scanner.nextLine();
        
        // Afficher "bonjour prenom" de l'utilisateur
        System.out.println("bonjour " + prenom);
        
        // Fermer le scanner pour libérer les ressources
        scanner.close();
    }
}