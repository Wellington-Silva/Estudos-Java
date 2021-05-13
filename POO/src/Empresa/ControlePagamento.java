package Empresa;
import java.util.ArrayList;
import java.util.Calendar;
public class ControlePagamento {

    public static final double SALARIO = 954.00;
    public static final double HORA = 8.00;

    public ArrayList<Pagavel> contasPagaveis = new ArrayList<Pagavel>();
    public ArrayList<Pagavel> empregPagaveis = new ArrayList<Pagavel>();

    Calendar c = Calendar.getInstance();
    Assalariado assalariado;

    public void setContasPagaveis(Titulo title, Concessionaria conss) {
        this.contasPagaveis.add(title);
        this.contasPagaveis.add(conss);
    }

    public void setEmpregPagaveis(Assalariado assalariado, Terceirizado terceirizado, Comissionado comissionado, AssalariadoComissionado assalariadoComissionado) {
        this.empregPagaveis.add(assalariado);
        this.empregPagaveis.add(terceirizado);
        this.empregPagaveis.add(comissionado);
        this.empregPagaveis.add(assalariadoComissionado);
    }

    public void Relatorio() {
        double somaConta = 0;
        double somaEmpreg = 0;

        for (Pagavel pa: contasPagaveis) {
            if(pa != null) {
                System.out.println(pa.getValorAPagar());
                somaConta += pa.getValorAPagar();
            }
        }

        for (Pagavel empregPag : empregPagaveis) {
            if (empregPag != null) {
                somaEmpreg += empregPag.getValorAPagar();
            }
        }

        int mes = c.get(Calendar.MONTH) + 1;
        System.out.println("******* RELATÓRIO MENSAL *******");
        System.out.println("Relatório do MÊS: " + mes +
                "\nRelatório do ANO: " + c.get(Calendar.YEAR));

        System.out.println("Soma dos empregados: " + somaEmpreg);
        System.out.printf("Soma das contas: %.2f\n", somaConta);
        System.out.printf("Soma TOTAL: %.2f\n", somaEmpreg + somaConta);

        System.out.println("-----------------------------****-----------------------------");
    }
}
