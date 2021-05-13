package questao05;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);      
        double altura = 0, peso = 0, pesoIdeal = 0;
        String sexo;
        
        System.out.println("Digite seu Sexo: ");
        sexo = sc.nextLine();        
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();                     
        System.out.println("Digite seu Peso: ");
        peso = sc.nextDouble();        
        
        if(sexo.equalsIgnoreCase("H")){
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if (sexo.equalsIgnoreCase("M")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        
        if (peso > pesoIdeal){
            System.out.println("Acima do Peso");
        } else if(peso == pesoIdeal){
            System.out.println("Peso Ideal");
        } else {
            System.out.println("Abaixo do Peso");
        }
    }   
}
