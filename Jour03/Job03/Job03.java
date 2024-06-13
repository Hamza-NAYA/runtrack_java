package Jour03.Job03;

public class Job03 {
    public static void main(String[] args) {
        // Création du tableau de noms
        String[] tableauNoms = {"Josette", "John", "Myrtille", "Marc"};

        // Affichage de la valeur "John" dans le terminal
        System.out.println("Valeur \"John\" dans le tableau : " + tableauNoms[1]);

        // Changer la valeur "Myrtille" par "Mireille"
        tableauNoms[2] = "Mireille";

        // Affichage des valeurs du tableau dans le terminal
        System.out.print("Contenu du tableau après modification : ");
        afficherTableau(tableauNoms);
    }

    // Méthode pour afficher le contenu d'un tableau de String
    public static void afficherTableau(String[] tableau) {
        System.out.print("[");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("\"" + tableau[i] + "\"");
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
