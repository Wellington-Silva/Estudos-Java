package Herança;
public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + "\n" +
                "Comprimento: " + this.comprimento + "\n" +
                "Número de patas: " + this.numeroDePatas + "\n" +
                "Cor: " + this.cor + "\n" +
                "Ambiente: " + this.ambiente + "\n" +
                "Velocidade Média: " + this.velocidadeMedia + "\n" +
                "Característica: " + this.caracteristica);
        System.out.println();
    }
}
