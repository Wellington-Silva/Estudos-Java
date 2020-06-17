package aula06;
public class ControleRemoto implements Controlador{
    private boolean ligado;
    private int volume;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        System.out.println("-----------------MENU-----------------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i=0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void FecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void MaisVolume() {
        if(this.getLigado()) {
            setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume com a TV desligada");
        }
    }

    @Override
    public void MenosVolume() {
        if(this.getLigado()) {
            setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void LigarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void DesligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void Play() {
        if(this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void Pause() {
        if(this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
