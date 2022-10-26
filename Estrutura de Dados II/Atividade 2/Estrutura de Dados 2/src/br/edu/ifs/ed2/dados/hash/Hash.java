/**
 * Wellington Carvalho da Silva
 */
package br.edu.ifs.ed2.dados.hash;

import br.edu.ifs.ed2.dados.hash.chave.EstrategiaChave;
import br.edu.ifs.ed2.dados.hash.colisao.EstrategiaColisao;
import br.edu.ifs.ed2.dados.hash.espalhamento.EstrategiaEspalhamento;

public abstract class Hash<G> {
	private int tamanho; // Tamanho da tabela de espalhamento.
	private EstrategiaChave<G> chave; // Estrat�gia para a constru��o das chaves de cada conte�do.
	private EstrategiaColisao<G> colisao; // Estrat�gia para o tratamento de colis�es.
	private EstrategiaEspalhamento<G> espalhamento; // Estrat�gia para o c�lculo da fun��o de espalhamento.

	public Hash(int tamanho, EstrategiaChave<G> chave, EstrategiaEspalhamento<G> espalhamento, EstrategiaColisao<G> colisao) {
		this.setTamanho(tamanho);
		this.setChave(chave);
		this.setColisao(colisao);
		this.setEspalhamento(espalhamento);
	}

	protected abstract boolean finalizarInsercao(int indice, G conteudo) {}

	protected abstract boolean finalizarRemocao(int indice, G conteudo) {}

	public boolean inserir(G conteudo) {
		int chave = this.getChave().gerarChave(conteudo);
		int indice = this.getEspalhamento().calcularIndice(chave, this.getTamanho());
		int indiceFinal = this.getColisao().obterIndice(indice, this);
		return this.finalizarInsercao(indiceFinal, conteudo);
	}

	public int buscar(G conteudo) {
		int chave = this.getChave().gerarChave(conteudo);
		int indice = this.getEspalhamento().calcularIndice(chave, this.getTamanho());
		return this.getColisao().obterIndice(indice, this, conteudo);
	}

	public boolean remover(G conteudo) {
		int indice = this.buscar(conteudo);
		return this.finalizarRemocao(indice, conteudo);
	}

	public int getTamanho() { return this.tamanho; }
	protected void setTamanho(int tamanho) { this.tamanho = tamanho; }
	public EstrategiaChave<G> getChave() { return this.chave; }
	protected void setChave(EstrategiaChave<G> chave) { this.chave = chave; }
	public EstrategiaColisao<G> getColisao() { return this.colisao; }
	protected void setColisao(EstrategiaColisao<G> colisao) { this.colisao = colisao; }
	public EstrategiaEspalhamento<G> getEspalhamento() { return this.espalhamento; }
	protected void setEspalhamento(EstrategiaEspalhamento<G> espalhamento) { this.espalhamento = espalhamento; }
}
