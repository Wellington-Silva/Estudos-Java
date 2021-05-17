package Facade;

public class Livros {
    // Atributos
    private int id;
    private String nome;
    private int cont;

    int[] produto;
    String[] produtoNome;

    // Construtor
    public Livros() {}
    public Livros(String nome, int id){
        this.id = id;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void cadastrarProduto(String nome, int id){
        cont = 0;

        for (int i = 0; i < 20; i++){
            produto[i] = getId();
            for (int j = 0; j <= i; j++){
                produtoNome[j] = getNome();
            }
            cont++;
        }

        System.out.println("Estoque atual de livros: " + cont);
    }
}
