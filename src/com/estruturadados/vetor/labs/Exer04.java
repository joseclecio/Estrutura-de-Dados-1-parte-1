package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;

public class Exer04 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 04 método obtém (get)

    //Melhore a classe Lista e implemente o método obtem(int posicao),
    // onde será possível obter o elemento dada uma posição do vetor.
    // Esse método é semelhante ao método get(int posicao) da
    // classe ArrayList.
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));


    }
}
