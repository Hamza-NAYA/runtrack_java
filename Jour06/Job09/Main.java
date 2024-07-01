package Jour06.Job09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier n
        System.out.print("Entrez un nombre entier n : ");
        int n = scanner.nextInt();

        // Calculer la somme des n premiers cubes
        int sommeCubes = 0;
        for (int i = 1; i <= n; i++) {
            sommeCubes += i * i * i;
        }

        // Afficher la somme des n premiers cubes
        System.out.println("La somme des " + n + " premiers cubes est : " + sommeCubes);

        scanner.close();
    }
}