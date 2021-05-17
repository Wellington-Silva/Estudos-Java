package Facade;

import java.util.ArrayList;

public class Itens {
    // Atributos
    private Livros livro;
    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Livros getLivro() {
        return livro;
    }

    public void setLivro(Livros livro) {
        this.livro = livro;
    }

    public void cadastrarItem(){
        ArrayList itens = new ArrayList();

        itens.add(livro);

        System.out.printf("Itens: " + itens);
    }
}
