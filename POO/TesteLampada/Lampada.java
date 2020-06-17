package testelampada;
public class Lampada {
    
    private String modelo;
    private String tensao;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String tipos[];
    private int potencia;
    private boolean ligada;
    private boolean desligada;
    private boolean tipoAbajur;
    
    Lampada() {    
    }
    
    public Lampada(String modelo, String tensao, String cor, String tipoLuz, int garantiaMeses, String[] tipos, int potencia, boolean ligada, boolean desligada, boolean tipoAbajur) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.potencia = potencia;
        this.ligada = ligada;
        this.desligada = desligada;
        this.tipoAbajur = tipoAbajur;
    }
       
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean isDesligada() {
        return desligada;
    }

    public void setDesligada(boolean desligada) {
        this.desligada = desligada;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }   
    
    public void ligar() {
        setLigada(true);
    }
    
    public void desligar() {
        setLigada(false);
    }
    
    public void mostrarEstado(){
        if(isLigada()) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
    
    public void mudarEstado(){
        if(isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}

