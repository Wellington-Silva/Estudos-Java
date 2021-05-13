package listacatuxematrizes;
import java.util.Scanner;
public class Quest06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salBruto[] = new float[20];
        int abono=0;
        
        for(int i=0; i<salBruto.length; i++){
            System.out.println("Salário: ");
            salBruto[i] = sc.nextFloat();
            
            // Condição de parada
            if(salBruto[i] == 0){
                break;
            }
        }
        for(int i=0; i<salBruto.length; i++){
            System.out.print("R$"+salBruto[i]+" --- R$"+abono);
        }
        
    }
}
