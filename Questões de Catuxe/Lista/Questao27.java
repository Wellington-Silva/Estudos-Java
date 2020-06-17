package questao27;
import java.util.Scanner;
public class Questao27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, cont=1;
        
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        for(int i=1; i<num; i++){
             if(num % i == 0){
                System.out.println(cont + " é divisivel  " + num);
            } 
            cont++;
        }
    }    
}
