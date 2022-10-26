package br.edu.ifs.ed2.dados.hash.chave;

public class ChaveTextual implements EstrategiaChave<String> {

	@Override
	public int gerarChave(String conteudo) {
		int chave = 0;
		for (int i = 0; i < conteudo.length(); ++i) {
			chave += conteudo.charAt(i)*(int) Math.pow(31,conteudo.length()-1-i);
		return chave;
	}
}
