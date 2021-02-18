package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;

public class Exer01 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 01 método contém

    //Melhore a classe Lista e implemente o método contém,
    // semelhando ao método contains da classa ArrayList.
    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}
