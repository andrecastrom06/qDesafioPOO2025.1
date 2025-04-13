package br.edu.cs.poo.desafio20251;

public class Lista {
	private ElementoLista primeiro;
	public void adicionarNoFim(String conteudo) {
		ElementoLista novo = new ElementoLista(conteudo);
		if (primeiro == null) {
			primeiro = novo;
		} else {
			ElementoLista ultimo = irParaUltimo();
			ultimo.setProximo(novo);
		}
	}
	public String lerUltimo() {
		if (primeiro != null) {
			return irParaUltimo().getConteudo();
		}
		return null;
	}
	public void removerPrimeiro() { 
		if (primeiro != null) {
			primeiro = primeiro.getProximo();
		}
	}
	private ElementoLista irParaUltimo() {
		if (primeiro == null) {
			return null;
		}
		ElementoLista ax = primeiro;
		while(ax.getProximo() != null) {
			ax = ax.getProximo();
		}
		return ax;
	}
	public void removerUltimo() {
		if (primeiro != null) {
            if (primeiro.getProximo() == null) {
                primeiro = null;
            } else {
                ElementoLista aux = primeiro;
                while(aux.getProximo().getProximo() != null) {
                    aux = aux.getProximo();
                }
                aux.setProximo(null);
            }
        }
	}
    
	public void adicionarNoInicio(String conteudo) {
        ElementoLista novo = new ElementoLista(primeiro, conteudo);
        primeiro = novo;
 	}
	public String lerPrimeiro() {
		if (primeiro != null) {
            return primeiro.getConteudo();
        }
		return null;
	}
}