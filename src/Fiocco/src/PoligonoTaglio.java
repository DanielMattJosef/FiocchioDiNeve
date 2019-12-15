import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author Daniel Matt
 */
public class PoligonoTaglio {

    public ArrayList<Polygon> poligoni;
    public ArrayList<Point> puntiPoligoni;
    public ArrayList<Point> copiaPuntiPoligoni;
    public Polygon lastPoligoni;

    public PoligonoTaglio() {
        puntiPoligoni = new ArrayList<>();
        poligoni = new ArrayList<>();
        copiaPuntiPoligoni = new ArrayList<>();
    }
    
    public void setPoligoni(ArrayList<Polygon> taglio){
        this.poligoni = taglio;
    }

    private int[] getXPoints(Polygon taglio) {
        return taglio.xpoints;
    }

    private int[] getYPoints(Polygon taglio) {
        return taglio.ypoints;
    }

    public void changeCoords(int widthDiff, int heightDiff) {
        //System.out.println("Diff Width: " + widthDiff);
        for (int i = 0; i < poligoni.size(); i++) {
            int[] xPunti = getXPoints(poligoni.get(i));
            int[] yPunti = getYPoints(poligoni.get(i));

            for (int a = 0; a < xPunti.length; a++) {
                xPunti[a] = xPunti[a] + widthDiff / 2;
                yPunti[a] = yPunti[a] + heightDiff / 2;
            }
            Polygon poligono = new Polygon(xPunti, yPunti, xPunti.length);
        }

        for (int i = 0; i < puntiPoligoni.size(); i++) {
            int x = puntiPoligoni.get(i).x + widthDiff / 2;
            int y = puntiPoligoni.get(i).y + heightDiff / 2;
            Point coords = new Point(x, y);
            puntiPoligoni.set(i, coords);
        }
    }

    public void removeLastPoint() {
        if (puntiPoligoni.isEmpty() && poligoni.isEmpty()) {
            System.err.println("Non ci sono punti da rimuovere");
        } else if (puntiPoligoni.isEmpty()) {
            puntiPoligoni.clear();
            copiaPuntiPoligoni.clear();

            lastPoligoni = poligoni.get(poligoni.size() - 1);

            poligoni.remove(poligoni.size()-1);
            int[] xPunti = getXPoints(lastPoligoni);
            int[] yPunti = getYPoints(lastPoligoni);

            for (int i = 0; i < lastPoligoni.npoints; i++) {
                Point nuovoPunto = new Point(xPunti[i], yPunti[i]);
                puntiPoligoni.add(nuovoPunto);
                copiaPuntiPoligoni.add(nuovoPunto);
            }

        } else {
            puntiPoligoni.clear();
            for (int i = 0; i < copiaPuntiPoligoni.size() - 1; i++) {
                puntiPoligoni.add(copiaPuntiPoligoni.get(i));
            }

            copiaPuntiPoligoni.clear();
            for (int i = 0; i < puntiPoligoni.size(); i++) {
                copiaPuntiPoligoni.add(puntiPoligoni.get(i));
            }
        }
    }
}
