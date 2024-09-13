package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un Zoo, contenant une collection d'animaux.
 */
public class Zoo {

    private String nom;
    private List<Animal> animaux;

    /**
     * Constructeur pour Zoo.
     * 
     * @param nom Le nom du zoo.
     */
    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Ajoute un nouvel animal au zoo.
     * 
     * @param nomAnimal   Le nom de l'animal.
     * @param typeAnimal  Le type de l'animal.
     * @param comportement Le comportement de l'animal.
     */
    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        animaux.add(new Animal(nomAnimal, typeAnimal, comportement));
    }

    /**
     * Affiche la liste des animaux du zoo.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal);
        }
    }

    /**
     * Retourne le nombre d'animaux dans le zoo.
     * 
     * @return Le nombre d'animaux.
     */
    public int taille() {
        return animaux.size();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
