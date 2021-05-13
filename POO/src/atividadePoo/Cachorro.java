package atividadePoo;
public class Cachorro {
    private String nome;
    private String raca;
    private char sexo;
    private String cor;
    private int idade;
    private double tamanho;
    private double peso;
    private int filhotes=0;
    private Vacina[] vacinas = new Vacina[6];

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public char getSexo() {
        return sexo;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getFilhotes() {
        return filhotes;
    }

    // Métodos normais
    public Cachorro(String nome, String raca, char sexo, String cor) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.cor = cor;
    }

    // Segundo construtor encadeado com o primeiro
    public Cachorro(String nome, String raca, char sexo, String cor, double tamanho) {
        this(nome, raca, sexo, cor);
        this.tamanho = tamanho;
    }

    public void correr() {
        System.out.println("O cachorro "+ this.nome +" está correndo");
    }

    public void latir() {
        System.out.println("O cachorro "+ this.nome +" está latindo");
    }

    public void cavar() {
        System.out.println("O cachorro "+ this.nome +" está cavando");
    }

    public void comer(double quantidade) {
        this.peso += 0.1 * quantidade;
    }

    public void crescer(double tamanho) {
        this.tamanho += tamanho;
    }

    // Este faz uma validação se o sexo está com letra minúscula ou maiúscuça para funcionar com as duas
    public void terfilhote(int quantidade) {
        if(this.sexo == 'F' || this.sexo == 'f'){
            this.filhotes += quantidade;
        }
    }

    public void vacinar(Vacina v) {
        for (int i = 0; i < vacinas.length; i++) {
            if(this.vacinas[i] == null) {
                this.vacinas[i] = v;
                break;
            }
        }
    }

    public void imprimir() {
        System.out.println("----- DADOS DO CAHORRO -----");
        System.out.println("Nome:" +this.nome+
                "\nTamanho: " + this.tamanho +
                "\nPeso: " + this.peso +
                "\nCor: " + this.cor +
                "\nIdade: " + this.idade +
                "\nRaça: " + this.raca +
                "\nSexo: " + this.sexo +
                "\nFilhotes : " + this.filhotes +
                "\n*----Histório das vacinas tomadas: ----* ");
        for (int i = 0; i < this.vacinas.length; i++) {
            if(this.vacinas[i] != null) {
                System.out.println(this.vacinas[i].getNome());
                System.out.println("Data de aplicação da vacina: " + vacinas[i].getDataAplicacao());
            }
        }
    }
}
