package br.edu.ifs.ed2.dados.hash;

import br.edu.ifs.ed2.dados.hash.chave.EstrategiaChave;
import br.edu.ifs.ed2.dados.hash.colisao.EstrategiaColisao;
import br.edu.ifs.ed2.dados.hash.espalhamento.EstrategiaEspalhamento;
import br.edu.ifs.ed2.dados.lista.Lista;

public class HashEncadeado<G> extends Hash<G> {
	private Lista<G> tabela[];

	@SuppressWarnings("unchecked")
	public HashEncadeado(int tamanho, EstrategiaChave<G> chave, EstrategiaEspalhamento<G> espalhamento,
						 EstrategiaColisao<G> colisao) {
		super(tamanho, chave, espalhamento, colisao);
		this.setTabela((Lista<G>[]) new Lista<?>[tamanho]);
	}

	@Override
	protected boolean finalizarInsercao(int indice, G conteudo) {
		if (indice < 0) return false;
		if (this.getTabela()[indice] == null) this.getTabela()[indice] = new ListaSimples<>();
		this.getTabela()[indice].inserirInicio(conteudo); return true;
	}

	@Override
	protected boolean finalizarRemocao(int indice, G conteudo) {
		if (indice < 0) return false;
		this.getTabela()[indice].remover(conteudo); return true;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < this.getTamanho(); ++i) {
			if (this.getTabela()[i] == null) {
				s.append("-").append("\n");
				continue;
			}
			s.append(this.getTabela()[i]).append("\n");
		}
		return s.toString();
	}

	public Lista<G>[] getTabela() return this.tabela;
	public void setTabela(Lista<G> tabela[]) this.tabela = tabela;
}
