public class Tableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] tableau = new int[5];

        // Assignation des valeurs aux indices spécifiés
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        // Affichage du tableau complet
        System.out.print("Contenu du tableau : ");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(); // Saut de ligne

        // Affichage de la valeur à l'index 1
        System.out.println("Valeur à l'index 1 : " + tableau[1]);
    }
}
