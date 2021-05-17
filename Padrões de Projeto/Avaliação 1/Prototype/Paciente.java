package ifs.padrões_de_projeto.Prototype;

public class Paciente implements Prototype{
    private String nome;
    private char sexo;
    private String cor;
    private int idade;

    public Paciente(String nome, char sexo, String cor){
        this.nome = nome;
        this.sexo = sexo;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int calcularIdade(int ano) throws Exception {
        //ano = ano de nascimento vai ser subtraído para dar a idade
        if (ano > 2021) throw new Exception("Ano de nascimento inválido!");
        idade = 2021 - ano;
        System.out.println("A idade do pasciente é: " + ano);
        return idade;
    }

    @Override
    public Prototype clone() {
        Paciente paciente = new Paciente("Carlos", 'M', "Pardo");
        paciente.setNome(nome);
        paciente.setCor(cor);
        paciente.setSexo(sexo);
        paciente.setIdade(idade);
        System.out.println("Clone concluído com sucesso!");
        return this;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
