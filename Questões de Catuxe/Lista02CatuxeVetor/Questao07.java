package lista02catuxevetor;
import java.util.Scanner;
public class Questao07 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int vetNum[] = new int[5];
       int multi=1, soma=0;
       
       for(int i =0; i<vetNum.length; i++){
           System.out.print("Digite um valor para o vetor na posição " +i+ ": ");
           vetNum[i] = sc.nextInt();
       }
       
       for(int i =0; i<vetNum.length; i++){
           multi = multi * vetNum[i];
           soma += vetNum[i];
       }
       
       System.out.println("Mutiplicação: " + multi);
       System.out.println("Soma: " + soma);
       
       System.out.print("Vetor: [");
       for(int i =0; i<vetNum.length; i++){
           System.out.print(vetNum[i] + " ");
       }
       System.out.println("]");
   } 
}
