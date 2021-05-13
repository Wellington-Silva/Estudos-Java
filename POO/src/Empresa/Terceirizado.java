package Empresa;
public class Terceirizado extends Empregado{
    private int horasTrabalhadas;

    public Terceirizado(String nome, String sobrenome, int numIdent, int horasTrabalhadas) {
        super(nome, sobrenome, numIdent);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double getValorAPagar() {
        //Considerando 160 horas de trabalhado mensal
        //Considerando que sejam 40 horas na semana
        return getHorasTrabalhadas() * (ControlePagamento.SALARIO/160) ;
    }

    public String toString() {
        //return "Terceirizado: \n"+super.toString()+"\nSalario a receber: "+getValorAPagar();
        return "Terceirizado: R$" + getValorAPagar();
    }
}
