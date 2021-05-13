package questoesubiragrupo;
import java.util.Scanner;
public class vet04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa deverá fazer uma busca
        //do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.
        
        int vet[] = new int[10];
        int X=0;
        
        System.out.print("Digite um valor para X: ");
        X = sc.nextInt();
        
        for(int i=0; i<vet.length; i++){
            System.out.print("Digiteum valor para o vetor na posição " +i+ ": ");
            vet[i] = sc.nextInt();
        }
        
       for(int i=0; i<vet.length; i++){
            if(X == vet[i]){
                System.out.println("Valor encontrado na posição " + vet[i]);
            }else{
                System.out.println("O valor " +X+ " não foi encontrado no vetor.");
            }
        }        
    }
}
