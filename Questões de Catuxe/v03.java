package vect01;
import java.util.Scanner;
public class v03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int vetA[] = new int[15];
        int vetB[] = new int[vetA.length];

        for (int i=0; i<vetA.length; i++){
            System.out.print("Digite valores para o vetor A na posição " +i+ ": ");
            vetA[i] = sc.nextInt();
            vetB[i] = vetA[i]*vetA[i];
        }
        
        System.out.print("Vetor A: ");
        for(int i=0; i<vetA.length; i++){
            System.out.print(vetA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B: ");
        for(int i=0; i<vetB.length; i++){
            System.out.print(vetB[i] + " ");
        }
        System.out.println();
   }  
}
