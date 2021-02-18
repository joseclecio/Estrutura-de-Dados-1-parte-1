package com.estruturadados.pilha.labs;

import com.estruturadados.pilha.Pilha;

public class Exer03 {
    //Estrutura de Dados e Algoritmos com Java: Pilhas: Exer 03 Pilha de Livros

    //Utilize a classe Pilha(criada durante as aulas) e desenvolva os
    //seguintes items:
    //1- Crie uma pilha com capacidade para 20 livros;
    //2-Insora 6 livros na pilha; Cada livro contém nome, isbm, ano de lançamento e autor.
    //3- Crie um exemplo para utilizar cada método da classe Pilha.
    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<Livro>(20);

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

        System.out.println("Pilha de livros criada, pilha está vazia? "+pilha.estaVazia());

        System.out.println("Empilhando livros na pilha: ");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println(pilha.tamanho()+" livros foram empilhados: ");
        System.out.println("Espiando o topo da pilha "+ pilha.topo());
        System.out.println("Desempilhando livros da pilha");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro:  " +pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: "+pilha.estaVazia());
    }
}
