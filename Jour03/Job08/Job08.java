package Jour03.Job08;

import java.util.Arrays;

public class Job08 {
    public static void main(String[] args) {
        // Déclaration de la matrice "tableau"
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };

        // Afficher la matrice avant le tri
        System.out.println("Matrice avant le tri : ");
        afficherMatrice(tableau);

        // Trier les lignes
        for (int[] ligne : tableau) {
            Arrays.sort(ligne);
        }

        // Transposer la matrice
        int[][] transposee = transposerMatrice(tableau);

        // Trier les lignes de la matrice transposée (équivalent au tri des colonnes de la matrice originale)
        for (int[] ligne : transposee) {
            Arrays.sort(ligne);
        }

        // Retransposer la matrice pour obtenir le résultat final
        tableau = transposerMatrice(transposee);

        // Afficher la matrice après le tri
        System.out.println("Matrice après le tri : ");
        afficherMatrice(tableau);
    }

    // Méthode pour transposer une matrice
    public static int[][] transposerMatrice(int[][] matrice) {
        int n = matrice.length;
        int m = matrice[0].length;
        int[][] transposee = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }
        return transposee;
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            for (int elem : ligne) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
