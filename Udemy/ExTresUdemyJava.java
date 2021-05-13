
package extresudemyjava;

import java.util.Scanner;

public class ExTresUdemyJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int d;
        
        System.out.print("");
        a = sc.nextInt();
                
        System.out.print("");
        b = sc.nextInt();
         
        System.out.print("");
        c = sc.nextInt();
         
        System.out.print("");
        d = sc.nextInt();
        
        int diferença = ((a * b) - (c * d));
        
        System.out.println("DIFERENÇA = " + diferença);
    }
    
}
