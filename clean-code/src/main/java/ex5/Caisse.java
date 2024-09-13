package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une Caisse avec une liste d'articles.
 */
public class Caisse {

    private String nom;
    private List<Item> items;

    /**
     * Constructeur
     * 
     * @param nom Le nom de la caisse.
     */
    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Ajoute un article à la caisse si celui-ci est accepté.
     * 
     * @param item L'article à ajouter.
     */
    public void addItem(Item item) {
        if (item.isAccepted()) {
            items.add(item);
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
