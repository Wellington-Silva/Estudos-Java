package Museu;
import java.util.ArrayList;
public class Artista {
    private String registro;
    private String nome;
    private String nacionalidade;
    private ArrayList<Obra> obras = new ArrayList<>();

    public Artista(String registro, String nome, String nacionalidade) {
        this.registro = registro;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Obra> getObra() {
        return obras;
    }

    public void setObra(Obra obras) {
        this.obras.add(obras);
    } // Aqui está acontecendo a inserção das obras para o autor através do arrayList

    public void imprimir() {
        System.out.println("Nome:" + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println(" ");
    }

}
