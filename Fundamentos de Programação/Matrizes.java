package matrizes;
import java.util.Random;
public class Matrizes {
    public static void main(String[] args) {
       Random random = new Random();
       
       int M[][] = new int [5][5];
       int soma4=0, soma2=0, somaDiag=0, somaPrinc=0, somaSecund=0, SomaGeral=0;
       
       for(int i=0; i<M.length; i++){
           for(int j=0; j<M.length; j++){
                M[i][j] = random.nextInt(50);
                System.out.print(M[i][j] + " | ");
           }
           System.out.println();
       }
       
       //letra A
       for(int j=0; j<M.length; j++){
           soma4 += M[3][j];
       }
       
       //letra B
       for(int j=0; j<M.length; j++){
           soma2 += M[j][1];
       }
       
       //letra C
       for(int i=0; i<M.length; i++){
           somaPrinc += M[i][i];
       }
       
       //letra D
       for(int i=0; i<M.length; i++){
           somaSecund += M[i][4-i];
       }
       
       for(int i=0; i<M.length; i++){
           for(int j=0; j<M.length; j++){
               SomaGeral += M[i][j];
           }
       }
       
        System.out.println("A soma de elementos da linha 4: " + soma4);
        System.out.println("A soma de elementos da coluna 2: " + soma2);
        System.out.println("A soma de elementos da diagonal Principal: " + somaPrinc);
        System.out.println("A soma de elementos da diagonal Secundária: " + somaSecund);
        System.out.println("A soma de todos os elementos da Matriz: " + SomaGeral);
    }
}
