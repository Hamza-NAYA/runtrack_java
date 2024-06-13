package Jour02.Job10;

public class AddNumbers {
    public static void main(String[] args) {
        int nombre = 1234;
        int sommeChiffres = 0;
        int chiffre;

        // Parcourir chaque chiffre du nombre
        while (nombre > 0) {
            chiffre = nombre % 10; // Récupérer le dernier chiffre
            sommeChiffres += chiffre; // Ajouter ce chiffre à la somme
            nombre = nombre / 10; // Supprimer le dernier chiffre
        }

        // Afficher la phrase avec la somme des chiffres
        System.out.println("La somme des chiffres est : " + sommeChiffres);
    }
}
