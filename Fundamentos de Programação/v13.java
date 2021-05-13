package vect01;
import java.util.Scanner;
public class v13 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A[]= new int[10];
        int soma=0;
        
        for(int i=0; i<A.length; i++){
            System.out.print("Digite valores pro vetor A a posição " +i+ ": ");
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<A.length; i++){
            if(A[i]%5 ==0){
                soma += A[i];
            }
        }
        
        System.out.print("VETOR A: ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");            
        }
        System.out.println();

        System.out.println("soma: " + soma);
    }
}
