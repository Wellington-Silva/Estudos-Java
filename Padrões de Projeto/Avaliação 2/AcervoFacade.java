package Facade;

public class AcervoFacade {
    private Livros livro;
    private Itens item;
    private Pedido pedido;

    public AcervoFacade(){
        this.livro = new Livros();
        this.item = new Itens();
        this.pedido = new Pedido();

    }

    public void incluirPedido(){
        livro.cadastrarProduto(livro.getNome(), livro.getId());
        item.cadastrarItem();
        pedido.cadastrarPedido(item, pedido.getNomeCliente(), pedido.getCpf());
    }
}
