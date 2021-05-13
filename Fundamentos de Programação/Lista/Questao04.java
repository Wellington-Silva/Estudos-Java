package questao04;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dif = 0;
        
        System.out.println("Digite n1: ");
        int n1 = sc.nextInt();

        System.out.println("Digite n2: ");
        int n2 = sc.nextInt();

        System.out.println("Digite n3: ");
        int n3 = sc.nextInt();
        
        if (n1 > 0){
            System.out.println("Raiz Quadrada de n1: " + (Math.sqrt(n1)));
        }
        else {
            System.out.println("Quadrado de n1: " + (Math.pow(n1,2)));
        }
        if (n2 > 10 && n2 < 100){
            System.out.println("Número está entre 10 e 100 – intervalo permitido");
        }
        else if (n3 < n2){
            dif = (n2 - n3);
            System.out.println("A diferença entre número " + n3 + "e o " + n2 + "é: " + dif);
        } else {
            System.out.println("n3 + 1" + (n3+1));
        }
    }
    
}
