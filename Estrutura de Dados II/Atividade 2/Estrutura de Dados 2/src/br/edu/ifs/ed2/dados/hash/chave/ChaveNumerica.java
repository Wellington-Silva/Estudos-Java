package br.edu.ifs.ed2.dados.hash.chave;

public class ChaveNumerica implements EstrategiaChave<Integer> {

	@Override
	public int gerarChave(Integer conteudo) {
		int chave = 0;
		chave = Math.abs(conteudo);
		return chave;
	}
}