package listacatuxematrizes;
import java.util.Scanner;
import java.util.Random;
public class Ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int melhor[] = new int[23];
        int jogador = 0, votos = 0;
        double percentual = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0, cont12 = 0, cont13 = 0, cont14 = 0, cont15 = 0, cont16 = 0, cont17 = 0, cont18 = 0, cont19 = 0, cont20 = 0, cont21 = 0, cont22 = 0, cont23 = 0;

        //for(int i = 0; i<melhor.length; i++){            
        //}
        do {
            System.out.println("ENQUETE: Quem foi o melhor jogador? ");
            System.out.println("Número do jogador(0=fim): ");
            jogador = sc.nextInt();
            votos++;

            switch (jogador) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
                case 7:
                    cont7++;
                    break;
                case 8:
                    cont8++;
                    break;
                case 9:
                    cont9++;
                    break;
                case 10:
                    cont10++;
                    break;
                case 11:
                    cont11++;
                    break;
                case 12:
                    cont12++;
                    break;
                case 13:
                    cont13++;
                    break;
                case 14:
                    cont14++;
                    break;
                case 15:
                    cont15++;
                    break;
                case 16:
                    cont16++;
                    break;
                case 17:
                    cont17++;
                    break;
                case 18:
                    cont18++;
                    break;
                case 19:
                    cont19++;
                    break;
                case 20:
                    cont20++;
                    break;
                case 21:
                    cont21++;
                    break;
                case 22:
                    cont22++;
                    break;
                case 23:
                    cont23++;
                    break;
                default:
                    System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                    jogador = sc.nextInt();
            }

        } while (jogador != 0);

        // pedaço*100 / geral
        percentual = (jogador * 100) / (votos);

        System.out.println("Jogador - Votos - %");

    }
}
