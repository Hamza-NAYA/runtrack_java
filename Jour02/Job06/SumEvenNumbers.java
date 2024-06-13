package Jour02.Job06;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        // Utiliser une boucle for pour avoir la somme des chiffres pairs de 0 à 100 
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.print("La somme des nombres pairs entre 1 et 100 est : " + sum);
    }
}
