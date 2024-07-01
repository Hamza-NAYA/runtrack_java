package Jour06.Job03;

public class Main {
    public static void main(String[] args) {
        int[] T = new int[10]; // Crée un tableau de 10 entiers

        // Remplit le tableau avec les entiers de 0 à 9
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        // Affiche les valeurs spécifiées
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
        // System.out.println("T[10] = " + T[10]);

        // Tentative d'accès à T[10]
        try {
            System.out.println("T[10] = " + T[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("T[10] n'existe pas");
        }
    }
}

