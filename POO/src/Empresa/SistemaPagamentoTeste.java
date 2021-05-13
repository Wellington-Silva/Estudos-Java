package Empresa;
public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        //ControlePagamento controlePagamento;

        System.out.println("******* EMPREGADOS *******");

        Assalariado empreg01 = new Assalariado("Karen","Menezes",189025);
        empreg01.setHorasSemanais(40);
        empreg01.setHorasSemanais(42);
        System.out.println(empreg01);

        Terceirizado empreg02 = new Terceirizado("Joseclecio", "Silveira", 1147157, 20);
        empreg02.toString();
        System.out.println(empreg02);

        Comissionado empreg03 = new Comissionado("Hidelbrando", "Siqueira", 369156, 111);
        empreg03.toString();
        System.out.println(empreg03);

        AssalariadoComissionado empreg04 = new AssalariadoComissionado("Ronaldo", "Alcantara", 852753, 112);
        empreg04.toString();
        System.out.println(empreg04);

        System.out.println();
        System.out.println("******* CONTA *******");

        Concessionaria concessionaria = new Concessionaria(12,01,58);
        System.out.println(concessionaria);

        Titulo title01 = new Titulo(5, 2, 60); //vencimento
        title01.setPagementoDia(1);
        title01.setPagementoMes(5);
        System.out.println(title01);

        System.out.println();
        System.out.println("******* RELATÓRIO *******");

        ControlePagamento controlPagamento = new ControlePagamento();
        controlPagamento.setEmpregPagaveis(empreg01, empreg02, empreg03, empreg04);
        controlPagamento.setContasPagaveis(title01, concessionaria);

        controlPagamento.Relatorio(); // Este método tem o valor total
    }
}
