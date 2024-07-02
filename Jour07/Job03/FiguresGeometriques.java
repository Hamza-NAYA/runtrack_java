package Jour07.Job03;

public class FiguresGeometriques {

    public static void main(String[] args) {
        // Création d'un objet Rectangle
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        // Affichage des dimensions et de la surface
        System.out.println("Largeur: " + rectangle.getLargeur());
        System.out.println("Longueur: " + rectangle.getLongueur());
        System.out.println("Surface: " + rectangle.surface());
    }
}

class Rectangle {
    private double largeur;
    private double longueur;

    // Constructeur
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Getter pour la largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour la largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Getter pour la longueur
    public double getLongueur() {
        return longueur;
    }

    // Setter pour la longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return largeur * longueur;
    }
}
