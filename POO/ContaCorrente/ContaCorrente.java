package contacorrente;
public class ContaCorrente {
    public static void main(String[] args) {
        
        CC conta = new CC();
        conta.numConta = "123456";
        conta.agencia = "1243";
        conta.especial = true;
        conta.LimiteEspecial = 500;
        conta.saldo = 52.65;
        
        System.out.println("O saldo é R$"+conta.saldo);
        System.out.println("A agênica é "+conta.agencia);
        System.out.println("O número da conta é "+conta.numConta);
        System.out.println("A conta é especial? "+conta.especial);
        if(conta.especial == true){
            System.out.println("O limite da conta especial é "+conta.LimiteEspecial);
        } else{
            System.out.println("A conta não é especial");
        }
    }
}
