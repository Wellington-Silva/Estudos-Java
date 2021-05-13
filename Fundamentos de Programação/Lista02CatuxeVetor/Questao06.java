package lista02catuxevetor;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double notas[] = new double[10];
        int alunos[] = new int[10];
        double media[] = new double[10];
        int contMaior7 = 0;
        double soma=0;
        
        for(int i=0; i<alunos.length; i++){
            for(int j=0; j<notas.length; j++){
                System.out.print("Digite a nota " +(j+1)+ "º: ");
                notas[j] = sc.nextDouble(); 
                
                soma += notas[j];
            }
            System.out.println("--------------------------------------");
            if (media[i] >= 7){
                contMaior7++;
            }   
            soma = 0;                     
        }
        System.out.println();
        
        System.out.print("Vetor Alunos: ");
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Média do alunos "+(i+1)+": "+(media[i]));
        }
        System.out.println();
        
        System.out.println("Quantidade de alunos com média maior ou igual a 7: "+(contMaior7));             
    }    
}
