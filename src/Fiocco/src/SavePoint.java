
import java.awt.Polygon;
import java.util.ArrayList;

/**
 * Salva i punti dei poligoni di taglio.
 * @author Daniel Matt
 */
public class SavePoint {

    /**
     * Prepara la stringa da scrivere su un file
     * @param taglio poligoni di taglio.
     * @return stringa da stampare sul file.
     */
    public String salvaPoints(ArrayList<Polygon> taglio) {
        System.out.println("Salvataggio...");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < taglio.size(); i++) {
            int[] xPuntiT = taglio.get(i).xpoints;
            int[] yPuntiT = taglio.get(i).ypoints;
            for (int j = 0; j < taglio.get(i).npoints; j++){
                sb.append(xPuntiT[j]);
                sb.append(",");
                sb.append(yPuntiT[j]);
                sb.append('\n');
            }
            sb.append(".\n");
            
        }
        System.out.println("Fatto !");
        return sb.toString();
    }
}
