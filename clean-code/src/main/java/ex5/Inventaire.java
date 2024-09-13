package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un inventaire contenant plusieurs caisses.
 */
public class Inventaire {

    private List<Caisse> caisses;

    /**
     * Constructeur pour initialiser l'inventaire avec différentes caisses.
     */
    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets"));
        caisses.add(new Caisse("Moyens objets"));
        caisses.add(new Caisse("Grands objets"));
    }

    /**
     * Ajoute un article dans la caisse appropriée.
     * 
     * @param item L'article à ajouter.
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.addItem(item)) {
                return; // Si l'item est ajouté à une caisse, on quitte la boucle
            }
        }
    }

    /**
     * Retourne le nombre total d'articles dans toutes les caisses.
     * 
     * @return Le nombre total d'articles.
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
