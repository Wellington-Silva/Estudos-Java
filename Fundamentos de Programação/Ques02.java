package listacatuxematrizes;
import java.util.Random;
import java.util.Scanner;
public class Ques02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        
        System.out.println("Tamanho do vetor:");
        int tam = sc.nextInt();       
        int vet[] = new int[tam];
        int repet[] = new int[tam];
        
        //Preenchendo o vetor
        for(int i=0; i<vet.length; i++){
            vet[i] = ran.nextInt(10);
        }
        
        // Identificar os valores repetidos
        // Colocar os valores repetidos dentro de outro vetor e removê-los do original
        for(int i=0; i<vet.length; i++){
            if(vet[i] == i+1){
                repet[i] = vet[i];
            }
        }
        
        System.out.println("Vetor Original");
        for(int i=0; i<vet.length; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        
        System.out.println("Vetor com repetições");
        for(int i=0; i<vet.length; i++){
            System.out.print(repet[i] + " ");
        }
        System.out.println();
    }
}
