package questao03;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num1 = 0, num2 = 0;
        
        System.out.print("Digite um número: ");
        num1 = sc.nextInt();
        
        System.out.print("Digite outro Número: ");
        num2 = sc.nextInt();
        
        if(num1 == num2){
            System.out.println("Números Iguais");
        }
        else{
            if(num1 > num2){
                System.out.println("Maior Número: " + num1);
            }
        }
        
    }
    
}
