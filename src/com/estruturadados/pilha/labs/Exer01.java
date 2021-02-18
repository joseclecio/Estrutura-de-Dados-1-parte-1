package com.estruturadados.pilha.labs;

import com.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {
    //Estrutura de Dados e Algoritmos com Java: Pilhas: Exer 01 Empilha e desempilha

    //Escreva um programa que leia 10 números. para cada número lido,
    // verifique e codifique de acordo com as regas a seguir:
    //-Se o número for par, empilhe na pilha.
    //-Se o número for ímpar, desempilhe um número da pilha.
    // Caso a pilha esteja vazia, mostre uma mensagem.
    //Se ao final do programa a pilha não estiver vazia, desempilhe
    // todos os elementos, imprimindo-os na tela.
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Numero ímpar, desempilhando um elemento da pilha: " + desempilhado);
                }
            }
        }
        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {

            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());

        }
        System.out.println("Todos os elementos foram desempilhados!");
    }
}

