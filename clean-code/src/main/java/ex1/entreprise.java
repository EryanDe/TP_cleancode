package ex1;

import java.util.Date;

/**
 * La classe Entreprise représente une société avec son Siret, nom, adresse, et 
 * date de création. Elle inclut également une méthode pour afficher le statut de l'entreprise.
 */
public class Entreprise {

    /** Limite maximale du capital pour l'entreprise */
    public static final int CAPITAL_MAX = 3000000;

    /** Numéro Siret de l'entreprise */
    public int siret;

    /** Nom de l'entreprise */
    public String nom;

    /** Adresse de l'entreprise */
    public String adresse;

    /** Date de création de l'entreprise */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        // Implémenter la logique pour afficher le statut de l'entreprise
    }
}
