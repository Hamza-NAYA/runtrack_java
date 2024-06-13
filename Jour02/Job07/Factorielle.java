package Jour02.Job07;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int nombre = scanner.nextInt();

        long factorielle = 1;
        for (int i = 2; i <= nombre; i++) {
            factorielle *= i;
        }

        System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);

        scanner.close();
    }

}
