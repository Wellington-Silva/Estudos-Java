package listacatuxematrizes;
import java.util.Scanner;
public class Quest05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int votos[] = new int[10];
        int c=0, maior=0;
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0;
        double p1=0, p2=0, p3=0, p4=0, p5=0, p6=0;
        
        System.out.println("1- Windows Server");
        System.out.println("2- Unix");
        System.out.println("3- Linux");
        System.out.println("4- Netware");
        System.out.println("5- Mac OS");
        System.out.println("6- Outro");
        
        for(int i = 0; i < votos.length; i++){
            System.out.println("Qual o melhor Sistema Operacional para uso em servidores?");
            votos[i] = sc.nextInt();  
            
            switch(votos[i]){
                case 0:
                    System.out.println("Fim");
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4: 
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Por favor, digite novamente valores entre (1 e 6)");
                    votos[i] = sc.nextInt();
            }
            
            /*if(votos[i] == 0){
                System.out.println("Fim");
                break;
            }*/
        }
        // Mais votado
        for(int i = 0; i < votos.length; i++){
            if(votos[i] > maior){
                maior = votos[i];
            }
        }
        // Total de somas 
        int tot = c1 + c2 + c3 + c4 + c5 + c6;
        
        // Cálculos de percentuais
        p1 = (c1*100)/ tot;         
        p2 = (c2*100)/ tot;
        p3 = (c3*100)/ tot;
        p4 = (c4*100)/ tot;
        p5 = (c5*100)/ tot;
        p6 = (c6*100)/ tot;
        
        System.out.println("Sistema Operacional     Votos      %");
        System.out.println("-------------------     -----    ----");
        System.out.println("Windows Server           "+c1+"       "+p1+"%");
        System.out.println("Unix                     "+c2+"       "+p2+"%");
        System.out.println("Linux                    "+c3+"       "+p3+"%");
        System.out.println("Netware                  "+c4+"       "+p4+"%");
        System.out.println("Mac OS                   "+c5+"       "+p5+"%");
        System.out.println("Outro                    "+c6+"       "+p6+"%");
        System.out.println("--------------------     -----    ---");
        System.out.println("Total                     "+ tot);
        
        System.out.println("O Sistema Operacional mais votado foi o Unix, com "+maior+" votos, correspondendo a % dos votos.");
        
    }
}
