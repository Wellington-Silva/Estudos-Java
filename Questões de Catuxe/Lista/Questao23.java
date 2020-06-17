package questao23;
import java.util.Scanner;
public class Questao23 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        byte serie, qtdLivros = 0, Redacao = 0, idade = 0;
        int qtdSerie3 = 0, contAlunosBurros = 0, maiorQuantLivros4=0, porcent=0, contPessoas = 0;               
        
        do{
            System.out.print("Idade: ");
            idade = input.nextByte();
            System.out.print("Informe sua série: (primeira-1, segunda-2, terceira-3, quarta-4): ");
            serie = input.nextByte();
            System.out.println("Quantos livros lê pôr mês: ");
            qtdLivros = input.nextByte();
            System.out.print("Gosta de Redação? (Sim-1 ou Não-2):");
            Redacao = input.nextByte();
            System.out.println("*******************************************************************************************************");
            
            //Quantidade de alunos na terceira série
            if(serie == 3){
                qtdSerie3++;
            }
            //A maior quantidade de livros lidos por um aluno que está na quarta série;
            if(serie == 4){
                if(qtdLivros > maiorQuantLivros4){            
                    maiorQuantLivros4 = qtdLivros;
                }
            }
            //Porcentagem de alunos que não gostam de fazer redação e estão na terceira série
            if(Redacao == 1 && serie == 3){
                contPessoas++;          
            }
        } while(idade != 0);
        
        // Cálculo da Porcentagem
        porcent = (contAlunosBurros*contPessoas)/qtdSerie3;
        
        System.out.println("-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--=-=-=-=-=-=--=-=-=-=-=-=--=");
        
        System.out.println("LETRA A: ");
        System.out.println("Quantidade de alunos na Terceira Série: " + qtdSerie3);
        
        System.out.println("LETRA B: ");
        System.out.println("A maior quantidade de livros lidos por um aluno que está na quarta série: "+ maiorQuantLivros4);    
        
        System.out.println("LETRA C: ");
        System.out.println("Porcentagem de alunos que não gostam de fazer redação e estão na terceira série: "+ porcent + "%");
        
    }
}
