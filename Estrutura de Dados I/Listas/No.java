package Listas;

public class No<T> {
    private T Elemento;
    private No<T> proximo;
    private No<T> anterior; // Este é de uso exclusivo da lista dupalemente encadeada

    // Construtor
    public No(T elemento) {
        this.Elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public T getElemento() { return Elemento; }

    public void setElemento(T elemento) {
        Elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getUltimo() {
        return anterior;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
}
