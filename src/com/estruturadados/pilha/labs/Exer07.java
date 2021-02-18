package com.estruturadados.pilha.labs;
//Estrutura de Dados e Algoritmos com Java: Pilhas: Exer 07 Desafio conversão decimal-binário

import com.estruturadados.pilha.Pilha;

//Usando a classe Pilha ou Stack, desenvolva um algoritmo que
// faça a conversão de números decimais para binário.
public class Exer07 {
    public static void main(String[] args) {

        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);
        imprimeQualquerBase(25, 16);
        imprimeQualquerBase(10035, 8);
        imprimeQualquerBase(10035, 16);

    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binario é: " + decimalBinario(numero));
    }

    public static void imprimeQualquerBase(int numero, int base) {
        System.out.println(numero + " na base " + base + " é: " + decimalQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {

        Pilha<Integer> pilha = new Pilha<>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.empilha(resto);
            numero /= 2; //numero = numero/2
        }

        while (!pilha.estaVazia()) {
            numBinario += pilha.desempilha();
        }
        return numBinario;
    }

    public static String decimalQualquerBase(int numero, int base) {

        if (base > 16) {
            throw new IllegalArgumentException();
        }

        Pilha<Integer> pilha = new Pilha<>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.empilha(resto);
            numero /= base; //numero = numero/2
        }

        while (!pilha.estaVazia()) {
            numBase += bases.charAt(pilha.desempilha());
        }
        return numBase;
    }
}
