import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 * Classe rappresenta un modello astratto di poligono di taglio.
 * @author Daniel Matt
 */
public class PoligonoTaglio {

    /**
     * Poligoni di taglio.
     */
    public ArrayList<Polygon> poligoni;
    
    /**
     * Punti dei poligoni di taglio.
     */
    public ArrayList<Point> puntiPoligoni;
    /**
     * Copia dei punti dei poligoni di taglio.
     */
    public ArrayList<Point> copiaPuntiPoligoni;
    
    /**
     * Ultimo poligono nelle lista di poligoni di taglio.
     */
    public Polygon lastPoligono;

    /**
     * Metodo Cosrtuttuore.
     */
    public PoligonoTaglio() {
        puntiPoligoni = new ArrayList<>();
        poligoni = new ArrayList<>();
        copiaPuntiPoligoni = new ArrayList<>();
    }
    
    /**
     * Setta i nuovi poligoni di taglio.
     * @param taglio lista di poligoni di taglio da inserire.
     */
    public void setPoligoni(ArrayList<Polygon> taglio){
        ArrayList<Polygon> finale = new ArrayList<>();
        finale = taglio;
        for(int i = 0;i < finale.size();i++){
            finale.get(i).translate(-200, -336);
        }
        this.poligoni = finale;
    }
    
    
    /**
     * Prende tutte le coordinate X del poligono di taglio e li mette in un array.
     * @param taglio poligono di taglio da cui prendere le coordinate X.
     * @return array con le coordinate X dei punti del poligono di taglio.
     */
    private int[] getXPoints(Polygon taglio) {
        return taglio.xpoints;
    }

    /**
     * Prende tutte le coordinate Y del poligono di taglio e li mette in un array.
     * @param taglio poligono di taglio da cui prendere le coordinate X.
     * @return array con le coordinate Y dei punti del poligono di taglio.
     */
    private int[] getYPoints(Polygon taglio) {
        return taglio.ypoints;
    }

    /**
     * Ridimensiona tutti i puni dei poligoni in base alla differenza del panel.
     * @param widthDiff differenza della dimensione di larghezza del panel.
     * @param heightDiff  differenza della dimensione di altezza del panel.
     */
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

    /**
     * Rimuove l'ultimo punto del l'ultimo poligono di taglio.
     */
    public void removeLastPoint() {
        if (puntiPoligoni.isEmpty() && poligoni.isEmpty()) {
            System.err.println("Non ci sono punti da rimuovere");
        } else if (puntiPoligoni.isEmpty()) {
            puntiPoligoni.clear();
            copiaPuntiPoligoni.clear();

            lastPoligono = poligoni.get(poligoni.size() - 1);

            poligoni.remove(poligoni.size()-1);
            int[] xPunti = getXPoints(lastPoligono);
            int[] yPunti = getYPoints(lastPoligono);

            for (int i = 0; i < lastPoligono.npoints; i++) {
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
