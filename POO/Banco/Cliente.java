package Banco;
public class Cliente {
    public String cpf;
    public String nome;
    public String rg;
    public String endereço;
    
    public void informarDados(String pCpf, String pNome, String pRG, String pEnd) {
        this.cpf = pCpf;
        this.nome = pNome;
        this.rg = pRG;
        this.endereço = pEnd;    
    }
    
    public void alterarEndereco(String pEndereco) {
        this.endereço = pEndereco;
    }
    
    public void imprimirDados() {
        System.out.println("--------INFORMAÇÕES--------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Endereço: " + this.endereço);
        System.out.println("---------------------------");
    } 
}
