package questao32;
import java.util.Scanner;
public class Questao32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int contAltura=0, contMulher=0, somaAlturaMulher=0, contHomem=0;
        byte codSexo = 0;
        double altura, maiorAltura=0, menorAltura=0, medAlturaMulher=0, medAlturaTurma=0;
        
        for (int i=0; i<3; i++){
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            System.out.print("Sexo = (1-Masculino e 2-Feminino): ");
            codSexo = sc.nextByte();   
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            
            //Média de Altura da Turma
            contAltura++;
            
            //Maior e Menor Idade
            if(altura>maiorAltura){  
                maiorAltura = altura;
            } 
            if(altura<menorAltura){
                menorAltura = altura;
            }
            
            //Media de Altura das Mulheres
            if(codSexo == 2){
                contMulher++;
                somaAlturaMulher += altura;
            } else if(codSexo ==1){
                contHomem++;
            }
            
        }
        //Cálculo de Média de Altura das Mulheres
        medAlturaMulher = (contAltura+codSexo)/contAltura;
        
        //Cálculo Média de Altura da Turma
        medAlturaTurma = (contHomem+contMulher)/contAltura;
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-");
        System.out.println("RESPOSTAS");
        System.out.println("-=-=-=-=--=-=-=-=--=-=-=-=-=--=-=-=-");
        
        System.out.println("LETRA A: ");
        System.out.println("A maior altura é " + maiorAltura);
        System.out.println("A menor altura é " + menorAltura);
        
        System.out.println("LETRA B: ");
        System.out.println("A média de altura das mulheres é " + medAlturaMulher);
        
        System.out.println("LETRA C: ");
        System.out.println("Média de Altura da Turma: " + medAlturaTurma);
    }   
}
