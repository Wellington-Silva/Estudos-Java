package questao35;
import java.util.Scanner;
public class Questao35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int voto, contVoto1=0, contVoto2=0, contVoto3=0, contVoto4=0;
        int contVotoNulo=0, contBranco=0, total=0, porBranco=0, porNulo=0;
        
        System.out.print("Qual seu voto? ");        
        voto = sc.nextInt();

        while (voto != -1){
            
            System.out.print("Qual seu voto? ");        
            voto = sc.nextInt();
        
            System.out.println("-=-=-=-=-=-=-=-=-=-=--=-");
            
            if(voto == 1){
                contVoto1++;
            } else if(voto == 2){
                contVoto2++;
            }else if(voto == 3){
                contVoto3++;
            } else if(voto == 4){
                contVoto4++;
            } else if(voto == 5){
                contVotoNulo++;
            } else if(voto ==6){
                contBranco++;
            }
        }
        //Soma do total de votos
        total = contVoto1+contVoto2+contVoto3+contVoto4;
        
        //Percentual de Votos Brancos e Nulo sobre o total
        porBranco = (total/contBranco)* 100;
        porNulo = (total/contVotoNulo)* 100;
        
        System.out.println("1º Candidato teve " + contVoto1 + " votos.");       

        System.out.println("2º Candidato teve " + contVoto2 + " votos.");
                
        System.out.println("3º Candidato teve " + contVoto3 + " votos.");
                
        System.out.println("4º Candidato teve " + contVoto4 + " votos.");
                
        System.out.println("O total de Votos Nulos foram " + contVotoNulo + " votos.");
                
        System.out.println("O total de Votos Brancos foram " + contBranco + " votos.");
        
        System.out.println("Percentual de Votos Brancos sobre o total " + porBranco + "%");
        System.out.println("Percentual de Votos Nulo sobre o total " + porNulo + "%");
                
    }    
}
