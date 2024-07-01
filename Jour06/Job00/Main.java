public class Main {
    public static void main(String[] args) {
        // Déclaration des variables
        char lettre = 'Z';
        String texte = "Laplateforme";
        int nombreEntier = 8;
        long grandNombre = 100000L;
        float nombreFlottant = 3.14f;
        boolean estVrai = true;

        // Affichage des valeurs
        System.out.println("Char: " + lettre);
        System.out.println("String: " + texte);
        System.out.println("Int: " + nombreEntier);
        System.out.println("Long: " + grandNombre);
        System.out.println("Float: " + nombreFlottant);
        System.out.println("Boolean: " + estVrai);

        // Affectation de la valeur 3.817 à l'entier TOTO
        int TOTO = (int) 3.817;

        // Affichage de la valeur de TOTO
        System.out.println("TOTO: " + TOTO);
    }
}
// On a un message d"erreur indiquant une erreur de type du coup on convertit en (int)
// La valeur affichée pour TOTO sera 3, 
// car la partie décimale a été supprimée lors de la conversion