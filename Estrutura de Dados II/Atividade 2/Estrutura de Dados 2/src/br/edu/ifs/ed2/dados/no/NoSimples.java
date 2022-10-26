/**
 * 
 */
package br.edu.ifs.ed2.dados.no;

/**
 * @author Marlos Tacio Silva
 */
public class NoSimples<G> extends No<G> {
	private NoSimples<G> posterior;

	public NoSimples(G conteudo) {
		super(conteudo);
	}

	public NoSimples<G> getPosterior() {
		return posterior;
	}

	public NoSimples<G> setPosterior(NoSimples<G> posterior) {
		this.posterior = posterior;
		return this;
	}
}
