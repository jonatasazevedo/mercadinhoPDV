package Frames_etc;

import CRUD_P.CRUD_Produtos;
import Venda_P.Formulario;
import Venda_P.Venda_Dinheiro;
import Venda_P.Venda_Fiado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Janela extends javax.swing.JFrame {
    private PreparedStatement statement;
    private Connection conexao;
    public Janela() {
        conexao = BD.getConnection();
        initComponents();
        setLayout(getLayout());
        Mecanismo.setContent(getContentPane());
        getContentPane().removeAll();
        getContentPane().add(new Menu());
        getContentPane().validate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MVT");
        setBackground(new java.awt.Color(102, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/Frames_etc/logo.png")).getImage()
        );
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Produtos");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem1.setText("Gerenciar produtos");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vendas");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem2.setText("Fiado");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Dinheiro");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Formulário");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        boolean tt=true;
        if(Mecanismo.getJanelaselecionada()!=1){
            int x=0;
            Object[] options = { "OK", "CANCELAR" };
            if(!Mecanismo.isFechar() || (!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))){ 
                x=JOptionPane.showOptionDialog(null,"Deseja sair?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
                if((!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))) tt=false;
            }
            if(x==0){
                if(!tt){
                    String sql;
                    sql="delete from produto";
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                        sql="insert into produto select *from backup_p";
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Mecanismo.autorizar();
                setLayout(getLayout());
                getContentPane().removeAll();
                getContentPane().add(new CRUD_Produtos());
                getContentPane().validate();
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        boolean tt=true;
        if(Mecanismo.getJanelaselecionada()!=4){
            int x=0;
            Object[] options = { "OK", "CANCELAR" };
            if(!Mecanismo.isFechar() || (!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))){ 
                x=JOptionPane.showOptionDialog(null,"Deseja sair?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
                if((!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))) tt=false;
            }
            if(x==0){
                if(!tt){
                    String sql;
                    sql="delete from produto";
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                        sql="insert into produto select *from backup_p";
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Mecanismo.autorizar();
                setLayout(getLayout());
                getContentPane().removeAll();
                getContentPane().add(new Formulario());
                getContentPane().validate();
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        boolean tt=true;
        if(Mecanismo.getJanelaselecionada()!=3){
            int x=0;
            Object[] options = { "OK", "CANCELAR" };
            if(!Mecanismo.isFechar() || (!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))){ 
                x=JOptionPane.showOptionDialog(null,"Deseja sair?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
                if((!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))) tt=false;
            }
            if(x==0){
                if(!tt){
                    String sql;
                    sql="delete from produto";
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                        sql="insert into produto select *from backup_p";
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Mecanismo.autorizar();
                setLayout(getLayout());
                getContentPane().removeAll();
                getContentPane().add(new Venda_Dinheiro());
                getContentPane().validate();
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        boolean tt=true;
        if(Mecanismo.getJanelaselecionada()!=2){
            int x=0;
            Object[] options = { "OK", "CANCELAR" };
            if(!Mecanismo.isFechar() || (!Mecanismo.verificarModelo() && Mecanismo.getJanelaselecionada()==3 || Mecanismo.getJanelaselecionada()==2)){ 
                x=JOptionPane.showOptionDialog(null,"Deseja sair?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
                if((!Mecanismo.verificarModelo() && Mecanismo.getJanelaselecionada()==3 || Mecanismo.getJanelaselecionada()==2)) tt=false;
            }
            if(x==0){
                if(!tt){
                    String sql;
                    sql="delete from produto";
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                        sql="insert into produto select *from backup_p";
                        statement = conexao.prepareStatement(sql);
                        statement.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Mecanismo.autorizar();
                setLayout(getLayout());
                getContentPane().removeAll();
                getContentPane().add(new Venda_Fiado());
                getContentPane().validate();
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        boolean tt=true;
        int x=0;
        Object[] options = { "OK", "CANCELAR" };
        if(!Mecanismo.isFechar() || (!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))){ 
            x=JOptionPane.showOptionDialog(null,"Deseja sair?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
            if((!Mecanismo.verificarModelo() &&(Mecanismo.getJanelaselecionada()==2 || Mecanismo.getJanelaselecionada()==3))) tt=false;
        }
        if(x==0){
            if(!tt){
                String sql;
                sql="delete from produto";
                try {
                    statement = conexao.prepareStatement(sql);
                    statement.execute();
                    sql="insert into produto select *from backup_p";
                    statement = conexao.prepareStatement(sql);
                    statement.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(Janela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

}
