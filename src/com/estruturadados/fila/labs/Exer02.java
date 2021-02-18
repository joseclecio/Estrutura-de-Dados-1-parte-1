package com.estruturadados.fila.labs;

import com.estruturadados.fila.Fila;

//Escreva um programa que simule a distribuição de senhas de atendimento
//a um grupo de pessoas. Cada pessoa pode receber uma senha prioritaria ou
//uma senha normal. O programa deve obedecer os seguintes critérios:
//-Existe apenas 1 atendente;
//1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
//Não havendo prioridades, as pessoas com senha normal podem ser atendidas.
public class Exer02 {
    public static void main(String[] args) {

        Fila<String> regular = new Fila();
        Fila<String> prioridades = new Fila();

        final int MAX_PRIORIDADE = 3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");
        prioridades.enfileira("Pessoa 1P");
        prioridades.enfileira("Pessoa 2P");
        prioridades.enfileira("Pessoa 3P");
        prioridades.enfileira("Pessoa 4P");
        prioridades.enfileira("Pessoa 5P");
        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");
        regular.enfileira("Pessoa 7");
        regular.enfileira("Pessoa 8");

        while (!regular.estaVazia()||prioridades.estaVazia()){
            int cont = 0;
            while (!prioridades.estaVazia() && cont<MAX_PRIORIDADE){
              atendePessoa(prioridades);
                cont++;
            }
            if (!regular.estaVazia()){
               atendePessoa(regular);
            }
            if (prioridades.estaVazia()){
                while (!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }

    }
    public static void atendePessoa(Fila<String> fila){
        String pessoaAtendida = fila.desenfileira();
        System.out.println(pessoaAtendida+" foi atendida. ");
    }
}
