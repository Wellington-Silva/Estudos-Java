package listacatuxematrizes;
import java.util.Random;
import java.util.Scanner;
public class ListaCatuxeMatrizes {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Qual o tamanho da linha? ");
        int linha = sc.nextInt();
        System.out.println("Qual o tamanho da coluna? ");
        int coluna = sc.nextInt();
        int vetor[] = new int[coluna];
        int matriz[][] = new int[linha][coluna];
        int aux=0;
        // Preenchendo a Matriz Aleatoriamente
        for(int i = 0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                matriz[i][j] = random.nextInt(linha);
            }            
        }        
        // Ordenar para ordem crescente
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if(matriz[0][j] > matriz[i][0]){
                    aux = matriz[0][j];
                    matriz[0][j] = matriz[0][j];
                    matriz[0][j] = aux;
                }
            }
        }       
        System.out.println("Matriz ordenada: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print(matriz[i][j] + " ");    
            }
            System.out.println();
        }
        // Soma das colunas
        int somaCol=0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                somaCol += matriz[i][j];
                vetor[i] = somaCol;
            }
        }               
        System.out.println("Vetor soma das Colunas: ");
        for(int i=0; i<matriz.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }    
}
