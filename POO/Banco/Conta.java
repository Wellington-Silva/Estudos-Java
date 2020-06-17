package Banco;
public class Conta {
    // Atributos
    public Cliente titular = new Cliente();
    public String numero;
    public String agencia;
    public String dataAbertura;
    public Cliente dependentes[] = new Cliente[2]; 
    public float saldo;
    float rend = 0; // Variável para calcular o rendimento
    String depositar = null; 
    // Métodos 
    public void sacar(float valor) {              
        if(saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" +this.saldo+ " realizado com sucesso");
        } else {
            System.out.println("Não é possível sacar esta quantia");
        }
    }
    
    public void depositar(float pValor) {
        this.saldo += pValor;
        System.out.println("Seu deposito de " +pValor+ " foi feito com sucesso");
    }
    
    public void addDependente(Cliente pDependente) {
        for(int i=0; i<dependentes.length; i++) {
            if(dependentes[i] == null) {
                dependentes[i] = pDependente;
                System.out.println("Dependente adicionado!");
                break;
            }
        }
    }
    
    public float calcularRendimento() {
        return saldo * 0.1f;
    }  
    
    public void recuperarDadosParaImpressao() {
        System.out.println("----------CONTA----------");
        System.out.println("Nome: " + this.titular.nome);
        System.out.println("CPF: " + this.titular.cpf);
        System.out.println("Numero: " + this.numero);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Saldo: " + this.saldo);
        for(int i=0; i<dependentes.length; i++) {
            if(dependentes[i] != null) {
                System.out.println("Dependentes: " + dependentes[i].nome + " ");
            }
        }
        System.out.println("-------------------------");
    }
}
