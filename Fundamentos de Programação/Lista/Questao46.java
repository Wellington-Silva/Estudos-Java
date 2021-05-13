package questao46;
import java.util.Scanner;
public class Questao46 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double Felipe, total, valorTotal;
        
        System.out.print("Digite o valor total da Conta: ");
        total = sc.nextDouble();
        
        valorTotal = (int) total/3;
        Felipe = total - (valorTotal + valorTotal);
        
        System.out.printf("O valor que Carlos deve pagar é: R$ %.2f %n ", valorTotal);
        System.out.printf("O valor que André deve pagar é: R$ %.2f %n ", valorTotal);
        System.out.printf("O valor que Felipe deve pagar é: R$ %.2f %n ", Felipe);
    }   
}
