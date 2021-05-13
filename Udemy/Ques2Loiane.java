package matrizes;
import java.util.Random;
public class Ques2Loiane {
    public static void main(String[] args) {
        Random random = new Random();
        int M[][] = new int[10][10];

        // Entrada de dados aleatóriamente
         for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i][j]; j++) {
                M[i][j] = random.nextInt(100);
            }
        }
        // Maior e menor valor da linha 5 da Matriz M 
        int maiorL5 = 0, menorL5 = 101, linha5=5;
        for (int i=0; i<M[linha5].length; i++) {
            if (M[5][i] > maiorL5) {
                maiorL5 = M[5][i];
            }
            if (M[5][i] < menorL5) {
                menorL5 = M[5][i];
            }
        }
        // Maior e menor valor da coluna 7 da Matriz M
        int maiorC7 = 0, menorC7 = 101, coluna7=7;
        for (int i = 0; i < M.length; i++) {
            if (M[i][7] > maiorC7) {
                maiorC7 = M[i][7];
            }
            if (M[i][7] < menorC7) {
                menorC7 = M[i][7];
            }
        }
        // Imprimir a Matriz M 
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i][j]; j++) {
                System.out.print(M[i][j] + " | ");
            }
            System.out.println();
        }
        // Imprenssões dos maiores e menores valores da linha 5 e coluna 7
        System.out.println("---------------------------");
        System.out.println("---- Linha 5 ----");
        System.out.println("Maior número: " + maiorL5);
        System.out.println("Menor número: " + menorL5);
        System.out.println();
        System.out.println("---- Coluna 7 ----");
        System.out.println("Maior número: " + maiorC7);
        System.out.println("Menor número: " + menorC7);
    }
}
