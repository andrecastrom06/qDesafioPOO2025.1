package br.edu.cs.poo.desafio20251;

public class MyStack {
	private Lista stack = new Lista();
	public String read() {
		return stack.lerUltimo();
	}
	public void push(String conteudo) {
		stack.adicionarNoFim(conteudo);
	}
	public String pop() {
		String ultimo = stack.lerUltimo();
		stack.removerUltimo();
		return ultimo;
	}
}