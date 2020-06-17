package questao40;
import java.util.Scanner;
public class Questao40 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int pequeno, media, grande;
        double valorP, valorM, valorG, total;

        System.out.println("Digite a quantidade de camisetas pequenas: ");
        pequeno = sc.nextInt();
        System.out.println("Digite a quantidsade de camisetas médias: ");
        media = sc.nextInt();
        System.out.println("Digite a quantidade de camisetas grandes: ");
        grande = sc.nextInt();

        valorP = pequeno * 10;
        valorM = media * 12;
        valorG = grande * 15;
        total = valorP+valorM+valorG;

        System.out.printf("VALOR TOTAL ARRECADADO: R$ %.2f %n", total);
    }    
}
