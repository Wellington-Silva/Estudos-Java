package Museu;
public class Obra {
    protected String codigo;
    protected String dataAquisicao;
    protected String titulo;
    protected String dimensoes;
    protected String tecnicas;
    protected Artista autor;

    // Construtor
    public Obra(String codigo, String dataAquisicao, String titulo, String dimensoes, String tecnicas) {
        this.codigo = codigo;
        this.dataAquisicao = dataAquisicao;
        this.titulo = titulo;
        this.dimensoes = dimensoes;
        this.tecnicas = tecnicas;
    }

    // getters e setters
    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(String tecnicas) {
        this.tecnicas = tecnicas;
    }

    public Artista getAutor() { return autor; }

    public void setAutor(Artista autor) {
        this.autor = autor;
    }

    // Impressões
    public void imprimir() {
        System.out.println("****** DADOS DA OBRA ******");
        System.out.println("Código: " + getCodigo());
        System.out.println("Data de aquisição: " + getDataAquisicao());
        System.out.println("Título: " + getDimensoes());
        System.out.println("Técnica: " + getTecnicas());
    }

    public void imprimir(Artista autor) {
       if(autor != null && autor.getObra() != null) {
           System.out.println("****** DADOS DA OBRA DE " + autor.getNome() + " ******");
            for(Obra obras : autor.getObra()) {
                System.out.println("Código: " + obras.getCodigo());
                System.out.println("Data de Aquisição: " + obras.getDataAquisicao());
                System.out.println("Título: " + obras.getTitulo());
                System.out.println();
            }
       }
    }
}

