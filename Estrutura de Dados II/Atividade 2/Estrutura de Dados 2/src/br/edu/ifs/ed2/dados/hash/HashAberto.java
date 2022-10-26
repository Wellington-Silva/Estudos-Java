package br.edu.ifs.ed2.dados.hash;

import br.edu.ifs.ed2.dados.hash.chave.EstrategiaChave;
import br.edu.ifs.ed2.dados.hash.colisao.EstrategiaColisao;
import br.edu.ifs.ed2.dados.hash.espalhamento.EstrategiaEspalhamento;

public class HashAberto<G> extends Hash<G> {
	private G tabela[];
	private String estado[];

	@SuppressWarnings("unchecked")
	public HashAberto(int tamanho, EstrategiaChave<G> chave, EstrategiaEspalhamento<G> espalhamento, EstrategiaColisao<G> colisao) {
		super(tamanho, chave, espalhamento, colisao);
		this.setEstado(new String[tamanho]);
		this.setTabela((G[]) new Object[tamanho]);
	}

	@Override
	protected boolean finalizarInsercao(int indice, G conteudo) {
		if (indice < 0) return false;
		this.getEstado()[indice] = null;
		this.getTabela()[indice] = conteudo;
		return true;
	}

	@Override
	protected boolean finalizarRemocao(int indice, G conteudo) {
		if (indice < 0) return true;
		this.getEstado()[indice] = null;
		this.getTabela()[indice] = null;
		return true;
	}

	public G[] getTabela() return this.tabela;
	private void setTabela(G tabela[]) this.tabela = tabela;
	public String[] getEstado() return this.estado;
	private void setEstado(String estado[]) this.estado = estado;

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < this.getTamanho(); ++i) {
			if (this.getTabela()[i] == null) {
				s.append("-").append("\n");
				continue;
			}
			if (this.getTabela()[i].equals("R")) {
				s.append("-").append("\n");
				continue;
			}
			s.append(this.getTabela()[i]).append("\n");
		}
		return s.toString();
	}
}