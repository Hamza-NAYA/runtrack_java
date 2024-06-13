package Jour02.Job04;

public class EvenNumbers {
    public static void main(String[] args) {
        // Utiliser une boucle for pour afficher les chiffres pairs de 0 à 100
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                if (i < 100) {
                    System.out.print(", ");
                }
            }
        }
    }
}
