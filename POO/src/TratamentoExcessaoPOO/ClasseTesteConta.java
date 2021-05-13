package TratamentoExcessaoPOO;
public class ClasseTesteConta {
    public static void main(String[] args) {
        Conta conta = new Conta("031", 9, 1000, "95107");
        ContaPoupanca Poupanca = new ContaPoupanca("053", 5, 50, "1256", 0.6);
        ContaEspecial Especial = new ContaEspecial("0", 3, 60, "9841", 50, 0.5);

        System.out.println("BEM-VINDO!");
        System.out.println("Aqui é sua conta Poupança:");

        Poupanca.autenticar("1256");
        Poupanca.depositar(20);
        //Poupanca.sacar(54.2);  ---> Não tá rodando por causa daexception :(
        Poupanca.calcularRendimento();
        System.out.println(Poupanca);

        System.out.println();

        System.out.println("Aqui é sua conta Especial:");
        Especial.debitarJuros();
        Especial.autenticar("9841");
        System.out.println(Especial);

    }
}
