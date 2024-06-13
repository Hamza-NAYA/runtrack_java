package Jour02.Job12;

public class Dice {
    public static void main(String[] args) {
        int[] faces = {1, 2, 3, 4, 5, 6};
        int count = 0;

        // Parcourir toutes les combinaisons possibles des trois dés
        for (int d1 : faces) {
            for (int d2 : faces) {
                for (int d3 : faces) {
                    // Afficher la combinaison actuelle
                    System.out.printf("(%d, %d, %d)\n", d1, d2, d3);
                    count++;
                }
            }
        }

        // Afficher le nombre total de combinaisons
        System.out.println("Nombre total de combinaisons : " + count);
    }
}
