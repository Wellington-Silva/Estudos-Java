package Escola;
public class Professor {
    public String matricula;
    public String nome;
    public String cpf;
    public String admissao;
    public String email;
    public Curso lotacao;
    
    public void informarDados(String pMatricula, String pNome, String pCpf, String pAdmissao, String pEmail, Curso pLotacao) {
        this.nome = pNome;
        this.cpf = pCpf;
        this.matricula = pMatricula;
        this.email = pEmail;
        this.admissao = pAdmissao;
        this.lotacao = pLotacao;
    }
    
    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("E-mail: " + this.email);
        System.out.println("Admissão: " + this.admissao);
        System.out.println("Lotação: " + this.lotacao);
    }
}
