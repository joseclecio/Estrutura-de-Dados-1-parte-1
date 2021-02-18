package com.estruturadados.vetor.labs;

import com.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer02 {
    //Estrutura de Dados e Algoritmos com Java: Vetores e Arrays: Exer 02 método último Indice

    //Melhore a classe Lista implementando o método ultimoIndice,
    // semelhante ao méetodo lastIndexOf da classe ArrayList.
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));

    }
}
