package whileudemyexdois;

import java.util.Locale;

import java.util.Scanner;

public class WhileUdemyExDois {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        System.out.print("Digite um número:");
        x = sc.nextDouble();
 
        System.out.print("Digite um número:");
        y = sc.nextDouble();
        
        while (x != 0.0 && y != 0.0){
            if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                         x = sc.nextDouble();
                        System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                        x = sc.nextDouble();      
                         System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                        x = sc.nextDouble();        
                         System.out.print("Digite um número:");
                         y = sc.nextDouble();
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Primeiro");
                        System.out.print("-------------------");
                        System.out.print("Digite um número:");
                        x = sc.nextDouble();
                        System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Segundo");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                         x = sc.nextDouble();
                        System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Terceiro");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                        x = sc.nextDouble();     
                        System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		else {
			System.out.println("Quarto");
                        System.out.println("-------------------");
                        System.out.print("Digite um número:");
                        x = sc.nextDouble();
                        System.out.print("Digite um número:");
                        y = sc.nextDouble();
		}
		
        }
    }
    
}
