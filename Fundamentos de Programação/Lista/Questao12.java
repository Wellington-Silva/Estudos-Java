package questao12;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);       
        System.out.print("Digite o Saldo Médio: ");
        double salMedio = sc.nextDouble();        
        double percent = 0;
        
        if(salMedio >= 0 && salMedio <= 200){
              percent = 0;
        } else if(salMedio >= 201 && salMedio <= 400){
            // 20% do valor do saldo médio
            percent = salMedio * 0.2;
        } else if(salMedio >= 401 && salMedio <= 600){
            // 30% do valor do saldo médio
            percent  = salMedio * 0.3;
        } else if (salMedio > 600){
            // 40% do saldo médio
            percent = salMedio * 0.4;
        }
        System.out.println("Crédito = R$ " + percent);
    }    
}
