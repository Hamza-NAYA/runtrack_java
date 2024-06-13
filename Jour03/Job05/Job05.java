package Jour03.Job05;

import java.util.LinkedHashMap;
import java.util.Map;

public class Job05 {
    public static void main(String[] args) {
        // Exemple de tableau avec des valeurs
        int[] tableau = {3, 7, 3, 9, 8, 7, 9, 5};

        // Appel de la méthode pour afficher les valeurs uniques
        afficherValeursUniques(tableau);
    }

    // Méthode pour afficher les valeurs qui apparaissent exactement une fois dans le tableau
    public static void afficherValeursUniques(int[] tableau) {
        // Utilisation d'une LinkedHashMap pour compter les occurrences de chaque valeur
        Map<Integer, Integer> occurrences = new LinkedHashMap<>();

        // Parcours du tableau pour compter les occurrences
        for (int nombre : tableau) {
            occurrences.put(nombre, occurrences.getOrDefault(nombre, 0) + 1);
        }

        // Affichage des valeurs uniques (qui apparaissent exactement une fois)
        System.out.println("Valeurs uniques dans le tableau :");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}


