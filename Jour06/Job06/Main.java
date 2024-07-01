package Jour06.Job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir trois nombres
        System.out.print("Entrez le premier nombre: ");
        int nombreUn = scanner.nextInt();

        System.out.print("Entrez le deuxième nombre: ");
        int nombreDeux = scanner.nextInt();

        System.out.print("Entrez le troisième nombre: ");
        int nombreTrois = scanner.nextInt();

        // Calculer le maximum des trois nombres
        int max = (nombreUn > nombreDeux) ? (nombreUn > nombreTrois ? nombreUn : nombreTrois) : (nombreDeux > nombreTrois ? nombreDeux : nombreTrois);

        // Afficher le résultat
        System.out.println("Le plus grand nombre des trois est: " + max);

        // Fermer le scanner
        scanner.close();
    }
}