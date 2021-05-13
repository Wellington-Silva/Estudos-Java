package condiextresudemy;

import java.util.Scanner;
import java.util.Locale;
public class CondiExTresUdemy {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int cod;
        float quant;
        
        cod = sc.nextInt();
        quant = sc.nextInt();
        
        double total = 0;
        
        if (cod == 1){
           total = quant * 4.00; 
        } 
        else if (cod == 2){
           total = quant * 4.50;
        }
        if(cod == 3){
           total = quant * 5.00;
        }
        if (cod == 4){
           total = quant * 2.00;
        }
        if (cod ==5 ){
           total = (quant * 1.50);
        }
        
        System.out.printf("Total: R$ %.2f%n", total);
        
        sc.close();
                
    }
    
}
