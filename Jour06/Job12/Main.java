package Jour06.Job12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez un entier positif : ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Veuillez entrer un entier positif");
        } else {
            long factorielle = calculerFactorielle(n);
            System.out.println("La factorielle de " + n + " est : " + factorielle);
        }
        
        scanner.close();
    }
    
    public static long calculerFactorielle(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long resultat = 1;
        for (int i = 2; i <= n; i++) {
            resultat *= i;
        }
        
        return resultat;
    }
}