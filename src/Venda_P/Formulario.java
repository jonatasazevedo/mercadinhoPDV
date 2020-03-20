package Venda_P;

import Frames_etc.BD;
import Frames_etc.Mecanismo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Formulario extends javax.swing.JPanel {
    Connection conexao;
    private ResultSet rs;
    private PreparedStatement statement;
    Modelo_Formulario mp3 = new Modelo_Formulario();
    public Formulario() {
        Mecanismo.setJanelaselecionada(4);
        conexao = BD.getConnection();
        initComponents();
        carregarDadosVenda();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 204, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulário de Vendas");
        add(jLabel1);
        jLabel1.setBounds(455, 10, 370, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 1240, 580);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void carregarDadosVenda() {
        String sql="select *from venda";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                Venda v = new Venda(rs.getString("nome"),rs.getString("data_v"),rs.getString("hora_v"),rs.getDouble("total"),rs.getString("tipo"));
                mp3.addRow(v);
            }
            jTable1.setModel(mp3);
        } catch (SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
