package Jour01.Job14;

public class Sum {
    // Méthode pour calculer la somme de deux nombres et afficher le résultat
    public static void SumPrint(int num1, int num2) {
        // Calcul de la somme
        int sum = num1 + num2;

        // Affichage du résultat dans le terminal
        System.out.println("La somme de " + num1 + " et " + num2 + " est : " + sum);
    }

    // Méthode principale (main) pour tester la classe
    public static void main(String[] args) {
        // Exemple d'utilisation de la méthode SumPrint avec des valeurs arbitraires
        SumPrint(1, 2);
    }
}

