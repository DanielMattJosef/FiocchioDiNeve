import java.awt.Polygon;
import java.awt.geom.Area;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class TriangoloTagliato {

    private Polygon triangolo;
    private ArrayList<Polygon> taglio;

    public Area areaTriangolo;
    public ArrayList<Area> areaPoligoniTaglio;

    public TriangoloTagliato(Polygon triangolo, ArrayList<Polygon> taglio) {
        areaPoligoniTaglio = new ArrayList();
        this.triangolo = triangolo;
        this.taglio = taglio;
        areaTriangolo = new Area(triangolo);
    }

    public void getAreaTaglio() {
        for (int i = 0; i < taglio.size(); i++) {
            Area poligono = new Area(taglio.get(i));
            areaPoligoniTaglio.add(poligono);
        }
    }

    public void getAreaFinale() {
        for (int i = 0; i < areaPoligoniTaglio.size(); i++) {
            areaTriangolo.subtract(areaPoligoniTaglio.get(i));
        }
    }
    
    public Area getAreaTagliato(){
        getAreaTaglio();
        getAreaFinale();
        return areaTriangolo;
    }

    /*public Polygon areaToPolygon() {
        PathIterator iterator = areaTriangolo.getPathIterator(null);
        float[] floats = new float[6];
        Polygon poligonoArea = new Polygon();
        while (!iterator.isDone()) {
            int type = iterator.currentSegment(floats);
            int x = (int) floats[0];
            int y = (int) floats[1];
            if (type != PathIterator.SEG_CLOSE) {
                poligonoArea.addPoint(x, y);
                System.out.println("adding x = " + x + ", y = " + y);
            }
            iterator.next();
        }
        
        return poligonoArea;
    }*/
}
