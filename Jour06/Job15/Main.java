package Jour06.Job15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();
        
        // Inverser le nombre
        int nombreInverse = inverserNombre(nombre);
        
        // Afficher le nombre inversé
        System.out.println("Le nombre inversé est : " + nombreInverse);
        
        // Fermer le scanner
        scanner.close();
    }
    
    // Méthode pour inverser un nombre
    public static int inverserNombre(int nombre) {
        int nombreInverse = 0;
        while (nombre != 0) {
            int reste = nombre % 10;
            nombreInverse = nombreInverse * 10 + reste;
            nombre = nombre / 10;
        }
        return nombreInverse;
    }
}