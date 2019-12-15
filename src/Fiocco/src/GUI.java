
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Home del Progetto.
 * @author Daniel Matt
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Metodo costruttore.
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fioccoUno = new javax.swing.JLabel();
        fioccoDue = new javax.swing.JLabel();
        fioccoTre = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ApriFiocco = new javax.swing.JButton();
        CreaFiocco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Generatore di Fiocchi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        fioccoUno.setText("jLabel2");

        fioccoDue.setText("jLabel2");

        fioccoTre.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(fioccoDue, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(fioccoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fioccoTre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(fioccoUno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(fioccoTre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fioccoDue, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        ApriFiocco.setText("Apri Fiocco");
        ApriFiocco.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ApriFiocco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApriFioccoActionPerformed(evt);
            }
        });
        jPanel1.add(ApriFiocco);

        CreaFiocco.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        CreaFiocco.setLabel("Crea Fiocco");
        CreaFiocco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaFioccoActionPerformed(evt);
            }
        });
        jPanel1.add(CreaFiocco);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Apre un file csv e carica i poligoni di taglio in un nuovo panel GeneratoreFiocco.
     * @param evt evento scatenato dal bottone.
     */
    private void ApriFioccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApriFioccoActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("Csv File (*.csv)", "csv");
        jfc.setFileFilter(fnf);
        jfc.showDialog(null, "Open");
        try{
            String handle = new String(jfc.getSelectedFile().toPath().toString());
            new GeneratoreFiocco().setVisible(true);
            new TriangoloPanel().setPoligoni(new LoadPoints().getPoligoni(handle));
            this.dispose();
            
        }catch(NullPointerException npe){
        }
    }//GEN-LAST:event_ApriFioccoActionPerformed

    /**
     * Apre un nuovo panel GeneratoreFiocco.
     * @param evt evento scatenato dal bottone.
     */
    private void CreaFioccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaFioccoActionPerformed
        this.dispose();
        new GeneratoreFiocco().setVisible(true);
    }//GEN-LAST:event_CreaFioccoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApriFiocco;
    private javax.swing.JButton CreaFiocco;
    private javax.swing.JLabel fioccoDue;
    private javax.swing.JLabel fioccoTre;
    private javax.swing.JLabel fioccoUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}