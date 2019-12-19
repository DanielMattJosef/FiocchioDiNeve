
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Legge un file csv e ne trae informazioni per costruire i poligoni di taglio.
 * @author Daniel Matt
 */
public class LoadPoints {

    /**
     * Lista di poligoni di taglio.
     */
    public ArrayList<Polygon> poligoni;
    
    /**
     * Lista delle cordinate X dei poligoni di taglio.
     */
    private ArrayList<Integer> puntiX;
    
    /**
     * Lista delle cordinate Y dei poligoni di taglio.
     */
    private ArrayList<Integer> puntiY;

    /**
     * Metodo costrutture.
     */
    public LoadPoints() {
        poligoni = new ArrayList<>();
        puntiX = new ArrayList<>();
        puntiY = new ArrayList<>();
    }

    /**
     * Si occupa di leggere dal file csv i poligoni di taglio.
     * @param file percorso del file csv.
     * @return lista di poligoni di taglio.
     */
    public ArrayList<Polygon> getPoligoni(String file) {
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            
           
            while ((line = br.readLine()) != null) {
                
                String[] points;
                if (line.equals(".")) {
                    Polygon poligono = new Polygon();
                    for(int i = 0;i < puntiX.size();i++){
                        poligono.addPoint(puntiX.get(i), puntiY.get(i));
                    }
                    puntiX.clear();
                    puntiY.clear();
                    poligoni.add(poligono);
                } else {
                    points = line.split(cvsSplitBy);
                    puntiX.add(Integer.parseInt(points[0]));
                    puntiY.add(Integer.parseInt(points[1]));
                }

            }

        } catch (IOException e) {
            System.out.println("Errore!! Il file non é nel formato corretto!!");
        } catch (NumberFormatException f){
             JOptionPane error = new JOptionPane();
            error.showOptionDialog(null,"Impossibile aprire il file!!","Errore nell'apertura del file",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null, null, null);
        }
        
        
        return poligoni;
    }
}
