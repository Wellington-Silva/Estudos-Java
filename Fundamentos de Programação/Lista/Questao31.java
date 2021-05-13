package questao31;
import java.util.Scanner;
public class Questao31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n, cont=1, Fn = 0;
       
       System.out.print("Digite um Número: ");
       n = sc.nextInt();
       
       while(cont < n){
           Fn = cont+3;
           System.out.println(cont + "," + Fn + "," + Fn);
           cont++;
       }
    }    
}
