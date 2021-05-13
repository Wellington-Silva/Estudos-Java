package questão20;

import java.util.Scanner;

public class Questão20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int codOp = 0, dependentes = 0;
        double nHoras = 0, INSS = 0, IR = 0, Salario = 0, Liquido = 0;
        
        //12 reais por hora e 40 reais por dependentes
        //Para o salário são feitos descontos de 8,5% para o INSS e 5% para IR
        
        for (int i = 0; i<10; i++){
            //Entrada de Dados
            System.out.print("Digite o Código de Operação: ");
            codOp = sc.nextInt();        
            System.out.print("Número de Horas Trabalhadas: ");
            nHoras = sc.nextDouble();    
            System.out.print("Número de Dependentes: ");
            dependentes = sc.nextInt();
            
            //Cálculos
            Salario = (nHoras*14)/(dependentes*40);
            INSS = ((Salario/100)*8.5);
            IR = ((Salario/100)*5);
            Liquido = ((Salario - INSS) - IR);
                    
            //Mostrar cálculos
            System.out.println("O código de Operação é: " + codOp);
            System.out.println("Valor Descontado para o INSS: R$ " + INSS);
            System.out.println("Valor Descontado para o IR: R$ " + IR);
            System.out.println("Valor do Salário Líquido: R$ " + Liquido);           
            System.out.println("---------------------------------------------");
             
        }
       
    }
    
}
