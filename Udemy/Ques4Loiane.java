package matrizes;
import java.util.Scanner;
public class Ques4Loiane {  
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /*Faca um programa para armazenar uma matriz os compromissos de uma agenda pessoal
        Cada dia do mês deve conter 24h, onde para cada destas 24h podemos associar uma tarefa 
        específica(compromisso agendado). O programa deve ter um menu onde o usuário indica o 
        mês que deseja alterar e a hora, entrando em seguida com compromisso, ou então, o usuário 
        pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso agendado.*/
        
        String compromissos[][] = new String [31][24];
        boolean diaValido = false, horaValida = false;
        int dia=0, hora=0;
                
        System.out.println("MENU");
        
        boolean sair = false;
        Byte opcao = 0;
        while(!sair){
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");            
            opcao = sc.nextByte();
            
            if(opcao == 1){ //adicionar compromisso
                while(!diaValido){
                    System.out.println("Digite o dia do Mês: ");
                    dia = sc.nextInt();
                    
                    if(dia > 0 && dia<31){
                        diaValido = true;
                    }else{
                        System.out.println("DIA INVÁLIDO");
                    }
                }
                while(!horaValida){
                    System.out.println("Digite a hora do compromisso: ");
                    hora = sc.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else{
                        System.out.println("DIA INVÁLIDO");
                    }
                }
                System.out.println("Digite o compromisso: ");
                compromissos[--dia][hora] = sc.next();
                 
            } else if(opcao == 2){ //verificar compromisso
                while(!diaValido){
                    System.out.println("Digite o dia do compromisso: ");
                    dia = sc.nextInt();
                    if(dia > 0 && dia<31){
                        diaValido = true;
                    }else{
                        System.out.println("DIA INVÁLIDO");
                    }
                }
                while(!horaValida){
                    System.out.println("Digite a hora do compromisso: ");
                    hora = sc.nextInt();
                    if(hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else{
                        System.out.println("DIA INVÁLIDO");
                    }
                }
                
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[--dia][hora]);
                
            }else if(opcao == 0) {
                sair = true;
            } else{
                System.out.println("OPÇÃO INVÁLIDA");
                System.out.println("DIGITE NOVAMENTE: ");
            }
            
        }                  
    }    
}
