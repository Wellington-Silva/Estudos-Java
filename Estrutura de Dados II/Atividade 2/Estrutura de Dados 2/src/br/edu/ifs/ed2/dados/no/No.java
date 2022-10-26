package br.edu.ifs.ed2.dados.no;

/**
 * @author Marlos Tacio Silva
 */
public abstract class No<G> {
	private G conteudo;

	public No(G conteudo) {
		this.setConteudo(conteudo);
	}

	public G getConteudo() {
		return this.conteudo;
	}

	protected No<G> setConteudo(G conteudo) {
		this.conteudo = conteudo;
		return this;
	}

	@Override
	public String toString() {
		return this.getConteudo().toString();
	}
}

// --------------------------------------

public class ArvoreBinária() G extends Comparable<G>{

	public ArvoreBinaria() {
		this(null);
	}

	public ArvoreBinaria(NoTriplo<G> raiz) {
		this.setRaiz(raiz);
	}

	public boolean inserir(G conteudo) {
		if (conteudo == null) {
			return false;
		}

		if (this.getRaiz() == null) {
			setRaiz(new NoTriplo<>(conteudo));
			return true;
		}

		NoTriplo<G> aux1 = this.getRaiz();
		NoTriplo<G> aux2 = null;

		while (aux1 != null) {
			aux2 = aux1;
			if (conteudo.compareTo(aux1.getConteudo()) >= 0) aux1 = aux1.getDireito();
			else aux1 = aux1.getEsquerdo();
		}

		if (conteudo.compareTo(aux2.getConteudo()) >= 0){
			aux2.setDireito(new NoTriplo<>(conteudo));
		}
		else{
			aux2.setEsquerdo(new NoTriplo<>(conteudo));
		}
		return true;
	}

	public NoTriplo<G> maximo()
		return this.maximo(this.getRaiz());

	public NoTriplo<G> minimo() {
		return this.minimo(this.getRaiz());

	public NoTriplo<G> sucessor(G conteudo) {
		return this.sucessor(this.buscar(conteudo));

	public NoTriplo<G> predecessor(G conteudo) {
		return this.predecessor(this.buscar(conteudo));

	public void limpar()
		this.raiz = null;

	public NoTriplo<G> getRaiz() {
		return this.raiz;

	private void setRaiz(NoTriplo<G> raiz) {
		this.raiz = raiz;

	@Override
	public String toString() {
		if (this.getRaiz() == null) {
			return "";
		}
		return this.getRaiz().toString();
	}

	private boolean ehRaiz(NoTriplo<G> no) {
		return no.equals(this.getRaiz());
	}


}
