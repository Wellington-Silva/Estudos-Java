package listacatuxematrizes;
import java.util.Random;
import java.util.Scanner;
public class Ques03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("Tamanho do vetor:");
        int tam = sc.nextInt();       
        int vet[] = new int[tam];
        int invertido[] = new int[tam];
        
        //Preenchendo o vetor
        for(int i=0; i<vet.length; i++){
            vet[i] = ran.nextInt(10);
        }
        
        System.out.print("Vetor Original: [");
        for(int i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("Vetor na ordem inversa: [");
        for (int i = vet.length-1; i >= 0; i--) {
            System.out.print(vet[i]+" ");
        }
        System.out.println("]");
        
    }
}
