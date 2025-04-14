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
		if (primeiro != null) { //Verificando se tem elementos na lista
            if (primeiro.getProximo() == null) { // Se só tem um elemento na lista
                primeiro = null; // A lista fica vazia
            } else {
                ElementoLista aux = primeiro; //Colocando variavel auxiliar para percorrer a lista sem perder a referencia do primeiro elementoe
                while(aux.getProximo().getProximo() != null) {//getProximo().getProximo() vai ser pra chegar no penultimo elemento, já que o proximo elemento é o ultimo e o prox prox é null
                    aux = aux.getProximo(); // Percorrendo a lista até o ult elemento
                }
                aux.setProximo(null);
            }
        }
	}


    
	public void adicionarNoInicio(String conteudo) {
        ElementoLista novo = new ElementoLista(primeiro, conteudo); //Cria novo nó e adicona o próximo dele para o primeiro
        primeiro = novo; //O primeiro nó da lista vira o que acabou de ser criado
 	}
	public String lerPrimeiro() {
		if (primeiro != null) { //Se houver conteúdo na lista
            return primeiro.getConteudo();// retorna o conteúdo do primeiro
        }
		return null; //Se não tiver nada retorna NULL
	}
}
