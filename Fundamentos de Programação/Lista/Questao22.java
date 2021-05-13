package questao22;
import java.util.Scanner;
public class Questao22 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ident, identVelho = null;
        byte opniao, idade = 0;
        int contOp = 0, contIdade = 0, maiorIdade = 0;
        double porcent = 0, media = 0;
        
        for(int i = 0; i <=199; i++){            
            System.out.print("Idade: ");
            idade = sc.nextByte();            
            System.out.print("identificador: ");
            ident = sc.next();            
            System.out.print("Opnião (0 à 10):");
            opniao = sc.nextByte();            
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-=");
            
            //Cálculo de pessoas que opnaram 10
            if(opniao == 10){
                contOp ++;
            }                                 
            //Cálculo da porcentagem das que opnaram 5 ou menos
            if(opniao <= 5){
                porcent = (contOp*100)/200;
            }
            //Maior idade dos que responderam
            if(idade > maiorIdade){
                maiorIdade = idade;
                identVelho = ident;
            //Contagem da média de idade das pessoas
            contIdade ++;            
            }
        }
        // Cálculo da média de idade das pessoas que responderam
        media = (contIdade/200);
        
        System.out.println("RESPOSTAS");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("LETRA A: ");
        System.out.println("A quantidade de respostas 10 foram: " + contOp);
        
        System.out.println("LETRA B: ");
        System.out.println("A média de idade das pessoas que responderam: " + media);

        System.out.println("LETRA C: ");
        System.out.println("A porcentagem de pessoas que responderam 5 ou menos para a opinião da peça: " + porcent + "%");
        
        System.out.println("LETRA D: ");
        System.out.println("O identificador da pessoa mais velha: " + identVelho + "Maior Idade: " + maiorIdade);
    }    
}
