package condiexdoisudemy;
import java.util.Scanner;
public class CondiExDoisudemy {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int HInical = 0, HFinal = 0;
        
        int HInicial = sc.nextInt();
        HFinal = sc.nextInt();
        
        int  Duração;
        
        if (HInicial < HFinal){
            Duração = (int) (HFinal - HInicial);
        } else {
            Duração = 24 - HInical + HFinal;
        }
        
        System.out.println("O JOGO DUROU " + Duração + " HORA(S)");
        
        sc.close();
    }
    
}
