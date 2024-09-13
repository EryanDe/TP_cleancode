package ex2;

/**
 * Représente un compte bancaire de type compte courant (CC) ou livret A (LA).
 */
public class CompteBancaire {

    /** Solde du compte */
    private double solde;

    /** Découvert autorisé (seulement pour les comptes courants) */
    private double decouvert;

    /** Taux de rémunération (applicable uniquement pour les Livrets A) */
    private double tauxRemuneration;

    /** Le type du compte : CC pour compte courant, LA pour Livret A */
    private String type;

    /**
     * Constructeur pour un compte courant (type CC).
     * 
     * @param type     Le type du compte (CC).
     * @param solde    Solde initial du compte.
     * @param decouvert Découvert autorisé.
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    /**
     * Constructeur pour un Livret A (type LA).
     * 
     * @param type             Le type du compte (LA).
     * @param solde            Solde initial.
     * @param decouvert        Découvert autorisé (doit être 0 pour un Livret A).
     * @param tauxRemuneration Taux de rémunération annuel.
     */
    public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Crédite un montant au solde du compte.
     * 
     * @param montant Le montant à ajouter.
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Débite un montant du compte en fonction de son type (CC ou LA).
     * 
     * @param montant Le montant à débiter.
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant >= -decouvert) {
                this.solde -= montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde - montant >= 0) {
                this.solde -= montant;
            }
        }
    }

    /**
     * Applique la rémunération annuelle pour un Livret A.
     */
    public void appliquerRemuAnnuelle() {
        if (type.equals("LA")) {
            this.solde += solde * tauxRemuneration / 100;
        }
    }

    // Getters et setters
    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
