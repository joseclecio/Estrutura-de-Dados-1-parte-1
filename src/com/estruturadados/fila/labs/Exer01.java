package com.estruturadados.fila.labs;
//Estrutura de Dados e Algoritmos com Java: Filas: Exer 01 Impressão de Documentos

import com.estruturadados.fila.Fila;

//usando a estrutura de dados Fila, crie uma fila de documentos que precisam ser impressos.
//Cada documento é composto de um nome e quantidade de folhas a serem impressas. o programa deve:
//Enfileirar os documentos;
//E seguindo a ordem, o programa deve "imprimir" cada documento, desenfileirando da fila.
//Se desejar usar Threads para esprar a impressão de acordo com o número de folhas a serem impressas.
public class Exer01 {
    public static void main(String[] args) {

        Fila<Documento> filaImpressora = new Fila();

        filaImpressora.enfileira(new Documento("A", 1));
        filaImpressora.enfileira(new Documento("B", 2));
        filaImpressora.enfileira(new Documento("C", 3));
        filaImpressora.enfileira(new Documento("D", 7));
        filaImpressora.enfileira(new Documento("E", 9));

        while (!filaImpressora.estaVazia()){
            Documento doc = filaImpressora.desenfileira();
            System.out.println("Inprimindo documento "+doc.getNome());
            try {
                Thread.sleep(200 * doc.getNumFolhas());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os documentos foram impressos!");
    }
}
