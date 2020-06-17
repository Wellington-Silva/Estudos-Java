package exvetor;
import java.util.Scanner;
public class ExVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num=0, soma=0;
        double altura, media;
        String parada;
        
        System.out.print("Digite um número: ");
        num = sc.nextByte();
        double[] vector = new double [num];
        
        for(int i=0; i<num; i++){           
            System.out.print("Altura: ");
            vector[i] = sc.nextDouble();        
        }
        
        for(int i=0; i<num; i++){
            soma += vector[i];
        }
        media = soma/num;
        
        System.out.printf("A média de altura das pessoas é: %.2f%n", media);
        
    }    
}
