package Venda_P;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo_Formulario extends AbstractTableModel{
    private ArrayList<Venda> dados = new ArrayList<>();
    private String[] colunas = {"Nome","Data","Hora","Valor da compra","Tipo"};
    
    public int getRowCount() {
        return dados.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    public void addRow(Venda v){
        dados.add(v);
        fireTableDataChanged();
    }
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getData();
            case 2:
                return dados.get(linha).getHora();
            case 3:
                return dados.get(linha).getTotal();
            case 4:
                return dados.get(linha).getTipo();
        }
        return null;
    }
    
}
