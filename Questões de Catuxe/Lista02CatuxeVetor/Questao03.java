package lista02catuxevetor;
import java.util.Scanner;
public class Questao03 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota[] = new double[4];
        double soma=0;
        double media = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.print("DIgite valores pra o vetor na posição " +i+ ": ");
            nota[i] = sc.nextDouble();
        }

        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
        }
        media = soma/4;

        for (int i = 0; i < nota.length; i++) {
            System.out.print(nota[i] + " ");
        }
        System.out.println();

        System.out.println("Média: " + media);
    }    
}
