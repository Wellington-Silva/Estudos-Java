package UFC;
import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) 
                && l1 != l2) { // LUTA APROVADA
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else { // LUTA REPROVADA
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }   
    public void fight() {
        if(this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentacao();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentacao();
                                    
            Random ran = new Random();
            int vencedor = ran.nextInt(3);
            System.out.println("======= RESULTADO DA LUTA =======");
            switch(vencedor) {
                case 0: // EMPATE
                    System.out.println("EMPATE");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                case 1: // DESAFIADO GANHOU
                    System.out.println("VENCEU " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // DESAFIANTE GANHOU
                    System.out.println("VENCEU " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }        
            System.out.println("============================================");
        } else {
            System.out.println("Esta luta não pode acontecer");
        }   
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
