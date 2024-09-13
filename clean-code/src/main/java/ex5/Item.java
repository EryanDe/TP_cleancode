package ex5;

/**
 * Représente un article avec un nom et un poids.
 */
public class Item {

    private String nom;
    private int poids;

    /**
     * Getter pour le nom.
     * 
     * @return le nom.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom.
     * 
     * @param nom Le nom à définir.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour le poids.
     * 
     * @return le poids.
     */
    public int getPoids() {
        return poids;
    }

    /**
     * Setter pour le poids.
     * 
     * @param poids Le poids à définir.
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * Détermine si l'article est accepté par la caisse.
     * 
     * @return true si l'article est accepté, false sinon.
     */
    public boolean isAccepted() {
        // Exemple de logique : accepter uniquement les articles pesant 1000 unités ou moins
        return this.poids <= 1000;
    }
}
