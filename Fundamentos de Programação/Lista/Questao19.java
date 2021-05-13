package questao19;

import java.util.Scanner;

public class Questao19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double media = 0;
        int num = 0, cont = 0, contNum = 0;        
              
        while(num >= 0){
            System.out.println("Digite Valores Inteiros Positivos: ");
            num = sc.nextInt();
            contNum = contNum +1;
            if(num >= 0){
                cont = cont + 1;
            }
        }
        media = ((contNum + cont)/ cont);
        System.out.println("Número: " + contNum);
        System.out.println("O contador é: " + cont);
        System.out.println("Média: " + media);       
    }   
}
