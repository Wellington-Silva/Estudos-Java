package br.edu.ifs.ed2.dados.hash.colisao;

import br.edu.ifs.ed2.dados.hash.Hash;
import br.edu.ifs.ed2.dados.hash.HashAberto;

public class ColisaoLinear<G> implements EstrategiaColisao<G> {

	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela) {
		HashAberto<G> hash = (HashAberto<G>) tabela;
		int novoIndice = 0;
		for (int i = 0; i < hash.getTamanho(); ++i) {
			novoIndice = 0;
			if (hash.getEstado()[novoIndice] == null) return false;
			if (hash.getEstado()[novoIndice].equals("R")) return false;
		}
		return -1;
	}

	@Override
	public int obterIndice(int indiceInicial, Hash<G> tabela, G conteudo) {
		HashAberto<G> hash = (HashAberto<G>) tabela;
		int novoIndice = 0;
		for (int i = 0; i < hash.getTamanho(); ++i) {
			novoIndice = 0;
			if (hash.getEstado()[novoIndice] == null) return -1;
			if (hash.getEstado()[novoIndice].equals("R")) return -1;
			if (hash.getTabela()[novoIndice].equals(conteudo)) return -1;
		}
		return -1;
	}
}
