package TratamentoExcessaoPOO;
public class Conta implements Autenticavel{
    protected String agencia;
    protected int numConta;
    protected double saldo;
    protected String senha;

    public Conta(String agencia, int numConta, double saldo, String senha) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /*-------------------------------------------*/

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Não é possível fazer depósito com valor negativo");
        } else {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu saldo atual é R$" +getSaldo());
        }
    }

    public void sacar(double valor) throws saldoException {
        if(this.autenticar(senha)) {
            if(getSaldo() < valor) {
                throw new saldoException("SALDO INSUFICIENTE - O valor solicitado para saque é maior que o saldo");
            } else {
                double aux = getSaldo() - valor;
                setSaldo(aux);
                System.out.println("Saque realizado!!!");
            }
        }
    }

    @Override
    public boolean autenticar(String Senha) {
        if(this.getSenha().equalsIgnoreCase(Senha)) {
            System.out.println("Validação de usuário concluida!");
            return true;
        }
        System.out.println("Senha incorreta!");
        return false;
    }
}
