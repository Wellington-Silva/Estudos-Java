package Mercado_Praticando;

import java.util.ArrayList;

public class Produtos {

    private String nome;
    private double preço;
    private ArrayList<Produtos> produts = new ArrayList<>();

    public Produtos(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    /*public void cadastrarProduto() {
        if(produts != null) {
            for(Produtos produts : Produtos.getNome()) {
                System.out.println("Nome: " + getNome());
            }
        }
    }*/

    public void imprimir() {
        System.out.println("Nome do produto: " + this.nome + "\nPreço: R$" + this.preço);
    }
}



/*public void imprimir(Artista autor) {
       if(autor != null && autor.getObra() != null) {
           System.out.println("****** DADOS DA OBRA DE " + autor.getNome() + " ******");
            for(Obra obras : autor.getObra()) {
                System.out.println("Código: " + obras.getCodigo());
                System.out.println("Data de Aquisição: " + obras.getDataAquisicao());
                System.out.println("Título: " + obras.getTitulo());
                System.out.println();
            }
       }
    }*/