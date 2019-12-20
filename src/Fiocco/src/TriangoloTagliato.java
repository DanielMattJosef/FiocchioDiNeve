import java.awt.Polygon;
import java.awt.geom.Area;
import java.util.ArrayList;

/**
 * Si occupa di tagliare il triangolo di base.
 * @author Daniel Matt
 */
public class TriangoloTagliato {

    /**
     * Rappresenta il triangolo da tagliare.
     */
    private Polygon triangolo;
    
    /**
     * Rappresenta la lista dei poligoni di taglio.
     */
    private ArrayList<Polygon> taglio;

    /**
     * É l'area del triangolo di base.
     */
    public Area areaTriangolo;
    
    /**
     * Lista contentente tutte le aree dei poligoni di taglio.
     */
    public ArrayList<Area> areaPoligoniTaglio;

    /**
     * Metodo Costruttore.
     * @param triangolo triangolo da tagliare.
     * @param taglio poligoni da sottrarre dall'area del triangolo.
     */
    public TriangoloTagliato(Polygon triangolo, ArrayList<Polygon> taglio) {
        areaPoligoniTaglio = new ArrayList();
        this.triangolo = triangolo;
        this.taglio = taglio;
        areaTriangolo = new Area(triangolo);
    }

    /**
     * Calcola l'area dei poligoni di taglio.
     */
    public void getAreaTaglio() {
        for (int i = 0; i < taglio.size(); i++) {
            Area poligono = new Area(taglio.get(i));
            areaPoligoniTaglio.add(poligono);
        }
    }

    /**
     * Calcola l'area del triangolo.
     */
    public void getAreaFinale() {
        for (int i = 0; i < areaPoligoniTaglio.size(); i++) {
            areaTriangolo.subtract(areaPoligoniTaglio.get(i));
        }
    }
    
    /**
     * Calcola l'area del triangolo tagliato.
     * @return area del triangolo del triangolo tagliato.
     */
    public Area getAreaTagliato(){
        getAreaTaglio();
        getAreaFinale();
        return areaTriangolo;
    }
}
