
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;

import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;

/**
 * É il panel nel quale viene disegnato il fiocco.
 * @author Daniel
 */
public class FioccoPanel extends JPanel {

    /**
     * Classe che rappresenta il triangolo.
     */
    private static Triangolo triangolo = new Triangolo();
    
    /**
     * Apice del triangolo.
     */
    private Point centro = triangolo.getApiceTriangolo();
    
    /**
     * Lista contenente le aree che formano il fiocco.
     */
    private ArrayList<Shape> fiocco;
    
    /**
     * Colore del fiocco.
     */
    private Color coloreFiocco = Color.WHITE;
    
    /**
     * Setta il colore del fiocco.
     * @param colore del fiocco.
     */
    public void setColor(Color colore) {
        this.coloreFiocco = colore;
        repaint();
    }

    /**
     * Metodo Costruttore.
     */
    public FioccoPanel() {
        fiocco = new ArrayList<>();
    }

    /**
     * Setta un nuovo fiocco.
     * @param fiocco 
     */
    public void setFiocco(ArrayList<Shape> fiocco) {
        this.fiocco = fiocco;
    }

    /**
     * Si occupe di centrare il fiocco all'interno del panel.
     * @param triangle
     * @return 
     */
    public Shape toCenter(Shape triangle) {
        centro = triangolo.getApiceTriangolo();
        AffineTransform dim = new AffineTransform();
        dim.scale(0.7, 0.7);
        AffineTransform toOrigin = new AffineTransform();
        toOrigin.translate(-centro.x, -centro.y);
        AffineTransform toCenter = new AffineTransform();
        toCenter.translate(getWidth()-150, getHeight()+50);
        AffineTransform tot = new AffineTransform();

        tot.concatenate(toOrigin);
        tot.concatenate(dim);
        tot.concatenate(toCenter);

        return tot.createTransformedShape(triangle);
    }

    /**
     * Si occupa di disegnare sul panel.
     * @param g é il contesto grafico.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(coloreFiocco);
        for (int i = 0; i < fiocco.size(); i++) {
            g2.fill(toCenter(fiocco.get(i)));
        }
    }
    
    /**
     * Si occupe di salvare un immagine vettoriale del fiocco creato.
     * @param filename percorso del file creato (in stringa).
     */
    public void generaSVG(String path){
        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        String svgNS = "http://www.w3.org/2000/svg";
        Document document = domImpl.createDocument(svgNS, "svg", null);
        SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
        this.paintComponent(svgGenerator);
        boolean useCSS = true;
        Writer out;
        try {
            svgGenerator.stream(path+".svg");
        } catch (SVGGraphics2DIOException ex) {
            JOptionPane jop = new JOptionPane();
            jop.showOptionDialog(
                    null,
                    "Graphic error. Code: sf206",
                    "Graphic error",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null, null, null);
        }
    }
    
    
    
    
    
    public void generaPNG(String path){
        try{
            BufferedImage buffImg = new BufferedImage
                (1024, 768, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = buffImg.createGraphics();
            g2.setColor(Color.BLACK);
            g2.fillRect(0, 0, 1024, 768);
            g2.setColor(coloreFiocco);
            for(int i = 0; i < fiocco.size();i++){
                g2.fill(toCenter(fiocco.get(i)));
            }
            ImageIO.write(buffImg, "PNG", new File(path));
        } catch (IOException e) {
            JOptionPane jop = new JOptionPane();
            jop.showOptionDialog(
                    null,
                    "Cannot create file",
                    "Error creating file",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null, null, null);
        }
        
    }
    
}
