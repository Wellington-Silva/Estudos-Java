package matrizes;
import java.util.Scanner;
public class CacaPalavras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char matriz[][] = {{'G', 'W', 'O', 'R', 'D'},
                            {'R', 'A', 'E', 'B', 'P'},
                            {'F', 'L', 'M', 'N', 'L'},
                            {'U', 'L', 'P', 'E', 'A'},
                            {'N', 'E', 'A', 'S', 'Y'}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Digite a palavra a ser procurada: ");
        String word = sc.next();
        while (word.length() > 5) {
            System.out.println("A palavra tem que possuir no máximo 5 caractéres");
            System.out.println("Por favor, digite novamente: ");
            word = sc.next();
        }

        word = word.toUpperCase();

        char vetor[] = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            vetor[i] = word.charAt(i);
        }

        int cont = 0;
        int linha = -1;
        int coluna = -1;
        boolean encontradaHorizontal = false;

        // Palavra encontrada horizontalmente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (vetor[cont] == matriz[i][j]) {
                    linha = i;
                    coluna = j;
                    encontradaHorizontal = true;
                    cont++;
                } else {
                    encontradaHorizontal = false;
                    cont = 0;
                    linha = -1;
                    coluna = -1;
                }

                if (encontradaHorizontal && cont == vetor.length) {
                    break;
                } else {
                    encontradaHorizontal = false;
                }
            }
            if (encontradaHorizontal) {
                break;
            }
        }

        if (encontradaHorizontal) {
            System.out.println("Palavra encontrada Horizontal");
            System.out.println("[linha,coluna] inicial: " + "[" + linha + "," + (coluna - word.length() + 1) + "]");
            System.out.println("[linha,coluna] final: " + "[" + linha + "," + coluna + "]");

        }

        cont = 0;
        linha = -1;
        coluna = -1;
        boolean encontradaVertical = false;

        // Palavra encontrada verticalmente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (vetor[cont] == matriz[j][i]) {
                    linha = j;
                    coluna = i;
                    encontradaVertical = true;
                    cont++;
                } else {
                    encontradaVertical = false;
                    cont = 0;
                    linha = -1;
                    coluna = -1;
                }

                if (encontradaVertical && cont == vetor.length) {
                    break;
                } else {
                    encontradaVertical = false;
                }
            }
            if (encontradaVertical) {
                break;
            }
        }

        if (encontradaVertical) {
            System.out.println("Palavra encontrada Vertical");
            System.out.println("[linha,coluna] inicial: " + "[" + (linha - word.length() + 1) + "," + coluna + "]");
            System.out.println("[linha,coluna] final: " + "[" + linha + "," + coluna + "]");
        } else {
            System.out.println("A palavra não foi encontrada");
        }   
    }
}
