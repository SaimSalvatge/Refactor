import java.util.Collection;
import java.util.Iterator;

public class Matricula {

    public static final int INT = 15;
    public long id = 0;
    private String nom = "";
    private String cognoms = "";
    private String dni = "";
    private int curs = 0;
    private Collection assignatures;

    public Matricula(){}

    public Matricula(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.curs = curs;
        this.assignatures = assignatures;
    }

    public float costMatricula(){

        //Ja que les dues variables s'inicialitzen amb 0, he pensat a crear una variable final
        //per tal de que sempre sigui el mateix nombre i no es pugui modificar, però si referenciar
        final int i = 0;
        float cost = i;
        int credits = i;

        for (Iterator iter = assignatures.iterator(); iter.hasNext();) {
            Assignatura element = (Assignatura) iter.next();
            credits = credits + element.credits;
        }

        cost = credits * INT;
        return cost;
    }

}