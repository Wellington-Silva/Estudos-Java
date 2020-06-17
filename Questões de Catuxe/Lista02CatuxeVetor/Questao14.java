package lista02catuxevetor;
import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String vetor[] = new String[5];
        int contSim=0;
                   
        vetor[0] = "Telefonou para a vítima? (S/N): ";
        vetor[1] = "Esteve no local do crime? (S/N): ";
        vetor[2] = "Mora perto da vítima? (S/N): ";
        vetor[3] = "Devia para a vítima? (S/N): ";
        vetor[4] = "Já trabalhou com a vítima? (S/N): ";      
        System.out.println("----------------------------------");
        
        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i] + " ");
            String resp = sc.nextLine();
            
            if(resp.equalsIgnoreCase("S")){
                contSim++;
            }
        }
            
        if(contSim >= 2){
            System.out.println("Suspeita");
        } else if(contSim >= 3 && contSim <=4){
            System.out.println("Cúmplice");
        } else if(contSim == 5){
            System.out.println("Assassino");
        } else{
            System.out.println("Inocente");
        }                         
    }
}
