package vect01;
import java.util.Scanner;
public class v15 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //Define o percentual de elementos pares e impares de A. 
        
        int A[] = new int[10];
        
        for(int i=0; i<A.length; i++){
            System.out.print("Insira valores para A na posição " +i+ ": ");
            A[i] = sc.nextInt();
        }
        
        double PercentPar=0.0, PercentImpar=0.0;
        double par=0, impar=0;
        for(int j=0; j<A.length; j++){
            if(A[j] % 2 == 0){
                par++;
            } else{
                impar++;
            }
        }
        
        //Uma Parte*100 / Geral
        PercentPar = (par*100)/A.length;
        PercentImpar = (impar*100)/A.length;
        
        System.out.print("Vetor A: ");
        for(int w=0; w<A.length; w++){
            System.out.print(A[w] + " ");
        }
        System.out.println();
        
        System.out.println("Percentual de valores Pares do Vetor A: " + PercentPar + "%");
        System.out.println("Percentual de valores impares do Vetor A: " + PercentImpar + "%"); 
    }
}
