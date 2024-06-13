package Jour03.Job07;

public class Job07 {
    public static void main(String[] args) {
        // Déclaration et initialisation des matrices
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Affichage des valeurs de matrice1
        System.out.println("Valeurs de matrice1 : ");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }

        // Addition des valeurs des matrices
        int[][] matriceResultat = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matriceResultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        // Affichage des valeurs de la matrice résultat
        System.out.println("Valeurs de l'addition de matrice1 et matrice2 : ");
        for (int i = 0; i < matriceResultat.length; i++) {
            for (int j = 0; j < matriceResultat[i].length; j++) {
                System.out.print(matriceResultat[i][j] + " ");
            }
            System.out.println(); // Nouvelle ligne après chaque ligne de la matrice
        }
    }
}
