package condiexoitoudemy;

import java.util.Scanner;

import java.util.Locale;

public class CondiExOitoUdemy {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        float renda = sc.nextFloat();
        
        if(renda <= 2.000){
            System.out.println("Isento");
        }
        else{
            float salario = ((renda*8)/2);
            System.out.println("R$" + salario);
        }
        
        
    }
    
}
