 package questao33;
import java.util.Scanner;
public class Questao33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, ... ..
        System.out.println("Digite a quantidade de termos");
        int qtd = sc.nextInt();
        int n1 = 1;
        int n2 = 1;
        qtd = qtd - 2;
        while (qtd > 0) {
        System.out.println((n1+n2) + " ");
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            qtd--;
        }
        System.out.println("Fim");
    }    
}
