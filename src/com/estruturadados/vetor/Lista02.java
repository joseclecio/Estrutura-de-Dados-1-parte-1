package com.estruturadados.vetor;

import base.EstruturaEstatica;

public class Lista02<T> extends EstruturaEstatica<T> {

    public Lista02(){
        super();
    }

    public Lista02(int capacidade){
        super(capacidade);
    }

    public boolean adiciona(T elemento) {
    return super.adiciona(elemento);
    }

    public boolean adicionaQualquerPosicao(int posicao, T elemento) {
    return super.adicionaQualquerPosicao(posicao,elemento);
    }
}
