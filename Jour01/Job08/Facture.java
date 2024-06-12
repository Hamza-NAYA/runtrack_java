package Jour01.Job08;

public class Facture {
    public static void main(String[] args) {
        // Déclaration des variables
        double prix = 49.99;
        int quantite = 3;
        double tarifHT;
        double tva = 0.20;
 
        // Calcul du montant hors taxe
        tarifHT = prix * quantite;

        // Calcul du montant de la taxe
        double montantTVA = tarifHT * tva;
 
        // Calcul du montant toutes taxes comprises
        double tarifTTC = tarifHT * (1 + tva);
 
        // Affichage des différentes valeurs de la facture
        System.out.println("Prix unitaire du produit : " + prix);
        System.out.println("Quantité : " + quantite);
        System.out.println("TVA : " + (tva * 100) + "%");
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + montantTVA); 
        System.out.println("Le montant total à payer est : " + tarifTTC);

    }
}
