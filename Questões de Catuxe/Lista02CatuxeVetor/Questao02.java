package lista02catuxevetor;
import java.util.Scanner;
public class Questao02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int vet[] = new int[10];
        
        for(int i=0; i<vet.length; i++){
            System.out.print("Digite valores para o vetor na posição " +i+ ": ");
            vet[i] = sc.nextInt();
        }
        
        System.out.print("Vetor na ordem inversa: ");
        for (int i = vet.length-1; i >= 0; i--) {
            System.out.print(vet[i]+" ");
        }
        System.out.println();
        
    }
}
