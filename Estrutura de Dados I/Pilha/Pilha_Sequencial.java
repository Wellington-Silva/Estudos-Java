package Pilha;

public class Pilha_Sequencial <T> implements IPilha<T> {
    // Atributos
    T[] vetor;
    int qtdPilha;
    int max;
    T topoPilha;

    // Construtor
    public Pilha_Sequencial(Class<T> dataType) {
        this.vetor = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
        this.qtdPilha = 0;
        int max = 10;
        int topoPilha = 0;
    }

    @Override
    public void empilhar(T valor) throws PilhaCheiaException {
        if(qtdPilha == max) {
            dobrarCapacidadeArray();
            throw new PilhaCheiaException("A pilha está cheia");
        } else {
            vetor[qtdPilha] = valor;
            qtdPilha++;
            topoPilha = vetor[qtdPilha];
        }
    }

    @Override
    public T desempilhar() throws PilhaVaziaException {
        if (!estahVazia()){
            T excluido = vetor[qtdPilha];
            vetor[qtdPilha] = null;
            qtdPilha--;
            topoPilha = vetor[qtdPilha];
            return excluido;
        } else {
            throw new PilhaVaziaException("A pilha está vazia!");
        }
    }

    @Override
    public T getTopo() throws PilhaVaziaException {
        if(estahVazia()) {
            throw new PilhaVaziaException("A pilha está vazia, portanto não possui topo");
        } else {
            return vetor[qtdPilha];
        }
    }

    @Override
    public int getQtd() {
        return qtdPilha;
    }

    @Override
    public boolean estahVazia() {
        return (qtdPilha == 0);
    }

    public void dobrarCapacidadeArray() { // Este método dobra o vetor, ou seja, aumenta sua capacidade em dobro
        if(this.qtdPilha == this.vetor.length){
            T[] novoArray = (T[]) new Object[max * 2];

            for (int aux = 0; aux < max; aux++)
                novoArray[aux] = this.vetor[aux];

            this.vetor = novoArray;
        }
    }
}
