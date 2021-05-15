package Fila;

public class FilaSequencial<T> implements IFila<T> {
    // Atributos
    T[] vetor;
    int qtdFila;
    int max;
    int ini;
    int f;

    // Construtor
    public FilaSequencial(Class<T> dataType) {
        this.qtdFila = 0;
        this.max = 10;
        this.vetor = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
        this.ini = 0;
        this.f = vetor.length;
    }

    @Override
    public void incluir(T valor) throws FilaCheiaException {
        if(qtdFila == max) {
            aumentoCapacidade();
            throw new FilaCheiaException("Fila cheia, não é possível inserir novos elementos");
        }
        vetor[this.qtdFila++] = valor;
    }

    @Override
    public T remover() throws FilaVaziaException {
        final int posicao = 0;
        if(!estaVazia()) {
            T elementoExcluido = vetor[posicao];
            vetor[posicao] = null;
            qtdFila--;
            return elementoExcluido;
        } else {
            throw new FilaVaziaException("A fila está vazia");
        }
    }

    @Override
    public int getQtd() {
        return qtdFila;
    }

    @Override
    public int getQtdMaxSuportada() {
        return max;
    }

    @Override
    public boolean estaVazia() {
        return (qtdFila == 0);
    }

    @Override
    public void limpar() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = null;
        }
        qtdFila = 0;
        max = 0;
    }

    @Override
    public T visualizarProximo() throws FilaVaziaException {
        if (estaVazia()) throw new FilaVaziaException("A fila está vazia");
        T prox = vetor[ini];
        return prox;
    }

    public void aumentoCapacidade() {
        if (this.getQtd() == this.getQtdMaxSuportada()) {
            T[] novoArray = (T[]) new Object[vetor.length * 2];

            for (int i = 0; i < vetor.length; i++)
                novoArray[i] = this.vetor[i];

            vetor = novoArray;
            ini = 0;
            f = qtdFila;
        }
    }
    /*public void ImprimirPilha() {
        System.out.print("Fila: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" | " + vetor[i] + " | ");
        }
        System.out.println();
    }*/
}


