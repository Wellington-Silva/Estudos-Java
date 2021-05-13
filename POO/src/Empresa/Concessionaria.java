package Empresa;
public class Concessionaria extends Conta{

    public Concessionaria(int dia, int mes, double valor) {
        super(dia, mes, valor);
    }

    @Override
    public double getValorAPagar() {
        return this.valor;
    } // Aqui não é alterado o salário fixo, portanto só retorna o valor

    public String toString() {
        return "Concessionaria: " + getValorAPagar();
    }
}
