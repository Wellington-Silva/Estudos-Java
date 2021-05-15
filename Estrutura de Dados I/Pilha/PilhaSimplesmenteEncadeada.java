package Pilha;

public class PilhaSimplesmenteEncadeada <T> implements IPilha<T> {

    // Atributos
    NoPilha<T> topoPilha;
    NoPilha<T> basePilha;
    int qtdPilha;
    int tamanhoLista;

    // Construtor
    public PilhaSimplesmenteEncadeada(Class<T> dataType) {
        this.topoPilha = null;
        this.qtdPilha = 0;
        this.tamanhoLista = 10;
    }

    @Override
    public void empilhar(T valor) throws PilhaCheiaException {
        if(qtdPilha == this.tamanhoLista)
            throw new PilhaCheiaException("A Pilha está cheia e não suporta mais elementos");

        NoPilha<T> novo = new NoPilha<T>(valor);

        if (estahVazia()) {
            this.topoPilha = novo;
            this.basePilha = novo;
            this.qtdPilha++;
        } else {
            this.topoPilha.setProximo(novo);
            this.topoPilha = novo;
            qtdPilha++;
        }
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        if (estahVazia())
            throw new PilhaVaziaException("A Pilha está vazia!");
        else {
            NoPilha<T> aux = basePilha;
            NoPilha<T> removido = topoPilha;

            do  aux = aux.getProximo();
            while (aux.getProximo() != topoPilha);

            topoPilha = aux;
            topoPilha.setProximo(null);
            qtdPilha--;

            return removido.getElement();
        }
    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        if (estahVazia()) throw new PilhaVaziaException("A Pilha está vazia!");
        return topoPilha.getElement();
    }

    @Override
    public int getQtd() {
        return qtdPilha;
    }

    @Override
    public boolean estahVazia() {
        return (qtdPilha == 0);
    }

    /*public void ImprimirPilha() {
        NoPilha aux = basePilha;
        do {
            System.out.println( " | " + aux.getElement() + " | ");
            aux = aux.getProximo();
        } while (aux != null);

        System.out.println();
    }*/
}
