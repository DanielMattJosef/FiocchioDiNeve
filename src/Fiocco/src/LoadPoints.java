
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Legge un file csv e 
 * @author Daniel Matt
 */
public class LoadPoints {

    public ArrayList<Polygon> poligoni;
    private ArrayList<Integer> puntiX;
    private ArrayList<Integer> puntiY;

    public LoadPoints() {
        poligoni = new ArrayList<>();
        puntiX = new ArrayList<>();
        puntiY = new ArrayList<>();
    }

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
        }
        return poligoni;
    }
}
