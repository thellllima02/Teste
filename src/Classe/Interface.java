package Classe;

import java.util.*;

public class Interface {

    public static void main(String[] args) {
//Adicionando informações no Elemento
        Elemento neo1 = new Elemento("Carlos 0", 1);
        Elemento neo2 = new Elemento("Carlos 1", 3);
        Elemento neo3 = new Elemento("Carlos 2", 7);
        Elemento neo4 = new Elemento("Carlos 3", 4);
        Elemento neo5 = new Elemento("Carlos 4", 2);
        Elemento neo6 = new Elemento("Carlos 5", 5);
        Elemento neo7 = new Elemento("Carlos 6", 9);
        Elemento neo8 = new Elemento("Carlos 7", 8);
        Elemento neo9 = new Elemento("Carlos 8", 6);

//Adicionando informações na Lista
        Lista lista = new Lista();
        lista.insereFila(neo1);
        lista.insereFila(neo2);
        lista.insereFila(neo3);
        lista.insereFila(neo4);
        lista.insereFila(neo5);
        lista.insereFila(neo6);
        lista.insereFila(neo7);
        lista.insereFila(neo8);
        lista.insereFila(neo9);

//Saida
        System.out.println("------Original------");
        System.out.println(lista.toString() + "Tamanho = " + lista.tamanho() + "\n");
//Criando uma pilha de fila
        Lista pilha = new Lista();

//Caso a pilha estiver fazia
        if (pilha.vazia()) {
            pilha.insere(lista.ultimo());//Recebe elemento como parametro
            lista.apagar(lista.tamanho() - 1);//Recebe int como parametro
        }

//forma de adicionar em ordem do menor ao maior
        int roda = lista.tamanho();
        int contW = 0, contIf = 0, contEl = 0, contfor = 0;//Forma de controle e inspeção 
        while (!lista.vazia()) {
            contW++;

            for (int e = 0; e < lista.tamanho(); e++) {
                contfor++;
                Elemento elementoAtual = (Elemento) lista.pega(0);
                Elemento PilhaAtual = (Elemento) pilha.pega(e);
                if (elementoAtual.getID() >= PilhaAtual.getID()) {
                    contIf++;
                    pilha.insereLocal(e, elementoAtual);
                    lista.removeInicio();
                    break;
                } else {
                    contEl++;
                    pilha.insereLocal(e + 1, elementoAtual);
                    lista.removeInicio();
                    break;
                }

            }
        }
//Saida da pilha em ordem
        System.out.println("------Ordem------");
        System.out.println(pilha.toString() + "Tamanho = " + pilha.tamanho() + "\n");
        System.out.println("------Lista------");
        System.out.println(lista.toString() + "Tamanho = " + lista.tamanho() + "\n");
        System.out.println("Quantia do while " + contW);
        System.out.println("Quantia do if " + contIf);
        System.out.println("Quantia do else " + contEl);

    }
}

