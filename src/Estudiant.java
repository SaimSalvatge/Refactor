import java.util.Collection;
import java.util.Iterator;

/**
 * @author mponss
 * @version 1.0
 */
public class Estudiant {
    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";

    public Estudiant(){}

    /**
     * @param id
     * @param nom
     * @param cognoms
     * @param dni
     */
    public Estudiant(long id, String nom, String cognoms, String dni) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
    }
}
