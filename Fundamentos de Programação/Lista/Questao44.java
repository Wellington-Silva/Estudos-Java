package questao44;
import java.util.Scanner;
public class Questao44 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int num, Centena, Dezena, Unidade;
       
       System.out.print("Digite um número: ");
       num = sc.nextInt();
       
       if(num<1000){
           Centena = num/100;
           Dezena = num/10;
           Unidade = num/1;
       }else{
           System.out.println("Número Inválido");
       }
    }   
}
