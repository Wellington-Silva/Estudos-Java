package whileforudemy;

import java.util.Scanner;

public class WhileForudemy {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Digite um valor: ");
            int num = sc.nextInt();
            
            while (num <= 0) {
                System.out.print("N must be positive! Try again: ");
                num = sc.nextInt();
            }
            
            int maior = Integer.MIN_VALUE;
            for (int i = 1; i <= num; i++) {
                System.out.print("Value #" + i + ": ");
                int x = sc.nextInt();
                if (x > maior) {
                    maior = x;
                }
            }
            System.out.println("Higher = " + maior);
        }
    }
    
}
