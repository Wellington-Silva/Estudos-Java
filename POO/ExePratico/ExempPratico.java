package exemppratico;
import java.util.Scanner;
public class ExempPratico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //André
        ContaBanco c = new ContaBanco();
        c.setNumConta(1111);
        c.setDono("André");
        c.abrirConta("CC");
        c.depositar(300);
        
        //Creuza
        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
                
        //Estado atual
        c.estadoAtual();
        c2.estadoAtual();
      
    }    
}
