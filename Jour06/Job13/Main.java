package Jour06.Job13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier n
        System.out.print("Entrez un nombre entier n : ");
        int n = scanner.nextInt();

        System.out.println("Nombres pairs inférieurs ou égaux à " + n + ":");

        // Afficher tous les nombres pairs jusqu'à n
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}