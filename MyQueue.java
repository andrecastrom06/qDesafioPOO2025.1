package br.edu.cs.poo.desafio20251;

public class MyQueue {
	private Lista queue = new Lista();
	public String read() {
		return queue.lerPrimeiro();
	}
	public void queue(String conteudo) {
		queue.adicionarNoFim(conteudo);
	}
	public String dequeue() {
		String primeiro = queue.lerPrimeiro();
		queue.removerPrimeiro();
		return primeiro;
	}
}