package Empresa;
import java.util.ArrayList;

public class Assalariado extends Empregado{
    private int horaTrabalhadasSemanais;
    private ArrayList<Integer> horasSemanais = new ArrayList<Integer>();

    public Assalariado(String nome, String sobrenome, int numIdent) {
        super(nome, sobrenome, numIdent);
    }

    public void setHorasSemanais(Integer horasSemanais) {
        this.horasSemanais.add(horasSemanais);
    }

    public ArrayList<Integer> getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(ArrayList<Integer> horasSemanais) {
        this.horasSemanais = horasSemanais;
    }


    public int getHoraTrabalhasSemanais() {
        return horaTrabalhadasSemanais;
    }

    @Override
    public double getValorAPagar() {
        int qtdHorasExtra = 0;
        for (int i = 0; i < horasSemanais.size(); i++) {
            if (horasSemanais.get(i) > 40) {
                qtdHorasExtra += horasSemanais.get(i) - 40;
            }
        }
        return (qtdHorasExtra * ControlePagamento.HORA) + ControlePagamento.SALARIO;
        // Aqui retorna o valor total a receber(Salario base + horas extras semanais)
    }

    public String toString() {
        return "Assalariado: R$ "+getValorAPagar();
    }
}
