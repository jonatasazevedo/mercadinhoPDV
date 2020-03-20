package CRUD_P;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Frames_etc.BD;
import Frames_etc.Mecanismo;

public class CRUD_Produtos extends javax.swing.JPanel {
    private int[] k;
    private int botao=0;
    private ResultSet rs;
    private PreparedStatement statement;
    private Connection conexao;
    private Modelo_Produto mp = new Modelo_Produto();    
    public CRUD_Produtos() {
        
        Mecanismo.setJanelaselecionada(1);
        conexao = BD.getConnection();
        initComponents();
        carregarDados();
        jTable1.setModel(mp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        jButton1.setText("Cadastrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(182, 310, 90, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produtos");
        add(jLabel1);
        jLabel1.setBounds(550, 10, 180, 40);

        jLabel2.setText("Código:");
        jLabel2.setEnabled(false);
        add(jLabel2);
        jLabel2.setBounds(380, 80, 70, 14);

        jLabel3.setText("Tipo:");
        jLabel3.setEnabled(false);
        add(jLabel3);
        jLabel3.setBounds(380, 110, 60, 14);

        jLabel4.setText("Descrição:");
        jLabel4.setEnabled(false);
        add(jLabel4);
        jLabel4.setBounds(380, 150, 80, 14);

        jLabel5.setText("Valor:");
        jLabel5.setEnabled(false);
        add(jLabel5);
        jLabel5.setBounds(380, 190, 60, 14);

        jLabel6.setText("Quantidade:");
        jLabel6.setEnabled(false);
        add(jLabel6);
        jLabel6.setBounds(370, 230, 80, 20);

        jButton2.setText("Salvar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(790, 200, 90, 30);

        jButton3.setText("Cancelar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(790, 110, 90, 30);

        jTextField1.setEnabled(false);
        add(jTextField1);
        jTextField1.setBounds(440, 70, 240, 30);

        jTextField2.setEnabled(false);
        add(jTextField2);
        jTextField2.setBounds(440, 110, 240, 30);

        jTextField3.setEnabled(false);
        add(jTextField3);
        jTextField3.setBounds(440, 150, 240, 30);

        jTextField4.setEnabled(false);
        add(jTextField4);
        jTextField4.setBounds(440, 190, 240, 30);

        jTextField5.setEnabled(false);
        add(jTextField5);
        jTextField5.setBounds(440, 230, 240, 30);

        jButton4.setText("Alterar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(454, 310, 90, 30);

        jButton5.setText("Excluir");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(726, 310, 90, 30);

        jButton6.setText("Pesquisar");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(1160, 310, 100, 30);

        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jTextField6);
        jTextField6.setBounds(1000, 310, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Tipo", "Descrição", "Valor", "Quantidade" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jComboBox1);
        jComboBox1.setBounds(1000, 270, 130, 30);

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
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 390, 1230, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Mecanismo.autorizar();
        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel6.setEnabled(false);
        jButton1.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Mecanismo.bloquear();
        botao = 1;
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel5.setEnabled(true);
        jLabel6.setEnabled(true);
        jButton1.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(true);
        jTextField5.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Produto p = new Produto();
        boolean x = true;
        if(!jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("") && !jTextField4.getText().equals("") && !jTextField5.getText().equals("")){
            if(botao==1){
                x=verificarCod(jTextField1.getText());
                if(x){
                    x=verificarValor(jTextField4.getText());
                    if(x){
                        x=verificarQtd(jTextField5.getText());
                    }
                }
                if(x){
                    String sql="insert into produto value(?,?,?,?,?)";
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.setInt(1,Integer.parseInt(jTextField1.getText()));
                        p.setCodigo(Integer.parseInt(jTextField1.getText()));
                        statement.setDouble(2,Double.parseDouble(jTextField4.getText()));
                        p.setValor(Double.parseDouble(jTextField4.getText()));
                        statement.setString(3,jTextField3.getText());
                        p.setDesc(jTextField3.getText());
                        statement.setString(4,jTextField2.getText());
                        p.setTipo(jTextField2.getText());
                        statement.setInt(5,Integer.parseInt(jTextField5.getText()));
                        p.setQtd(Integer.parseInt(jTextField5.getText()));
                        statement.execute();
                        mp.addRow(p);
                        JOptionPane.showMessageDialog(null,"Produto cadastrado!!!");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    Mecanismo.autorizar();
                }
                else JOptionPane.showMessageDialog(null,"Informe os campos com dados númericos corretamente!!!");
            }
            else{
                String sql = "update produto set valor=?,descricao=?,tipo=?,qtd=? where codigo=?";
                x=verificarValor(jTextField4.getText());
                if(x){
                    x=verificarQtd(jTextField5.getText());
                }
                if(x){
                    int j = jTable1.getSelectedRow();
                    try {
                        statement = conexao.prepareStatement(sql);
                        statement.setDouble(1,Double.parseDouble(jTextField4.getText()));
                        mp.setValueAt(jTextField4.getText(),j,4);
                        statement.setString(2,jTextField3.getText());
                        mp.setValueAt(jTextField3.getText(),j,2);
                        statement.setString(3,jTextField2.getText());
                        mp.setValueAt(jTextField2.getText(),j,1);
                        statement.setInt(4,Integer.parseInt(jTextField5.getText()));
                        mp.setValueAt(jTextField5.getText(),j,3);
                        statement.setInt(5,(int) mp.getValueAt(j,0));
                        statement.execute();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,ex);
                    }
                    Mecanismo.autorizar();
                    JOptionPane.showMessageDialog(null,"Produto alterado!!!");
                }
                else JOptionPane.showMessageDialog(null,"Informe os campos com dados númericos corretamente!!!");
            }
            if(x){
                jLabel2.setEnabled(false);
                jLabel3.setEnabled(false);
                jLabel4.setEnabled(false);
                jLabel5.setEnabled(false);
                jLabel6.setEnabled(false);
                jButton1.setEnabled(true);
                jButton4.setEnabled(true);
                jButton5.setEnabled(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField5.setEnabled(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
            }
        }
        else JOptionPane.showMessageDialog(null,"Preencha todos os campos!!!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int j = jTable1.getSelectedRow();
        if(jTable1.getSelectedRow()!=-1){
            Mecanismo.bloquear();
            botao = 2;
            jLabel3.setEnabled(true);
            jLabel4.setEnabled(true);
            jLabel5.setEnabled(true);
            jLabel6.setEnabled(true);
            jButton1.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jTextField2.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField4.setEnabled(true);
            jTextField5.setEnabled(true);
            jTextField1.setText(String.valueOf(mp.getValueAt(j,0)));
            jTextField2.setText(String.valueOf(mp.getValueAt(j,1)));
            jTextField3.setText(String.valueOf(mp.getValueAt(j,2)));
            jTextField4.setText(String.valueOf(mp.getValueAt(j,4)));
            jTextField5.setText(String.valueOf(mp.getValueAt(j,3)));
        }
        else JOptionPane.showMessageDialog(null,"Selecione algum produto!!!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTable1.getSelectedRow()!=-1){
            Object[] options = { "OK", "CANCELAR" };
            int i= JOptionPane.showOptionDialog(null,"Deseja excluir o(s) produto(s)?","Aviso",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE,null,options,options[0]);
            if(i==0){
                while(true){
                    k = jTable1.getSelectedRows();
                    if(k.length==0) break;
                    String sql = "delete from produto where codigo=?";
                    try {
                        statement  = conexao.prepareStatement(sql);
                        statement.setInt(1, (int) mp.getValueAt(k[0],0));
                        statement.execute();
                        mp.removeRow(k[0]);
                    } catch (SQLException ex) {
                        Logger.getLogger(CRUD_Produtos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                JOptionPane.showMessageDialog(null,"Produto(s) excluído(s)!!!");
            }
        }
        else JOptionPane.showMessageDialog(null,"Selecione algum produto!!!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String sql="";
        boolean x=true;
        if(!jTextField6.getText().equals("")){
            switch(jComboBox1.getSelectedIndex()){
                case 0:
                    x=verificarCod(jTextField6.getText());
                    sql="select *from produto where codigo like '%"+jTextField6.getText()+"%' order by codigo asc";
                    break;
                case 1:
                    sql="select *from produto where tipo like '%"+jTextField6.getText()+"%' order by codigo asc";
                    break;
                case 2:
                    sql = "select *from produto where descricao like '%"+jTextField6.getText()+"%' order by codigo asc";
                    break;
                case 3:
                    x=verificarValor(jTextField6.getText());
                    sql = "select *from produto where valor="+jTextField6.getText()+" order by codigo asc";
                    break;
                case 4:
                    x=verificarQtd(jTextField6.getText());
                    sql = "select *from produto where qtd="+jTextField6.getText()+" order by codigo asc";
                    break;
            }
            if(x){
                mp = new Modelo_Produto();
                try {
                    statement = conexao.prepareStatement(sql);
                    rs = statement.executeQuery();
                    while(rs.next()){
                        Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                        mp.addRow(p);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD_Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTable1.setModel(mp);
            }
        else JOptionPane.showMessageDialog(null,"Preencha o campo númerico corretamente!!!");
        }
        else carregarDados();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void carregarDados() {
        String sql="select *from produto order by codigo asc";
        mp = new Modelo_Produto();
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                mp.addRow(p);
            }
            jTable1.setModel(mp);
        } catch (SQLException ex) {
            Logger.getLogger(CRUD_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean verificarCod(String txt) {
        boolean x=true;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)>'9' || txt.charAt(i)<'0'){
                x=false;
                break;
            }
        }
        return x;
    }
    
    private boolean verificarValor(String txt) {
        boolean x=true;
        int contpo=0;
        if(txt.charAt(txt.length()-1)=='.' || txt.charAt(0)=='.') x=false;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)=='.'){
                contpo++;
                if(contpo>1){
                    x=false;
                    break;
                }
            }
            else if(txt.charAt(i)>'9' || txt.charAt(i)<'0'){
                x=false;
                break;
            }
        }
        return x;
    }
    
    private boolean verificarQtd(String txt) {
        boolean x=true;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)>'9' || txt.charAt(i)<'0'){
                x=false;
                break;
            }
        }
        return x;
    }
}
