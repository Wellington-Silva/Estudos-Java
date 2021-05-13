package Empresa;
public class Titulo extends Conta{
    private int pagamentoDia;
    private int pagamentoMes;

    public Titulo(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    public int getPamentoDia() {
        return pagamentoDia;
    }

    public void setPagementoDia(int PagamentoDia) {
        this.pagamentoDia = pagamentoDia;
    }

    public int getPagementoMes() {
        return pagamentoMes;
    }

    public void setPagementoMes(int pagamentoMes) {
        this.pagamentoMes = pagamentoMes;
    }

    @Override
    public double getValorAPagar() {
        double pagar = 0;

        if (getPamentoDia() > getDia() || getPagementoMes() >= getMes()){
            pagar = (getValor()*0.10)+getValor();
        }else {
            pagar = getValor();
        }

        return pagar;
    } // Aqui quando passa do prazo de pagamento é somado 10% ao salário fixo

    public String toString() {
        return "Titulo: "+getValorAPagar();
    }
}
