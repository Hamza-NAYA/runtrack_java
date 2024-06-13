package Jour03.Job04;

import java.util.HashMap;
import java.util.Map;

public class Job04 {
    public static void main(String[] args) {
        // Création du tableau avec les valeurs données
        int[] tableau = {3, 7, 3, 9, 8};

        // Appel de la méthode pour compter les occurrences
        Map<Integer, Integer> occurrences = compterOccurrences(tableau);

        // Affichage du résultat dans le terminal
        System.out.println("Occurrences des nombres dans le tableau :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Méthode pour compter les occurrences de chaque nombre dans un tableau
    public static Map<Integer, Integer> compterOccurrences(int[] tableau) {
        // Création d'une HashMap pour stocker les occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Parcours du tableau et comptage des occurrences
        for (int nombre : tableau) {
            if (occurrences.containsKey(nombre)) {
                // Si le nombre existe déjà dans la map, on incrémente son compteur
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                // Sinon, on initialise le compteur à 1 pour ce nombre
                occurrences.put(nombre, 1);
            }
        }

        return occurrences;
    }
}
