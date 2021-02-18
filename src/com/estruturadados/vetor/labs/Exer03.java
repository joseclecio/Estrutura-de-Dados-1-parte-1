package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;

public class Exer03 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 03 método remove elemento

    //Mrlhore a classe Lista e implemente o método
    // remove(T elemento), onde será possivel remover um
    // elemento da lista passando o mesmo como parâmentro.
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        System.out.println(lista);

        lista.remove("A");
        System.out.println(lista);
        lista.remove("E");
        System.out.println(lista);
        lista.remove("C");
        System.out.println(lista);

    }
}
