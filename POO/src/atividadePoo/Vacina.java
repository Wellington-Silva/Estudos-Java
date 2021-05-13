package atividadePoo;
public class Vacina {
    private String nome;
    private int lote;
    private String dataVencimento;
    private String dataAplicacao;

    public Vacina(String nome, int lote, String dataVencimento, String dataAplicacao) {
        this.nome = nome;
        this.lote = lote;
        this.dataVencimento = dataVencimento;
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public int getLote() {
        return lote;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    // Métodos normais

    public void aplicar(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public void imprimir(){
        if(this.dataAplicacao == null) {
            System.out.println("*-- Vacinas que ainda estão disponíveis para aplicação --*");
            System.out.println("Nome da vacina: " + this.nome +
                    "\nData de vencimento: " + this.dataVencimento);
            System.out.println("----------|||----------|||----------|||----------");
        }
        System.out.println(); // Para pular uma linha
    }
}
