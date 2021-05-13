package matrizes;
import java.util.Random;
import java.util.Scanner;
public class Imagem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();    
        
        System.out.println("Tamanho da Linha: ");
        int linha = sc.nextInt();
        System.out.println("Tamanho da coluna: ");
        int coluna = sc.nextInt();
        
        int imagem[][] = new int[linha][coluna];
        int[][] pad = new int[3][3];
        
        // MATRIZ PADRÃO
        pad[0][0] = 0;
        pad[0][1] = 1;
        pad[0][2] = 0;
        pad[1][0] = 1;
        pad[1][1] = 1;
        pad[1][2] = 1;
        pad[2][0] = 0;
        pad[2][1] = 1;
        pad[2][2] = 0;
        
        // Colocando valores na Matriz imagem
        for(int w=0; w<imagem.length; w++){
            for(int x=0; x<imagem.length; x++){
                imagem[w][x] = (int) ran.nextInt(2);
                System.out.print(imagem[w][x] + " | ");
            }
            System.out.println();
        }       
        // Verificando se existe o padrão
        for (int w = 0; w < imagem.length; w++){           
            for (int x = 0; x < imagem.length; x++){                
                if (imagem[w][x] == pad[0][0] && x + 1 < linha){                    
                    if (imagem[w][x+1] == pad[0][1] && x + 2 < linha){                        
                        if (imagem[w][x+2] == pad[0][2] && w + 1 < coluna){                       
                            if (imagem[w+1][x] == pad[1][0] && imagem[w+1][w+1] == pad[1][1] && imagem[w+1][x+2] == pad[1][2] && w + 2 < coluna){                                
                                if (imagem[w+2][x] == pad[2][0] && imagem[w+2][x+1] == pad[2][1] && imagem[w+2][x+2] == pad[2][2]){                                    
                                    System.out.println("Padrão Existente! ");
                                    System.out.println("Linha: " + w + " | Coluna: " + x);
                                }else
                                    System.out.println("O padrão não possui existencia na matriz imagem!");
                            }
                        }
                    }
                }
            }
        }
    }
}
