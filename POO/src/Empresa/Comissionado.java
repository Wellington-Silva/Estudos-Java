package Empresa;
public class Comissionado extends Empregado {
    private double vendas; // Aqui vai armazenat o valor total de vendas realizadas pelo comissionado

    public Comissionado(String nome, String sobrenome, int numIdent, int vendas) {
        super(nome, sobrenome, numIdent);
        this.vendas = vendas;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public double getValorAPagar() {
        return getVendas()*0.06;
    } // recebem 6% sobre suas vendas;

    public String toString() {
        return "Comissionado: R$" + getValorAPagar();
    }
}
