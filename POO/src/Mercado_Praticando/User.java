package Mercado_Praticando;

import java.util.ArrayList;

public class User extends Produtos{

    private String nome;
    private String user;
    private String senha;
    private ArrayList<Produtos> carrinho = new ArrayList<>();

    public User(String nome, double preço, String nome1, String user, String senha) {
        super(nome, preço);
        this.nome = nome1;
        this.user = user;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void fazerCompra() {

    }
}
