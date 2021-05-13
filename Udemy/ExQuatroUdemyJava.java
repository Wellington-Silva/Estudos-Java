
package exquatroudemyjava;

import java.util.Locale;
import java.util.Scanner;

public class ExQuatroUdemyJava {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int nFunci, nHoras;
        double vHora, salario;
        
        System.out.print("");
        nFunci = sc.nextInt();
        
        System.out.print("");
        nHoras = sc.nextInt();
        
        System.out.print("");
        vHora = sc.nextDouble();
        
        salario = (vHora * nHoras);
        
        System.out.println("NUMBER = " + nFunci);               
	System.out.printf("SALARY = U$ %.2f%n", salario);
		
        sc.close();
    }
    
}
