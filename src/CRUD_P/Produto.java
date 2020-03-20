package CRUD_P;

public class Produto {
    private int codigo,qtd;
    private String tipo,desc;
    private double valor;
    
    public Produto() {
        
    }
    
    public Produto(int codigo, int qtd, String tipo, String desc, double valor) {
        this.codigo = codigo;
        this.qtd = qtd;
        this.tipo = tipo;
        this.desc = desc;
        this.valor = valor;
    }

    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public int getQtd() {
        return qtd;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDesc() {
        return desc;
    }

    public double getValor() {
        return valor;
    }
    
}
