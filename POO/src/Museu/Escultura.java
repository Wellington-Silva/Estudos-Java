package Museu;
public class Escultura extends Obra {
    public String material;

    // Construtor
    public Escultura(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnicas, String material) {
        super(codigo, dataAquisicao, titulo, dimensoes, tecnicas);
        this.material = material;
    }
    // getters and setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Impressões
    public void imprimir() {
        super.imprimir(); // usando herança
        System.out.println("Material: " + this.material);
        System.out.println(" ");
    }
}
