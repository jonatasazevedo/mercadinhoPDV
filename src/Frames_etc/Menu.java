package Frames_etc;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        Mecanismo.setJanelaselecionada(0);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames_etc/me.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(340, 99, 600, 522);

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(0, 630, 1280, 90);

        jLabel3.setBackground(new java.awt.Color(0, 102, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 90);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
