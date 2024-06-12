package Jour01.Job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        // Déclaration de deux variables entières
        int num1 = 5, num2 = 10;
        
        // Afficher les valeurs initiales de num1 et num2
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
        
        // Échange des valeurs de num1 et num2
        int temp = num1; // Utilisation d'une variable temporaire pour stocker la valeur de num1
        num1 = num2; // Assignation de la valeur de num2 à num1
        num2 = temp; // Assignation de la valeur de temp (ancienne valeur de num1) à num2
        
        // Afficher les nouvelles valeurs de num1 et num2 après échange
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
    }
}
