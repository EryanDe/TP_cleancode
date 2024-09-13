package ex3;

/**
 * Représente un animal dans le zoo.
 */
public class Animal {

    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur pour Animal.
     * 
     * @param nom          Le nom de l'animal.
     * @param type         Le type de l'animal.
     * @param comportement Le comportement de l'animal.
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}
