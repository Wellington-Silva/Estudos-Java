package TratamentoExcessaoPOO;

public class ContaEspecial extends Conta {

    private double limite;
    private double juros;

    public ContaEspecial(String agencia, int numConta, double saldo, String senha, double limite, double juros) {
        super(agencia, numConta, saldo, senha);
        this.limite = limite;
        this.juros = juros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void debitarJuros() {
        if(getSaldo() < limite) {
            double db = limite - (this.getSaldo()) + this.limite;
            db*= this.juros;
            this.setSaldo((this.getSaldo() + this.limite) - db);
        }
    }

    public String toString(){
        return "Saldo total da conta especial: R$"+ getSaldo();
    }

}
