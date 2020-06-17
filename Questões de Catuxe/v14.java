package vect01;
import java.util.Scanner;
public class v14 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A[]= new int[10];
        
        for(int i=0; i<A.length; i++){
            System.out.print("Digite valores pro vetor A a posição " +i+ ": ");
            A[i] = sc.nextInt();
        }
        
        int soma=0;
        int impar=0;
        
        for(int i=0; i<A.length; i++){
            if(A[i]%2 != 0){
                soma += A[i];
                impar++;
            }
        }
        
        System.out.print("VETOR A: ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");            
        }
        System.out.println();
        System.out.println("Média: " + soma/impar);
    }
}
