package miniprovaquestao02;
import java.util.Random;
public class MiniprovaQuestao02 {
    public static void main(String[] args) {
        Random random = new Random();       
        int dado1[] = new int[36000];
        int dado2[] = new int[36000];
        int vetSoma[] = new int[11];
        int maiorFreq=0, menorFreq=40000, qtdRepetMaior=0, qtdRepetMenor=0; 
        double porcentMaior = 0, porcentMenor=0;
        
        //Lançamentos do 1º dado e do 2º dado
        for(int i=0; i<dado1.length; i++){
            dado1[i] = random.nextInt(6)+1;
            dado2[i] = random.nextInt(6)+1;
        }       
        
        //Colocando valores nas posições do "VetSoma"
        int soma = 0;
        for(int i=0; i<dado1.length; i++){
            soma = dado1[i] + dado2[i];
            if(soma == 2){
                vetSoma[0]++;
            } else if(soma == 3){
                vetSoma[1]++;
            } else if(soma == 4){
                vetSoma[2]++;
            } else if(soma == 5){
                vetSoma[3]++;
            } else if(soma == 6){
                vetSoma[4]++;
            }else if(soma == 7) {
                vetSoma[5]++;
            }else if(soma == 8) {
                vetSoma[6]++;
            }else if(soma == 9) {
                vetSoma[7]++;
            }else if(soma == 10) {
                vetSoma[8]++;
            }else if(soma == 11) {
                vetSoma[9]++;
            }else if(soma == 12) {
                vetSoma[10]++;
            }                  
        }      
        
        //Letra C e D
        for(int i=0; i<vetSoma.length; i++){
            if(vetSoma[i] > maiorFreq){
                maiorFreq = vetSoma[i];
                if(maiorFreq == maiorFreq){
                    qtdRepetMaior++;
                 }   
            } else if(vetSoma[i] < menorFreq){
                menorFreq = vetSoma[i];
                if(menorFreq == menorFreq){
                    qtdRepetMenor++;
                }
            } 
        }      
        
        //Cálculo da porcentagem
        int somadovetor = vetSoma[0] + vetSoma[1] + vetSoma[2] + vetSoma[3] + vetSoma[4] + vetSoma[5] + vetSoma[6] + vetSoma[7] + vetSoma[8] + vetSoma[9] + vetSoma[10];
        porcentMaior = (maiorFreq*100)/(somadovetor);
        porcentMenor = (menorFreq*100)/(somadovetor);
        
        //Mostrar Vetor dos resultados
        System.out.print("Resolução: |");
        for (int i = 0; i < vetSoma.length; i++) {
            System.out.print((2+i)+": "+vetSoma[i]+"| ");
        }
        System.out.println();
        
        //Letra C
        System.out.println("A soma mais frequente foi "+maiorFreq+", repetiu "+qtdRepetMaior+" vezes.");
        System.out.printf("A porcentagem é: %.2f", porcentMaior);
        System.out.println("%");
        
        //Letra D
        System.out.println("A soma menos frequente foi "+menorFreq+", repetiu "+qtdRepetMenor+" vezes.");
        System.out.printf("A porcentagem é: %.2f", porcentMenor);
        System.out.println("%");
    }   
}
