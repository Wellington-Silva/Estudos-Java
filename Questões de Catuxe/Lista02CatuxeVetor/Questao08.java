package lista02catuxevetor;
import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo
        //vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
        
        int idade [] = new int[5];
        float altura [] = new float[5];
        
        for(int i=0; i<idade.length; i++){
            System.out.print("IDADE: ");
            idade[i] = sc.nextInt();
        }
        
        for(int i=0; i<altura.length; i++){
            System.out.print("ALTURA: ");
            altura[i] = sc.nextFloat();
        }
        
        System.out.print("Vetor idade: [");
        for(int i = idade.length -1; i >= 0; i--){
            System.out.print(idade[i] + " ");
        }
        System.out.println("]");
        
        System.out.print("Vetor altura: [");
        for(int i = altura.length -1; i >= 0; i--){
            System.out.print(altura[i] + " ");
        }
        System.out.println("]");
    }
}
