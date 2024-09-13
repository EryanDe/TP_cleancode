package ex2;

/**
 * Représente un Livret A, un type spécifique de compte bancaire avec un taux de 
 * rémunération annuel et aucun découvert autorisé.
 */
public class LivretA extends CompteBancaire {

    /**
     * Constructeur pour un Livret A.
     * 
     * @param type             Le type du compte (LA).
     * @param solde            Le solde initial.
     * @param tauxRemuneration Le taux de rémunération annuel.
     */
    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration); // Le Livret A n'a pas de découvert
    }

}
