package br.edu.cs.poo.desafio20251;

public class ElementoLista {
	private ElementoLista proximo;
	private String conteudo;
	public ElementoLista(ElementoLista proximo, String conteudo) {
		this(conteudo);
		this.proximo = proximo;
	}
	public ElementoLista(String conteudo) {		
		this.conteudo = conteudo;
	}
	public ElementoLista getProximo() {
		return proximo;
	}
	public void setProximo(ElementoLista proximo) {
		this.proximo = proximo;
	}
	public String getConteudo() {
		return conteudo;
	}
}