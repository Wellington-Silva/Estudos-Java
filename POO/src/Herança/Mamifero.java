package Herança;
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + "\n" +
                "Comprimento: " + this.comprimento + "\n" +
                "Número de patas: " + this.numeroDePatas + "\n" +
                "Cor: " + this.cor + "\n" +
                "Ambiente: " + this.ambiente + "\n" +
                "Velocidade Média: " + this.velocidadeMedia + "\n" +
                "ALimento: " + this.alimento);
        System.out.println();
    }
}
