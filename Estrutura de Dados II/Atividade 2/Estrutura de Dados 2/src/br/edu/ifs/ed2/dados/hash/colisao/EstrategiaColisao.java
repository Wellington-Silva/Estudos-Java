package br.edu.ifs.ed2.dados.hash.colisao;

import br.edu.ifs.ed2.dados.hash.Hash;

public interface EstrategiaColisao<G> {

	public int obterIndice(int indiceInicial, Hash<G> tabela) { }

	public int obterIndice(int indiceInicial, Hash<G> tabela, G conteudo) { }
}
