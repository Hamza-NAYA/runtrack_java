package Jour02.Job09;

public class FirstLast {
    public static void main(String[] args) {
        int nombre = 1234;

        // Récupérer le dernier chiffre
        int dernierChiffre = nombre % 10;

        // Récupérer le premier chiffre à l'aide d'une boucle
        int premierChiffre = nombre;
        while (premierChiffre >= 10) {
            premierChiffre = premierChiffre / 10;
        }

        // Afficher les résultats
        System.out.println("Le premier chiffre de " + nombre + " est : " + premierChiffre);
        System.out.println("Le dernier chiffre de " + nombre + " est : " + dernierChiffre);
    }
}
