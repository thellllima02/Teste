package Classe;

import java.util.LinkedList;

public class Lista<Elemento> {

    private LinkedList<Elemento> lista = new LinkedList<Elemento>();

    public void insereFila(Elemento obj) {
        this.lista.addLast(obj);
    }

    public void insere(Elemento obj) {
        this.lista.addFirst(obj);
    }

    public void insereLocal(int numero, Elemento obj) {
        this.lista.add(numero, obj);
    }

    public String toString() {
        return this.lista.toString();
    }

    public int tamanho() {
        return this.lista.size();
    }

    public Elemento pega(int numero) {
        return (Elemento) this.lista.get(numero);
    }
    public Elemento pegaProximo(int numero) {
        return (Elemento) this.lista.get(numero+1);
    }

    public boolean vazia() {
        return this.lista.isEmpty();
    }

    public Elemento ultimo() {
        return (Elemento) this.lista.getLast();
    }

    public Elemento apagar(int o) {
        return (Elemento) this.lista.remove(o);
    }
    public Elemento removeInicio() {
        return this.lista.removeFirst(); 
    }
}
