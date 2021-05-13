package questao34;
import java.util.Scanner;
public class Questao34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opniao;
        int idade=0, qtdA=0, qtdC=0, percentAeC=0, contIdade=0, maiorIdadePessimo=0, diferenca;
        int  maiorIdadeBom=0, maiorIdadeRuim=0, difMaioreMenor=0, contPessimo=0, porcentPess=0;
        double  medIdade=0;               
        
        for(int i=0; i<199; i++){
            
            System.out.print("Qual sua idade? = ");
            idade = sc.nextInt();
        
            System.out.print("Opinião: A-Ótimo, B-Bom, C-Regular, D-Ruim, E-Péssimo = ");
            opniao = sc.next();
            
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=");
            
            //Pessoas que Responderam Ótimo
            if(opniao.equalsIgnoreCase("A")){
                qtdA++;
                if(maiorIdadeBom < idade){
                    maiorIdadeBom = idade;
                }
            }
            // Pessoas que Responderam Regular
            if(opniao.equalsIgnoreCase("C")){
                qtdC++;
            }
            //Pessoas que responderam Ruim
            if(opniao.equalsIgnoreCase("D")){
                contIdade = idade;
                if(maiorIdadeRuim < idade){
                    maiorIdadeRuim = idade;
                }
            }
            //Pessoas que responderam Péssimo
            if(opniao.equalsIgnoreCase("E")){
                contPessimo++;
                if(maiorIdadePessimo < idade){
                    maiorIdadePessimo = idade;
                }
            }
        }
        
        //Porcentual de diferença entre Bom e Regular
        diferenca = qtdA-qtdC;
        percentAeC = (diferenca/100); // Eu tô ligado que não é assim KKK
        
        //Média de idade das pessoas que responderam Ruim
        medIdade = (contIdade+idade)/100; // Eu tô ligado que não é assim KKK
        
        //A porcentagem de respostas péssimo e a maior idade que utilizou esta opção
        porcentPess = (contPessimo/100)*contPessimo; // Eu tô ligado que não é assim KKK
        
        //A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim
        difMaioreMenor = maiorIdadeBom-maiorIdadeRuim;
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=");
        System.out.println("RESPOSTAS: ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=");
        
        System.out.println("LETRA A: ");
        System.out.println("Quantidade de respostas A: " + qtdA);
        
        System.out.println("LETRA B: ");
        System.out.println("Percentual de diferença entre Bom e Regular: " + percentAeC + "%");
        
        System.out.println("LETRA C: ");
        System.out.println("A média de idade das pessoas que responderam Ruim: " + medIdade);
        
        System.out.println("LETRA D: ");
        System.out.println("A porcentagem de respostas péssimo: " + porcentPess + ". Maior idade para Péssimo: " + maiorIdadePessimo);
        
        System.out.println("LETRA E: ");
        System.out.println("A diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim " + difMaioreMenor);
    }        
}
