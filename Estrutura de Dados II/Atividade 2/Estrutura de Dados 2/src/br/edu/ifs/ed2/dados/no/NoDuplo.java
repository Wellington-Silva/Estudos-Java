package br.edu.ifs.ed2.dados.no;

/**
 * @author Marlos Tacio Silva
 */
public class NoDuplo<G> extends No<G> {
	private NoDuplo<G> posterior;
	private NoDuplo<G> anterior;

	public NoDuplo(G conteudo) { super(conteudo); }

	public NoDuplo<G> getPosterior() { return posterior; }

	public NoDuplo<G> setPosterior(NoDuplo<G> posterior) {
		if (this.posterior == posterior) { return this; }
		this.posterior = posterior;
		if (posterior != null) { posterior.setAnterior(this); }
		return this;
	}

	public NoDuplo<G> getAnterior() { return anterior; }

	public NoDuplo<G> setAnterior(NoDuplo<G> anterior) {
		if (this.anterior == anterior) { return this; }
		this.anterior = anterior;
		if (anterior != null) { anterior.setPosterior(this); }
		return this;
	}
}
