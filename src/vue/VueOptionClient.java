package vue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * Fenêtre de dialogue pour saisir un nouveau client ou en sélectionner un existant
 * @author ydurand
 * v1.0
 */
public class VueOptionClient extends VueGenerique {    

    /**
     * Creates new dialog VueOptionClient
     */
    public VueOptionClient() {
        initComponents();        
        myInitComponents();
        this.setLocation(500, 200);
    }
    
    //GETTER
    public JButton getJButtonNouveauClient() {
        return jButtonNouveauClient;
    }
    
    public JButton getJButtonClientExistant() {
        return jButtonClientExistant;
    }
    
    //Initialisation des comlposants graphiques
    private void myInitComponents() {        
        jLabelTitreDialog = new javax.swing.JLabel();
        jButtonNouveauClient = new javax.swing.JButton();
        jButtonClientExistant = new javax.swing.JButton();
        
        jLabelTitreDialog.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelTitreDialog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitreDialog.setText("Quel type de client êtes-vous ?");
        
        jButtonNouveauClient.setText("Nouveau Client");
        
        jButtonClientExistant.setText("Client Existant");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabelTitreDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }
    
    //Déclaration des variables
    private javax.swing.JLabel jLabelTitreDialog;
    private javax.swing.JButton jButtonNouveauClient;
    private javax.swing.JButton jButtonClientExistant;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        setLayout(new java.awt.BorderLayout());

    }//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
