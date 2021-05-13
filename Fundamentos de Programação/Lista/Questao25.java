package questao25;
import java.util.Scanner;
public class Questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int valorA=0, valorB=0, dividendo=0, divisor=0, resto=0, mdc=0;
        
        System.out.print("Digite um valor A inteiro e Positivo: ");
        valorA = sc.nextInt();
        System.out.print("DIgite o valor B inteiro e positivo: ");
        valorB = sc.nextInt();
        
        if(valorA > valorB){
            dividendo = valorA;
            divisor = valorB;
        }else{
            dividendo = valorB;
            divisor = valorA;
        }
        do{
           resto = (dividendo % divisor);
           if(resto != 0){
               dividendo = divisor;
               divisor = resto;
           }           
        }while(resto == 0);
        
        mdc = divisor;
        if(mdc == 1){
            System.out.println("A e B são Primos entre si");
        }else{
            System.out.println("A e B não são primos entre si");
        }
    }    
}
