import java.util.ArrayList;

/**
 * @author mponss
 * @version 1.0
 */
public class Assignatura {
    public long id = 0;
    private String nom = "";
    private int hores = 0;
    public int credits = 0;
    private boolean disponible = false;

    //Getters

    /**
     * @return retorna la id de l'assignatura
     */
    public long getId() {
        return id;
    }

    /**
     * @return retorna el nom de l'assignatura
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return retorna les hores de l'assignatura
     */
    public int getHores() {
        return hores;
    }

    /**
     * @return retorna els credits de l'assignatura
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @return retorna la disponibilitat de l'assignatura
     */
    public boolean isDisponible() {
        return disponible;
    }

    //Setters

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param hores
     */
    public void setHores(int hores) {
        this.hores = hores;
    }

    /**
     *
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     *
     * @param disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @param id
     * @param nom
     * @param hores
     * @param credits
     * @param disponible
     */
    public Assignatura(long id, String nom, int hores, int credits, boolean disponible) {
        this.id = id;
        this.nom = nom;
        this.hores = hores;
        this.credits = credits;
        this.disponible = disponible;
    }
}
