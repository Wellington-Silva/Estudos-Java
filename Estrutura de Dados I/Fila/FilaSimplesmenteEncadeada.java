package Fila;

public class FilaSimplesmenteEncadeada <T> implements IFila<T> {

    // Atributos
    private NoFila<T> inicio;
    private NoFila<T> fim;
    private int qtd_Fila;
    private int limiteFila;

    // Construtor
    public FilaSimplesmenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.qtd_Fila = 0;
        this.limiteFila = 10;
    }

    @Override
    public void incluir(T valor) throws FilaCheiaException {
        if(qtd_Fila == limiteFila) // ou if(qtd_Fila == qtdMaxSuportada())
            throw new FilaCheiaException("Fila cheia! Não é possível incluir novos elementos");

        NoFila<T> novo = new NoFila<T>(valor);

        if(estaVazia()) {
            inicio = novo;
            fim = novo;
            qtd_Fila++;
        } else {
            this.fim.setProximo(novo);
            this.fim = novo;
            qtd_Fila++;
        }
    }

    @Override
    public T remover() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException("Não é possível remover elementos de uma fila vazia");
        } else {
            inicio = inicio.getProximo();
            T aux = inicio.getElemento();
            this.qtd_Fila--;
            return aux;
        }
    }

    @Override
    public int getQtd() {
        return qtd_Fila;
    }

    @Override
    public int getQtdMaxSuportada() {
        return limiteFila;
    }

    @Override
    public boolean estaVazia() {
        return (qtd_Fila == 0);
    }

    @Override
    public void limpar() {
        this.inicio = null;
        this.fim = null;
        qtd_Fila = 0;
    }

    @Override
    public T visualizarProximo() throws FilaVaziaException {
        if (estaVazia()) throw new FilaVaziaException("Não é possível remover elementos de uma fila vazia");

        T prox = inicio.getElemento();
        return prox;
    }

    /*public void ImprimirPilha() {
        if (estaVazia()) System.out.println("A fila está vazia");
        NoFila temp = inicio;
        while (temp != null){
            System.out.print(temp.getElemento() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }*/
}
