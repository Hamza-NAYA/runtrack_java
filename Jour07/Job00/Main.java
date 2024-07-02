package Jour07.Job00;

public class Main {
    // Attributs publics
    public String nom;
    public String prenom;

    // Attributs protégés
    protected String dateDeNaissance;
    protected String lieuDeNaissance;

    // Attributs privés
    private String adresse;
    private String telephone;

    // Constructeur
    public Main(String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getters et Setters pour les attributs protégés
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    // Getters et Setters pour les attributs privés
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Méthode pour afficher les informations de la personne
    public void afficherInformations() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Date de Naissance : " + dateDeNaissance);
        System.out.println("Lieu de Naissance : " + lieuDeNaissance);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + telephone);
    }

    public static void main(String[] args) {
        Main personne = new Main("NAYA", "Hamza", "13/05/2001", "Marseille", "15 rue...", "+33 07...");
        personne.afficherInformations();
    }
}

// Public (public) :
// Les attributs publics sont accessibles depuis n'importe quelle autre classe. 
// Cela signifie qu'il n'y a pas de restrictions sur l'accès à ces attributs.
// Pas nécessaire d'avoir des getters et setters (bien que recommandé).

// Protégé (protected) :
// Les attributs protégés sont accessibles uniquement dans la même classe, 
// dans les sous-classes (même si elles se trouvent dans d'autres packages), 
// et dans les autres classes du même package.
// Getters et setters recommandés pour permettre l'accès et la modification.

// Privé (private) :
// Les attributs privés sont accessibles uniquement dans la classe où ils sont définis. 
// Cela signifie que même les sous-classes et les classes du même package ne peuvent pas y accéder directement.
// Getters et setters nécessaires pour permettre l'accès et la modification en respectant l'encapsulation.