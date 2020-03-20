package Venda_P;


import CRUD_P.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo_Compra extends AbstractTableModel{
    private ArrayList<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Código","Tipo","Descrição","Quantidade","Valor total"};
    
    public void setValueAt(Object valor,int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setCodigo(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setTipo((String) valor);
                break;
            case 2:
                dados.get(linha).setDesc((String) valor);
                break;
            case 3:
                dados.get(linha).setQtd(Integer.parseInt((String) valor));
                break;
            case 4:
                dados.get(linha).setValor(Double.parseDouble((String)valor));
                break;
        }
        fireTableRowsUpdated(linha, linha);
    }
    
    public void removeRow(int linha){
        dados.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    public int procurar(int codigo){
        int i;
        for(i=0;i<dados.size();i++){
            if(codigo==dados.get(i).getCodigo()){
                break;
            }
        }
        return i;
    }
    public void addRow(Produto p){
        dados.add(p);
        fireTableDataChanged();
    }
    public String getColumnName(int column) {
        return colunas[column];
    }

    public int getRowCount() {
        return dados.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dados.get(rowIndex).getCodigo();
            case 1:
                return dados.get(rowIndex).getTipo();
            case 2:
                return dados.get(rowIndex).getDesc();
            case 3:
                return dados.get(rowIndex).getQtd();
            case 4:
                return dados.get(rowIndex).getValor()*dados.get(rowIndex).getQtd();
            case 5:
                return dados.get(rowIndex).getValor();
        }
        return null;
    }
}

