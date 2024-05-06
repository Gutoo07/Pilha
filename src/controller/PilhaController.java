package controller;
import model.Pilha;

public class PilhaController {
	public PilhaController() {
		super();
	}
	public void teste() {
		Pilha pilha = new Pilha();
		
		pilha.push(7);
		pilha.push(14);
		System.out.println(pilha.toString());
		
		pilha.pop();
		System.out.println(pilha.toString());
		
		System.out.println(pilha.pop().getValor());
	}
}
