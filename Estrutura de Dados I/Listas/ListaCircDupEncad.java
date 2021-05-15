package Listas;

public class ListaCircDupEncad<T extends Comparable<T>> extends Lista<T> {
    // Atributos
    public No<T> primeiro, ultimo;
    public int Comprimento_Lista;
    private int qtd_Elements;

    // Construtor
    public ListaCircDupEncad(Class<T> dataType, int tamanho_lista) {
        this.primeiro = null;
        this.ultimo = null;
        Comprimento_Lista = tamanho_lista;
        qtd_Elements = 0;
    }

    @Override
    public void incluir(T elemento) throws Exception {
        if (qtd_Elements >= Comprimento_Lista) throw new Exception("Lista cheia");
        No<T> novo = new No<>(elemento);
        if (qtd_Elements == 0){
            incluirInicio(elemento);
        } else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
            ultimo = novo;
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            qtd_Elements++;
        }
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        if (qtd_Elements >= Comprimento_Lista) throw new Exception("Lista cheia");
        No<T> novo = new No<>(elemento);
        if (qtd_Elements == 0) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
            primeiro = novo;
            ultimo.setProximo(novo);
            novo.setAnterior(ultimo);
        }
        qtd_Elements++;
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if (posicao >= Comprimento_Lista || posicao < 0) throw new Exception("Posição inexistente");
        if (qtd_Elements >= Comprimento_Lista) throw new Exception("A lista está cheia");

        if (posicao == 0)
            incluirInicio(elemento);
        else if (posicao == qtd_Elements - 1)
            incluir(elemento);
        else {
            No<T> novo = new No<>(elemento);
            No<T> aux = primeiro;
            for (int i = 0; i < posicao - 1; i++) aux = aux.getProximo();
            novo.setProximo(aux.getProximo());
            aux.setProximo(novo);

            No<T> auxAnterior = aux.getAnterior();
            auxAnterior.setProximo(novo);
            aux.setAnterior(novo);
            novo.setProximo(aux);
            novo.setAnterior(auxAnterior);

            qtd_Elements++;
        }
    }

    @Override
    public T get(int posicao) throws Exception {
        if (posicao >= qtd_Elements || posicao < 0) {
            throw new Exception("Posição solicitada não existe na lista");
        } else {
            No<T> aux = primeiro;
            for (int i = 0; i < posicao; i++) {
                aux = aux.getProximo();
                aux.setAnterior(ultimo);
            }
            return aux.getElemento();
        }
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        No<T> aux = primeiro;
        for (int i = 0; i < qtd_Elements; i++) {
            if (aux.getElemento().equals(elemento)) return i;
            aux = aux.getProximo();
        }
        throw new Exception("O elemento não foi localizado na lista");
    }

    @Override
    public void remover(int posicao) throws Exception {
        if (posicao >= Comprimento_Lista || posicao < 0) throw new Exception("Posição inexistente");
        if (qtd_Elements == 0) throw new Exception("Lista vazia");

        No ant = primeiro;
        for (int i = 0; i < posicao; i++) {
            ant = ant.getProximo();
            ant.setAnterior(ultimo);
        }
        No auxAnterior = ant.getAnterior();
        No auxProximo = ant.getProximo();

        auxAnterior.setProximo(auxProximo);
        auxProximo.setAnterior(auxAnterior);

        if(ant == primeiro) {
            primeiro = primeiro.getProximo();
        } else if(ant == ultimo) {
            ultimo = ultimo.getAnterior();
        }
        qtd_Elements--;
    }

    @Override
    public void limpar() {
        this.primeiro = null;
        this.ultimo = null;
        qtd_Elements = 0;
    }

    @Override
    public int getTamanho() {
        /*No novo = this.primeiro;
        int auxTamanho = 0;

        for(No i = novo; i != null; auxTamanho++){
            novo = novo.getProximo();
        }
        return auxTamanho;*/
        return qtd_Elements;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        No aux = primeiro;
        /*do {
            if (aux.getElemento().equals(elemento)) return true;
            aux = aux.getProximo();
        } while (aux.getProximo() != primeiro);*/

        for (int i = 0; i < qtd_Elements; i++) {
            if (aux.getElemento().equals(elemento)) return true;
            aux = aux.getProximo();
        }
        throw new Exception("O elemento não localizado na lista");
    }
}
