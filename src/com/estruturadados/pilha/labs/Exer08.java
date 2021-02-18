package com.estruturadados.pilha.labs;
//Estrutura de Dados e Algoritmos com Java: Pilhas: Exer 08 Desafio Torre de Hanoi

import com.estruturadados.pilha.Pilha;

//Usando a classe Pilha ou Stack, desenvolva um algoritmo
// que resolva o quebra cabeça Torre de Hanoi.
public class Exer08 {
    public static void main(String[] args) {

        Pilha<Integer> original = new Pilha<>();
        Pilha<Integer> destino = new Pilha<>();
        Pilha<Integer> aux = new Pilha<>();

        original.empilha(3);
        original.empilha(2);
        original.empilha(1);

        torraDeHanoi(original.tamanho(), original, destino, aux);

    }

    public static void torraDeHanoi(int n, Pilha<Integer> original,
                                    Pilha<Integer> destino, Pilha<Integer> aux) {
        if (n > 0) {
            torraDeHanoi(n - 1, original, aux, destino);
            destino.empilha(original.desempilha());
            System.out.println("--------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Aux: " + aux);
            torraDeHanoi(n - 1, aux, destino, original);
        }

    }
}
