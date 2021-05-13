package TratamentoExcessaoPOO;

public class ContaPoupanca extends Conta {

    private double percRendimento;

    public ContaPoupanca(String agencia, int numConta, double saldo, String senha, double percRendimento) {
        super(agencia, numConta, saldo, senha);
        this.percRendimento = percRendimento;
    }

    public double getPercRendimento() {
        return percRendimento;
    }

    public void setPercRendimento(double percRendimento) {
        this.percRendimento = percRendimento;
    }

    public void calcularRendimento() {
        double taxaRendimento = getSaldo() * this.percRendimento;
        double adicao = getSaldo() + taxaRendimento;
        setSaldo(adicao);
    }

    public String toString(){
        return "Saldo da conta poupança: R$ "+ getSaldo();
    }
}
