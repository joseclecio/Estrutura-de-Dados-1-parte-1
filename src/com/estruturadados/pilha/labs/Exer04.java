package com.estruturadados.pilha.labs;
//Estrutura de Dados e Algoritmos com Java: Pilhas: Exer 04 Stack de Livros

//Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack da API Java.
//1. Crie uma pilha com capacidade para 20 livros;
//2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e autor.
//3. Crie um exemplo para utilizar cada método da classe Pilha.

import java.util.Stack;

public class Exer04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Livro 1111111");
        livro1.setAutor("Autor 1111");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("DSKJJNKJSDNJK");

        Livro livro2 = new Livro();
        livro2.setNome("Livro 222222");
        livro2.setAutor("Autor 22222");
        livro2.setAnoLancamento(2012);
        livro2.setIsbn("KLLJAKJLD");

        Livro livro3 = new Livro();
        livro3.setNome("Livro 3333");
        livro3.setAutor("Autor 3333");
        livro3.setAnoLancamento(2020);
        livro3.setIsbn("IJNDICNIUNC");

        Livro livro4 = new Livro();
        livro4.setNome("Livro 444444");
        livro4.setAutor("Autor 4444444");
        livro4.setAnoLancamento(2015);
        livro4.setIsbn(",MNC,MZNXC,MNZ");

        Livro livro5 = new Livro();
        livro5.setNome("Livro 555555");
        livro5.setAutor("Autor 555555");
        livro5.setAnoLancamento(2014);
        livro5.setIsbn("OWEIJOFIJO");

        Livro livro6 = new Livro();
        livro1.setNome("Livro 666666");
        livro6.setAutor("Autor 666666");
        livro6.setAnoLancamento(2011);
        livro6.setIsbn("LKMSLKASLDKJALDK");

        System.out.println("Pilha de livros criada, pilha está vazia? "+pilha.isEmpty());

        System.out.println("Empilhando livros na pilha: ");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size()+" livros foram empilhados: ");
        System.out.println("Espiando o topo da pilha "+ pilha.peek());
        System.out.println("Desempilhando livros da pilha");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro:  " +pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: "+pilha.isEmpty());

    }
}
