import java.util.Collection;
import java.util.Iterator;

public class Estudiant {
    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";

    public Estudiant(){}

    public Estudiant(long id, String nom, String cognoms, String dni) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
    }
}
