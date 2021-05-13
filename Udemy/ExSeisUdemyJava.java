package exseisudemyjava;
import java.util.Locale;
import java.util.Scanner;

public class ExSeisUdemyJava {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner (System.in);
       
       double a = 0, b=0, c = 0, AreaTriangulo, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo;
       float pi = (float) 3.14159; 
       
       a = sc.nextDouble();
       b = sc.nextDouble();
       c = sc.nextDouble();
       
       AreaTriangulo = a * c / 2.0;
       AreaCirculo = (pi * (c*c));
       AreaTrapezio = (a + b) / 2.0 * c;
       AreaQuadrado = b * b;
       AreaRetangulo = a * b;
       
       System.out.printf("TRIÂNGULO: %.3f%n", AreaTriangulo);
       System.out.printf("CÍRCULO: %.3f%n", AreaCirculo);
       System.out.printf("TRAPÉZIO: %.3f%n", AreaTrapezio);
       System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
       System.out.printf("RETÂNGULO: %.3f%n", AreaRetangulo);
            
    }
}
