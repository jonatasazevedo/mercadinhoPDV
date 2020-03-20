package Venda_P;

import CRUD_P.CRUD_Produtos;
import CRUD_P.Modelo_Produto;
import CRUD_P.Produto;
import Frames_etc.BD;
import Frames_etc.Mecanismo;
import Frames_etc.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class Venda_Dinheiro extends javax.swing.JPanel {
    private Modelo_Produto mp2 = new Modelo_Produto();
    private Modelo_Compra mp1 = new Modelo_Compra();
    private ResultSet rs;
    private PreparedStatement statement;
    private Connection conexao;
    public Venda_Dinheiro() {
        Mecanismo.setJanelaselecionada(3);
        conexao = BD.getConnection();
        initComponents();
        iniciarBackup();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        carregarDadosProduto1();
        carregarDadosProduto2();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(null);

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
        jScrollPane1.setBounds(850, 190, 390, 450);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(40, 190, 390, 450);

        jButton6.setText("Pesquisar");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6);
        jButton6.setBounds(170, 150, 100, 30);

        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(jTextField6);
        jTextField6.setBounds(10, 150, 150, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Tipo", "Descrição", "Valor", "Quantidade" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jComboBox1);
        jComboBox1.setBounds(10, 110, 130, 30);

        jButton1.setText("Adicionar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(340, 150, 100, 30);
        add(jTextField1);
        jTextField1.setBounds(800, 150, 150, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Tipo", "Descrição", "Quantidade" }));
        add(jComboBox2);
        jComboBox2.setBounds(800, 110, 130, 30);

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(960, 150, 100, 30);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("1");
        add(jTextField2);
        jTextField2.setBounds(450, 150, 40, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantidade");
        add(jLabel1);
        jLabel1.setBounds(410, 130, 80, 14);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quantidade");
        add(jLabel2);
        jLabel2.setBounds(1190, 130, 70, 14);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("1");
        add(jTextField3);
        jTextField3.setBounds(1220, 150, 40, 30);

        jButton2.setText("Retirar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1110, 150, 100, 30);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Realizar Compra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(525, 480, 230, 37);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("R$0.0");
        add(jLabel3);
        jLabel3.setBounds(525, 580, 230, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Produtos");
        add(jLabel4);
        jLabel4.setBounds(170, 50, 160, 44);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lista de compra");
        add(jLabel5);
        jLabel5.setBounds(880, 50, 320, 44);
    }// </editor-fold>//GEN-END:initComponents

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
                mp2 = new Modelo_Produto();
                try {
                    statement = conexao.prepareStatement(sql);
                    rs = statement.executeQuery();
                    while(rs.next()){
                        Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                        mp2.addRow(p);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD_Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTable2.setModel(mp2);
            }
            else JOptionPane.showMessageDialog(null,"Preencha o campo númerico corretamente!!!");
        }
        else carregarDadosProduto2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Produto p = new Produto();
        String sql;
        int in,cod,qtd_tab,qtd_req,linha = jTable2.getSelectedRow();
        if(linha!=-1){
            if(!jTextField2.getText().equals("") && verificarQtd(jTextField2.getText())){
                if(!jTextField2.getText().equals("0")){
                    qtd_req=Integer.parseInt(jTextField2.getText());
                    cod = (int) mp2.getValueAt(linha,0);
                    qtd_tab= (int)mp2.getValueAt(linha,3);
                    try {
                        if(qtd_tab>=qtd_req){
                            sql="select count(*) as reg from compra where codigo=?";
                            statement = conexao.prepareStatement(sql);
                            statement.setInt(1,cod);
                            rs = statement.executeQuery();
                            rs.first();
                            if(rs.getInt("reg")!=0){
                                in = mp1.procurar(cod);
                                sql="update compra set qtd=? where codigo=?";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,((int)mp1.getValueAt(in,3))+qtd_req);
                                mp1.setValueAt(String.valueOf(((int)mp1.getValueAt(in,3))+qtd_req),in,3);
                                statement.setInt(2,cod);
                                statement.execute();
                            }
                            else{
                                sql="insert into compra value(?,?,?,?,?)";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,cod);
                                p.setCodigo(cod);
                                statement.setDouble(2,(double)mp2.getValueAt(linha,4));
                                p.setValor((double) mp2.getValueAt(linha,4));
                                statement.setString(3,(String)mp2.getValueAt(linha,2));
                                p.setDesc((String)mp2.getValueAt(linha,2));
                                statement.setString(4,(String)mp2.getValueAt(linha,1));
                                p.setTipo((String)mp2.getValueAt(linha,1));
                                statement.setInt(5,qtd_req);
                                p.setQtd(qtd_req);
                                statement.execute();
                                mp1.addRow(p);
                            }
                            sql="update produto set qtd=? where codigo=?";
                            statement = conexao.prepareStatement(sql);
                            statement.setInt(1,((int)mp2.getValueAt(linha,3))-qtd_req);
                            mp2.setValueAt(String.valueOf(((int)mp2.getValueAt(linha,3))-qtd_req), linha, 3);
                            statement.setInt(2,cod);
                            statement.execute();
                            
                            jLabel3.setText("R$"+carregarDinheiro());
                        }
                        else JOptionPane.showMessageDialog(null,"O produto desejado não tem a quantidade desejada!!!");
                    } catch (SQLException ex) {
                        Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else JOptionPane.showMessageDialog(null,"Preencha o campo númerico corretamente!!!");
        }
        else JOptionPane.showMessageDialog(null,"Selecione algum produto!!!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sql="";
        boolean x=true;
        if(!jTextField1.getText().equals("")){
            switch(jComboBox2.getSelectedIndex()){
                case 0:
                    x=verificarCod(jTextField1.getText());
                    sql="select *from compra where codigo like '%"+jTextField1.getText()+"%' order by codigo asc";
                    break;
                case 1:
                    sql="select *from compra where tipo like '%"+jTextField1.getText()+"%' order by codigo asc";
                    break;
                case 2:
                    sql = "select *from compra where descricao like '%"+jTextField1.getText()+"%' order by codigo asc";
                    break;
                case 3:
                    x=verificarQtd(jTextField1.getText());
                    sql = "select *from compra where qtd="+jTextField1.getText()+" order by codigo asc";
                    break;
            }
            if(x){
                mp1 = new Modelo_Compra();
                try {
                    statement = conexao.prepareStatement(sql);
                    rs = statement.executeQuery();
                    while(rs.next()){
                        Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                        mp1.addRow(p);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CRUD_Produtos.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTable1.setModel(mp1);
                Mecanismo.setMp(mp1);
            }
            else JOptionPane.showMessageDialog(null,"Preencha o campo númerico corretamente!!!");
        }
        else carregarDadosProduto1();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Produto p = new Produto();
        String sql;
        int in,cod,qtd_tab,qtd_req,linha = jTable1.getSelectedRow();
        if(linha!=-1){
            if(!jTextField3.getText().equals("") && verificarQtd(jTextField3.getText())){
                if(!jTextField3.getText().equals("0")){
                    qtd_req=Integer.parseInt(jTextField3.getText());
                    cod = (int) mp1.getValueAt(linha,0);
                    qtd_tab= (int) mp1.getValueAt(linha,3);
                    sql="select qtd from compra where codigo=?";
                    try {
                        if(qtd_tab>=qtd_req){
                            sql="select count(*) as reg from produto where codigo=?";
                            statement = conexao.prepareStatement(sql);
                            statement.setInt(1,cod);
                            rs = statement.executeQuery();
                            rs.first();
                            if(rs.getInt("reg")!=0){
                                in = mp2.procurar(cod);
                                sql="update produto set qtd=? where codigo=?";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,(int)mp2.getValueAt(in,3)+qtd_req);
                                mp2.setValueAt(String.valueOf((int)mp2.getValueAt(in,3)+qtd_req),in,3);
                                statement.setInt(2,cod);
                                statement.execute();
                            }
                            else{
                                sql="insert into produto value(?,?,?,?,?)";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,cod);
                                p.setCodigo(cod);
                                statement.setDouble(2,(double)mp1.getValueAt(linha,5));
                                p.setValor((double)mp1.getValueAt(linha,5));
                                statement.setString(3,(String)mp1.getValueAt(linha,2));
                                p.setDesc((String)mp1.getValueAt(linha,2));
                                statement.setString(4,(String)mp1.getValueAt(linha,1));
                                p.setTipo((String)mp1.getValueAt(linha,1));
                                statement.setInt(5,qtd_req);
                                p.setQtd(qtd_req);
                                statement.execute();
                                mp2.addRow(p);
                            }
                            if(qtd_req==qtd_tab){
                                sql="delete from compra where codigo=?";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,cod);
                                statement.execute();
                                mp1.removeRow(linha);
                            }
                            else{
                                sql="update compra set qtd=? where codigo=?";
                                statement = conexao.prepareStatement(sql);
                                statement.setInt(1,(int)mp1.getValueAt(linha,3)-qtd_req);
                                mp1.setValueAt(String.valueOf((int)mp1.getValueAt(linha,3)-qtd_req),linha,3);
                                statement.setInt(2,cod);
                                statement.execute();
                            }
                            jLabel3.setText("R$"+carregarDinheiro());
                        }
                        else JOptionPane.showMessageDialog(null,"O produto desejado não tem a quantidade desejada!!!");
                    } catch (SQLException ex) {
                        Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else JOptionPane.showMessageDialog(null,"Preencha o campo númerico corretamente!!!");
        }
        else JOptionPane.showMessageDialog(null,"Selecione algum produto!!!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SimpleDateFormat sdf;
        if(mp1.getRowCount()!=0){
            Date hoje = new Date();
            double x = carregarDinheiro();
            String sql="insert into venda value(?,?,?,?,?)";
            try {
                statement = conexao.prepareStatement(sql);
                statement.setString(1,"Cliente normal");
                sdf = new SimpleDateFormat("dd/MM/yyyy");
                statement.setString(2,sdf.format(hoje));
                sdf = new SimpleDateFormat("HH:mm");
                statement.setString(3,sdf.format(hoje));
                statement.setDouble(4,x);
                statement.setString(5,"Dinheiro");
                statement.execute();
                JOptionPane.showMessageDialog(null,"Venda realizada com sucesso!!!");
            } catch (SQLException ex) {
                Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Mecanismo.setJanelaselecionada(0);
        setLayout(getLayout());
        Mecanismo.getContent().removeAll();
        Mecanismo.getContent().add(new Menu());
        Mecanismo.getContent().validate();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void carregarDadosProduto2() {
        String sql="select *from produto order by codigo asc";
        mp2 = new Modelo_Produto();
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                mp2.addRow(p);
            }
            jTable2.setModel(mp2);
        }catch (SQLException ex) {
            Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private double carregarDinheiro(){
        double x = 0;
        String sql="select sum(valor*qtd) as soma from compra";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            rs.first();
            x = rs.getDouble("soma");
        } catch (SQLException ex) {
            Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    
    private void carregarDadosProduto1() {
        String sql="select *from compra order by codigo asc";
        mp1 = new Modelo_Compra();
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                Produto p = new Produto(rs.getInt("codigo"),rs.getInt("qtd"),rs.getString("tipo"),rs.getString("descricao"),rs.getDouble("valor"));
                mp1.addRow(p);
            }
            jTable1.setModel(mp1);
            Mecanismo.setMp(mp1);
        }
        catch (SQLException ex) {
            Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
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

    private void iniciarBackup() {
        String sql1="delete from backup_p",sql2="insert into backup_p select *from produto",sql3="delete from compra";
        try {
            statement = conexao.prepareStatement(sql1);
            statement.execute();
            statement = conexao.prepareStatement(sql2);
            statement.execute();
            statement = conexao.prepareStatement(sql3);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Venda_Dinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
