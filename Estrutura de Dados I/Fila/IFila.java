package Fila;

public interface IFila <T> {
    public void incluir(T valor) throws FilaCheiaException;  //  Adiciona um novo elemento no Topo da Pilha
    public T remover() throws FilaVaziaException;            //  Remove o Elemento do Topo
    public int getQtd();
    public int getQtdMaxSuportada();
    public boolean estaVazia();
    public void limpar();
    public T visualizarProximo() throws FilaVaziaException;
}
