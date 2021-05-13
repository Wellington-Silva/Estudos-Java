package whileudemyextres;

import java.util.Scanner;

public class WhileUdemyExTres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
        //1.Álcool 2.Gasolina 3.Diesel 4.Fim
        System.out.println("Digite o número do pedido: ");
        int num = sc.nextInt();
        
        int Álcool = 0, Gasolina = 0, Diesel = 0;
        
        while (num != 4) {
 
            if (num == 1) {
                Álcool = Álcool + 1;
            }
            else if (num == 2){
                Gasolina = Gasolina + 1;
            }
            else if (num == 3) {
                Diesel = Diesel + 1;
            }
            System.out.println("Digite o número do pedido: ");
            num = sc.nextInt();         
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("ÁLCOOL :" + Álcool);
        System.out.println("GASOLINA: " + Gasolina);
        System.out.println("DIESEL: " + Diesel);
    }   
}
