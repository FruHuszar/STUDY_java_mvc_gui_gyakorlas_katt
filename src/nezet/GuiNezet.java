package nezet;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class GuiNezet extends javax.swing.JFrame {

    public GuiNezet() {
        initComponents();
    }

    public JButton getBtnKiir() {
        return btnKiir;
    }

    public JLabel getLblKiir() {
        return lblKiir;
    }
    
    public void megjelenit(String szoveg){
        lblKiir.setText(szoveg);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKiir = new javax.swing.JButton();
        lblKiir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKiir.setText("Kiir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnKiir)
                .addGap(18, 18, 18)
                .addComponent(lblKiir, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnKiir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKiir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKiir;
    private javax.swing.JLabel lblKiir;
    // End of variables declaration//GEN-END:variables
}
