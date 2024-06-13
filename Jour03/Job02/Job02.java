package Jour03.Job02;

public class Job02 {
    public static void main(String[] args) {
        // Création du tableau monTableau avec les valeurs 12, 6, 76, 89
        int[] monTableau = {12, 6, 76, 89};

        // Affichage des valeurs du tableau
        System.out.print("Tableau monTableau : ");
        afficherTableau(monTableau);

        // Assignation d'autres valeurs au tableau
        monTableau = new int[] {1, 2, 3, 4, 5};

        System.out.println("Après modification...");

        // Affichage du nouveau contenu du tableau
        System.out.print("Tableau monTableau : ");
        afficherTableau(monTableau);
    }

    // Méthode pour afficher le contenu d'un tableau d'entiers
    public static void afficherTableau(int[] tableau) {
        System.out.print("[");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
