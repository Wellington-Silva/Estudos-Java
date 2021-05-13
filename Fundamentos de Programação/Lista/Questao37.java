package questao37;
import java.util.Scanner;
public class Questao37 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        37 . O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que
        leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a balança já desconte o peso do prato.
        */
        double quilo = 12.00, precoTotal = 0;
        int pesoPrato, cont=0;
        
        System.out.print("Peso do Prato (kg): ");
        pesoPrato = sc.nextInt();
        
        if(pesoPrato >= 1){
            for(int i=0; i<pesoPrato; i++){
                cont++;
            }
        } 
        precoTotal = (quilo*cont);
        System.out.printf("Preço do Prato: R$ %.2f %n ", precoTotal);
    }    
}

/*
if(pesoPrato >= 1){
    cont++
}
precoTotal = quilo*pesoPrato;
*/
