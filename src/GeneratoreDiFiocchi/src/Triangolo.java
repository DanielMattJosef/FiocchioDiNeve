import java.awt.Point;
import java.awt.Polygon;


/**
 * Rappresenta un modello astratto di Triangolo.
 * @author Daniel Matt
 */
public class Triangolo{
    /**
     * Questo array contiene i punti x del triangolo.
     */
    public static final int[] PUNTIX = new int[3];

    /**
     * Questo array contiene i punti y del triangolo.
     */
    public static final int[] PUNTIY = new int[3];
    
    /**
     * Rappresenta il poligono.
     */
    public Polygon triangolo = new Polygon();

    /**
     * Metodo costruttore.
     */
    public Triangolo(){
        
    }

    /**
     * Si occupa di calcolare le dimensioni del triangolo, quindi le cordinate
     * dei punti del poligono.
     * @param width del panel.
     * @param height del panel.
     */
    public void getTriangoloPoints(int width, int height) {
        int marginTB = height / 4;
        int ac = height / 2;
        int ab = (int) (ac / Math.sqrt(3));
        int marginLR = (int) ((width - ab) / 2);

        PUNTIX[0] = width - marginLR - ab;
        //System.out.println("Punto x: " + PUNTIX[0]);
        PUNTIX[1] = width - marginLR;
        PUNTIX[2] = PUNTIX[0];

        PUNTIY[0] = height - marginTB - ac;
        PUNTIY[1] = PUNTIY[0];
        PUNTIY[2] = height - marginTB;
        triangolo = new Polygon(PUNTIX,PUNTIY, 3);
    }
    // Variables declaration - do not modify                     
    // End of variables declaration                   

    /**
     * Ritorna il tringolo.
     * @return il poligono del triangolo.
     */
    public Polygon getPolygon() {
        return this.triangolo;
    }
    
    /**
     * Ritorna le coordinate dell'apice del triangolo.
     * @return point apice del triangolo.
     */
    public Point getApiceTriangolo(){
        Point apice = new Point(PUNTIX[2], PUNTIY[2]);
        return apice;
    }
}
