package Listas;

import java.lang.Exception;

public class Lista_Sequencial<T extends Comparable> extends Lista<T> {
    // Atributos
    T[] lista;
    int qtdMax, qtd_Elements=0, finalLista;

    // Construtor
    public Lista_Sequencial(Class<T> dataType){
        super();
        int qtdMax = 10;
        this.lista = (T[]) java.lang.reflect.Array.newInstance(dataType, qtdMax);
        finalLista = -1;
    }

    @Override
    public void incluir(T elemento) throws Exception {
        if(qtd_Elements >= lista.length) throw new Exception("Lista cheia");
        this.lista[qtd_Elements] = elemento;
        this.qtd_Elements++;
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        if (qtd_Elements > 0) {
            for (int i = lista.length - 1; i > 0; i--) {
                this.lista[i] = this.lista[i - 1];
            }
        }
        this.lista[0] = elemento;
        this.qtd_Elements++;
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if(!(posicao >= 0 && posicao <= this.qtdMax)){ throw new Exception("Posição inexistente na lista"); }
        if (qtd_Elements >= qtdMax)throw new Exception("Lista cheia");
        if (posicao == 0){
            incluirInicio(elemento); return;
        }else if (posicao == qtd_Elements){
            incluir(elemento); return;
        }else{
            T Element_Velho, Element_Novo = null;
            for (int i = posicao; i < lista.length; i++) {
                Element_Velho = lista[i];
                if (i == posicao) lista[i] = elemento;
                else lista[i] = Element_Novo;
                Element_Novo = Element_Velho;
            }
        }
        this.qtd_Elements++;
    }

    @Override
    public T get(int posicao) throws Exception {
        if(posicao >= lista.length) throw new Exception("Posição solicitada não existe na lista");
        return (T) this.lista[posicao];
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        for (int i = 0; i < qtd_Elements; i++) {
            if(this.lista[i].equals(elemento)) return i;
        }
        throw new Exception("Elemento não encontrado");
    }

    @Override
    public void remover(int posicao) throws Exception {
        if(posicao >= lista.length) throw new Exception("Esta posição não existe na lista");
        if (qtd_Elements == 0) throw new Exception("A lista está vazia");
        for (int i = posicao; i < qtd_Elements; i++) {
            this.lista[i] = lista[i+1];
        }
        this.qtd_Elements--;
    }

    @Override
    public void limpar() {
        for (int i = 0; i < qtd_Elements; i++) lista[i] = null;
        this.qtd_Elements = 0;
    }

    @Override
    public int getTamanho() {
        return qtd_Elements;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        for (int i = 0; i < qtd_Elements; i++) {
            if (this.lista[i].equals(elemento)) return true;
        }
        return false;
    }
}
