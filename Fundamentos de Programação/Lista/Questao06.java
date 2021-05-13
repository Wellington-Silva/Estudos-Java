package questao06;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        
        if(idade >= 5 && idade <= 7){
            System.out.println("Infantil A: 5 a 7 anos");
        }
        else if(idade >= 8 && idade <= 10){
            System.out.println("Infantil B: 8 a 10 anos");
        }
        else if(idade >= 11 && idade <= 13){
            System.out.println("Juvenil A: 11 a 13 anos");           
        }
        else if(idade >= 14 && idade <= 17){
            System.out.println("Juvenil B: 14 a 17 anos");
        }else if(idade >= 18){
            System.out.println("Sênior: maiores de 18 anos");
        }
    }    
}
