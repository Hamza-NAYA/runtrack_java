package Jour06.Job08;

public class Main {
    public static void main(String[] args) {
        // Initialisation de la variable pour stocker la somme
        int somme = 0;

        // Boucle pour calculer la somme des entiers de 1 à 100
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }

        // Affichage du résultat
        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}