package lista02catuxevetor;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Geral[] = new int[10];
        int par[] = new int[10];
        int impar[] = new int[10];

        for (int i = 0; i < Geral.length; i++) {
            System.out.print("Digite Valores para o vetor na posição " +i+ ": ");
            Geral[i] = sc.nextInt();
        }
        int contPar=0;
        int contImpar=0;
        for (int i = 0; i < Geral.length; i++) {
            if(Geral[i]%2==0){
                par[i] = Geral[i];
                contPar++;
            }else{
                contImpar++;
                impar[i] = Geral[i];
            }
        }
        
        System.out.print("Vetor Geral ");
        for(int i=0; i < Geral.length; i++){
            System.out.print(Geral[i] + " ");
        }
        System.out.println(); 
        
        System.out.print("Vetor Par ");
        for(int i=0; i < contPar; i++){
            System.out.print(par[i] + " ");
        }
        System.out.println(); 
        
        System.out.print("Vetor Impar ");
        for(int i=0; i < contImpar; i++){
            System.out.print(impar[i] + " ");
        }
        System.out.println(); 
    }
}
