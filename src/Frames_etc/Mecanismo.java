package Frames_etc;

import java.awt.Container;
import javax.swing.table.AbstractTableModel;

public class Mecanismo {
    private static Container content;
    private static boolean fechar=true,usaTabela=false;
    private static int janelaselecionada=0;
    private static AbstractTableModel mp;

    public static AbstractTableModel getMp() {
        return mp;
    }

    public static void setMp(AbstractTableModel mp) {
        Mecanismo.mp = mp;
    }
    public static int getJanelaselecionada() {
        return janelaselecionada;
    }
    
    public static void setJanelaselecionada(int janelaselecionada) {
        Mecanismo.janelaselecionada = janelaselecionada;
        if(janelaselecionada==2 || janelaselecionada==3){
            usaTabela=true;
        }
    }
    
    public static boolean verificarModelo(){
        boolean x=true;
        if(usaTabela && mp.getRowCount()!=0){
            x=false;
        }
        return x;
        
    }
    public static boolean isFechar() {
        return fechar;
    }
    public static void autorizar(){
        fechar=true;
    }
    
    public static void bloquear(){
        fechar=false;
    }
    
    public static Container getContent() {
        return content;
    }

    public static void setContent(Container content) {
        Mecanismo.content = content;
    }
    
}
