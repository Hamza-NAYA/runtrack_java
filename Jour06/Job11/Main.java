package Jour06.Job11;

public class Main {
    public static void main(String[] args) {
        // Calcul de la factorielle de 8
        int n = 8;
        int factorielle = 1;

        // Calcul de la factorielle en utilisant une boucle for
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + n + " est : " + factorielle);
    }
}