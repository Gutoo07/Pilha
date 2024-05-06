package model;

public class No<T> {
	private No<T> anterior;
	private T valor;
	
	public No (T valor) {
		this.valor = valor;
		this.anterior = null;
	}
	public No (T valor, No<T> anterior) {
		this.valor = valor;
		this.anterior = anterior;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public T getValor() {
		return this.valor;
	}
	public void setAnterior (No<T> anterior) {
		this.anterior = anterior;
	}
	public No<T> getAnterior() {
		return this.anterior;
	}
	@Override
	public String toString() {
		return this.valor.toString();
	}
}