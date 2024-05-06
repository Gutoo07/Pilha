package model;
import model.No;
import java.lang.Exception;

public class Pilha<T> {
	private No<T> ultimo = null;
	
	//push : adiciona novo elemento no topo
	//pop : remove elemento do topo
	
	public void push(T valor) {
		No<T> novo = new No<>(valor);
		if (this.ultimo == null) {
			this.ultimo = novo;
		} else {
			//novo.setAnterior(this.ultimo);
			//this.ultimo = novo;
			No<T> anterior = this.ultimo;
			novo.setAnterior(anterior);
			this.ultimo = novo;
		}
	}
	public No<T> pop() throws IllegalArgumentException {
		if (this.ultimo == null) {
			throw new IllegalArgumentException("Lista vazia.");
		} else {
			No<T> buffer = this.ultimo;
			this.ultimo = this.ultimo.getAnterior();
			return buffer;
		}
	}
	@Override
	public String toString() throws IllegalArgumentException {
		if (this.ultimo == null) {
			throw new IllegalArgumentException("Lista vazia.");
		} else {
			StringBuilder builder = new StringBuilder("[");
			No<T> buffer = this.ultimo;
			builder.append(buffer.getValor());
			while (buffer.getAnterior() != null) {
				builder.append(",");
				buffer = buffer.getAnterior();
				builder.append(buffer.getValor());
			}
			builder.append("]");
			return builder.toString();
		}
	}
}