package br.edu.cs.poo.desafio20251;

public class ProgramaTesteFilaPilha {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.queue("A1");		
		queue.queue("A2");
		queue.queue("A3");
		queue.queue("A4");
		System.out.println("read    - " + queue.read());	
		System.out.println("dequeue -" + queue.dequeue());
		System.out.println("read    - " + queue.read());
		System.out.println("dequeue -" + queue.dequeue());
		System.out.println("read    - " + queue.read());
		System.out.println("dequeue -" + queue.dequeue());
		System.out.println("read    - " + queue.read());
		System.out.println("dequeue -" + queue.dequeue());
		System.out.println("read    - " + queue.read());
		MyStack stack = new MyStack();
		stack.push("B1");		
		stack.push("B2");
		stack.push("B3");
		stack.push("B4");
		System.out.println("read - " + stack.read());
		System.out.println("pop  -" + stack.pop());
		System.out.println("read - " + stack.read());
		System.out.println("pop  -" + stack.pop());
		System.out.println("read - " + stack.read());
		System.out.println("pop  -" + stack.pop());
		System.out.println("read - " + stack.read());
		System.out.println("pop  -" + stack.pop());		
		System.out.println("read - " + stack.read());
	}
}