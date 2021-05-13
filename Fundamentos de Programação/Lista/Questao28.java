package questao28;
import java.util.Scanner;
public class Questao28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int N, cont=0;       
        System.out.print("Digite um Número: ");
        N = sc.nextInt();       
        for(int i=1; i < N; i++){
            if(N % i == 0){
                 cont++;
            }
            if(cont >= 2){
                System.out.println("O valor " + N + " é um número primo");
            }
            else{
                System.out.println("O valor " + i + " NÃO é um número primo");
            }
        }
    }    
}
