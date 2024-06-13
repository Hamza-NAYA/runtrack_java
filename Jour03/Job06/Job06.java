package Jour03.Job06;

import java.util.Random;

public class Job06 {
    public static void main(String[] args) {
        // Taille du tableau
        int taille = 10;
        // Création du tableau
        int[] tableau = new int[taille];
        // Création d'un objet Random
        Random random = new Random();

        // Remplissage du tableau avec des nombres aléatoires
        for (int i = 0; i < taille; i++) {
            tableau[i] = random.nextInt(100); // Génère des nombres entre 0 et 99
        }

        // Affichage du tableau
        System.out.println("Tableau de nombres aléatoires :");
        for (int i = 0; i < taille; i++) {
            System.out.print(tableau[i] + " ");
        }
    }
}