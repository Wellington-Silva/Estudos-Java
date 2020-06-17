package lista02catuxevetor;
import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[100];
        int abaixoDeSete[] = new int[num.length]; 
        int total=0, soma=0, acimaDaMedia=0;
        int n=0, w=0;
        float media=0;
        
        /*Acho que isso está errado, pois teria que ser com um while para
        preencher até o valor ser diferente de -1*/
        do{
            System.out.print("Digite um nº: "); 
            n = sc.nextInt();
            
            w = w+1;
            total++;
            soma += num[w];           
           
        } while(n != -1);
        
        /*for(int i=0; i<num.length; i++){
            System.out.println("Digite um número");
            num[i] = sc.nextInt();
            
            if(num[i] == -1){
                break;
            }
            total++;
            soma += num[i];
        }*/
        
        for(int i=0; i<num.length; i++){               
            if(num[i] < 7){
                abaixoDeSete[i] = sc.nextInt();
            }
        }
        media = total/soma;   
        
        for(int i=0; i<num.length; i++){   
            //Quantidade de valores acima da média
            if(num[i] > media){
                acimaDaMedia++;
            }
        }
        
        //Letra A 
        System.out.print("Total de números: " + total);
        
        //Letra B
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        //Letra C
        for(int i=num.length; i>=0; i--){
            System.out.print(num[i]);
        }
        System.out.println();
        
        // Letra D
        System.out.println("Soma dos valores do vetor: " + soma);
        
        //Letra E
        System.out.println("Média dos valores do vetor: " + media);
        
        //Letra F
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        
        //Letra G
        for(int i=0; i<abaixoDeSete.length; i++){
            System.out.print(abaixoDeSete[i] + " ");
        }
        System.out.println("PROGRAMA ENCERRADO");
              
    }
}
