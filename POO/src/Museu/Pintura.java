package Museu;
public class Pintura extends Obra {
    private  String tipoTinta;

    // Construtor
    public Pintura(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnicas, String tipoTinta) {
        super(codigo, dataAquisicao, titulo, dimensoes, tecnicas);
        this.tipoTinta = tipoTinta;
    }

    // getters and setters
    public String getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(String tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    // Impressões
    public void imprimir() {
        super.imprimir(); // usando herança
        System.out.println("Tipo tinta: " + this.tipoTinta);
        System.out.println(" ");
    }
}
