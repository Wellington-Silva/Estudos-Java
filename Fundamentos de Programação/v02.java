package vect01;
import java.util.Scanner;
public class v02 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
        int A [] = new int [8];
        int B [] = new int [A.length];
        
        for(int i=0; i<A.length; i++){
            System.out.print("Digite elementos para o Vetor A na posição " + i+ ": ");
            A[i] = sc.nextInt();
            B[i] = A[i]*2;
        }
        
        System.out.print("Vetor A: ");
        for(int i=0; i<A.length; i++){
            System.out.println(A[i] + " ");           
        }
        System.out.println();
        
        System.out.print("Vetor B: ");
        for(int i=0; i<B.length; i++){
            System.out.println(B[i] + " ");           
        }
        System.out.println();
    }        
}