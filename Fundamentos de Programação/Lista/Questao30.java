package questao30;
import java.util.Scanner;
public class Questao30 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n, Fn = 0, cont=0;
       
       System.out.print("Digite um Número: ");
       n = sc.nextInt();
       
       do{
           Fn = cont*cont;
           System.out.println(Fn);
           cont++;
       }while(cont< n);
       
    }
}

