package Facade;

public class Pedido {
    // Atributos
    private Itens item;
    private String nomeCliente;
    private String cpf;

    // Construtor
    public Pedido() {}
    public Pedido(Itens item, String nomeCliente, String cpf){
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.item = item;
    }

    // Métodos
    public Itens getItem() {
        return item;
    }

    public void setItem(Itens item) {
        this.item = item;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void cadastrarPedido(Itens item, String nomeCliente, String cpf){
        System.out.println("Cliente: " + getNomeCliente() + " \n" +
                "CPF: " + getCpf() + "\n" +
                "Item: " + getItem());
    }
}
