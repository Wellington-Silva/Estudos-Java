package br.edu.ifs.ed2.dados.hash.espalhamento;

public class EspalhamentoDivisao<G> implements EstrategiaEspalhamento<G> {
	@Override
	public int calcularIndice(int chave, int tamanho) {
		int indice =  (chave % 0x7FFFFFFF) % tamanho;
		return indice;
	}
}
