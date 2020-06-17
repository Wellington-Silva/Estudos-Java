package aluno;
import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classAluno aluno = new classAluno();
        
        System.out.println("Nome: ");
        aluno.nome = sc.next();
        
        System.out.println("Matrícula: ");
        aluno.matricula = sc.next();
        
        System.out.println("Nome do curso: ");
        aluno.curso = sc.next();
        
        for(int i=0; i<aluno.nomesDisciplinas.length; i++){
            System.out.println("Nome da disciplina " + i);
            aluno.nomesDisciplinas[i] = sc.next();          
        }
        
        for(int i=0; i<aluno.notasDisciplina.length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.nomesDisciplinas[i]);
            for(int j=0; j<aluno.notasDisciplina[i].length; j++){
                System.out.println("Entre com a nota "+ (j+1));
                aluno.notasDisciplina[i][j] = sc.nextDouble();
            }
        }
        
        aluno.mostrarInfo();
        
        for(int i=0; i<aluno.nomesDisciplinas.length; i++){
            if(aluno.aprovado(i)) {
                System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + " foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomesDisciplinas[i] + " foi reprovado");
            }
        }       
    }    
}
