package questao26;
import java.util.Scanner;
public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, c=0, f=1;
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        c = n;
        while(c>0){
            System.out.println(c);
            if(c > 1){
                System.out.println("X ");
            }else{
                System.out.println("= ");
            }
            f = f*c;
            c = c-1;
        }        
       System.out.println(f);
    }
}
