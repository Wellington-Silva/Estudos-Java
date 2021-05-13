package Empresa;
public class AssalariadoComissionado extends Comissionado {

    public AssalariadoComissionado(String nome, String sobrenome, int numIdent, int vendas) {
        super(nome, sobrenome, numIdent, vendas);
    }

    @Override
    public double getValorAPagar() {
        return super.getValorAPagar() + ControlePagamento.SALARIO + (ControlePagamento.SALARIO * 0.10);
    } // retorna o salário-base mais uma porcentagem sobre as vendas

    public String toString() {
        return "Assalariado Comissionado: R$" + getValorAPagar();
    }
}
