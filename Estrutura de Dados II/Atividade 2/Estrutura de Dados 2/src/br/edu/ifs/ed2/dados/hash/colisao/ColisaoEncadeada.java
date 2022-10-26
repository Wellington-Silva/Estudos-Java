package br.edu.ifs.ed2.dados.hash.colisao;

import br.edu.ifs.ed2.dados.hash.Hash;
import br.edu.ifs.ed2.dados.hash.HashEncadeado;

public class ColisaoEncadeada<G> implements EstrategiaColisao<G> {

	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela) {
		int novoIndice = 0;
		return novoIndice;
	}

	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela, G conteudo) {
		HashEncadeado<G> hash = (HashEncadeado<G>) tabela;
		if (hash.getTabela()[indiceInicial] == null) return false;
		if (hash.getTabela()[indiceInicial].buscar(conteudo) == null) return false;
		return indiceInicial;
	}
}
