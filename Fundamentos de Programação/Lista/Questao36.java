package questao36;
import java.util.Scanner;
public class Questao36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        double precoLitro, valorPagamento, total;
        
        System.out.print("Preço do Litro: ");
        precoLitro = sc.nextDouble();
        System.out.print("Valor do pagamento: ");
        valorPagamento = sc.nextDouble();
        
        if(valorPagamento >= precoLitro){
            total = precoLitro - valorPagamento;
            System.out.println("Foram colocados " + total+"L");
        } else{
            System.out.println("Dinheiro Insuficiente");
        }
    }    
}
