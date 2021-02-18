package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer05 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 05 remover todos elementos (clear)

    //Melhore a classe Lista e implemente o método limpar onde todos
    // os elementos da lista são removidos. Esse método é semelhante
    // ao método clear da classe ArrayList.
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);//pode excluir

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);


        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
    }
}
